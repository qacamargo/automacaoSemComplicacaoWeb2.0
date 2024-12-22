package br.com.chronosAcademy.automacaoWebSarah;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class testeWeb {

    ChromeDriver driver;

    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
    }

    @Test
    public void primeiroTeste() {
        String xpathTitulo = "/html/body/div/div/div/section[2]/div[3]/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.", titulo);
    }

    @Test
    public void segundoTeste() {
        String xpathTitulo = "/html/body/div/div/div/section[9]/div[3]/div/div/div/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Os Nossos Resultados São Espelho De Nossas Atitudes.", titulo);
    }

@After
    public void encerraTeste(){
    driver.quit();
    }
}








