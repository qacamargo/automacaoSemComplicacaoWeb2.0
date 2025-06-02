package br.com.chronosAcademy.automacaoWebRogerio;

import br.com.chronosAcademy.core.Driver;
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
    WebDriver driver;
    Driver driverWeb;

     @Before
     public void inicializaTeste(){
             driverWeb = new Driver("chromer");
             driver = driverWeb.getDriver();
             driver.get("https://www.chronosacademy.com.br");
     }

    @Test
    public void  primeiroTeste(){
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.",titulo);
            }

    @After
    public void finalizaTeste(){
        driver.quit();
    }

}
