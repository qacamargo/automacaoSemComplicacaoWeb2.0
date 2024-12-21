package br.com.chronosAcademy.automacaoWebRogerio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class testeWeb {

    @Test

    public void  primeiroTeste(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get ("https://www.chronosacademy.com.br");

        String xpathTitulo = "/html/body/div/div/div/section[2]/div[3]/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.",titulo);
        driver.quit();
            }

            @Test
    public void segundoTeste(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver;

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get ("https://www.chronosacademy.com.br");

        String xpathTitulo = "/html/body/div/div/div/section[4]/div[2]/div/div/section/div/div[1]/div/div/div/div/div[2]/p";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Estaremos Sempre À Sua Disposição.",titulo);
        driver.quit();
            }

        @Test
    public void terceiroTestes(){
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver;

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get ("https://www.chronosacademy.com.br");

            String xpathTitulo = "/html/body/div/div/div/section[4]/div[2]/div/div/section/div/div[2]/div/div/div/div/div[2]/p";
            WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
            String titulo = txtTitulo.getText();
            assertEquals("O Melhor Time Para Você!!!",titulo);
            driver.quit();
        }
        @Test
    public void quartoTeste(){
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver;

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get ("https://www.chronosacademy.com.br");

            String xpathTitulo = "/html/body/div/div/div/section[4]/div[2]/div/div/section/div/div[3]/div/div/div/div/div[2]/p";
            WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
            String titulo = txtTitulo.getText();
            assertEquals("Seu Sucesso É Nossa Missão!!!",titulo);
            driver.quit();
        }

}
