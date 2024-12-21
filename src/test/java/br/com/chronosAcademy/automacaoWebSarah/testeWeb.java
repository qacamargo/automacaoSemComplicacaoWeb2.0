package br.com.chronosAcademy.automacaoWebSarah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class testeWeb {

    @Test

    public void primeiroTeste() {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
        String xpathTitulo = "/html/body/div/div/div/section[2]/div[3]/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.", titulo);
        driver.quit();
    }

    @Test

    public void segundoTeste() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br/#down");
        String xpathTitulo = "/html/body/div/div/div/section[9]/div[3]/div/div/div/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Os Nossos Resultados São Espelho De Nossas Atitudes.", titulo);
        driver.quit();
    }

}








