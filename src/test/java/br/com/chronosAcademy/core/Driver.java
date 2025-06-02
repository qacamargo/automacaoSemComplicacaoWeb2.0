package br.com.chronosAcademy.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
    private WebDriver driver;

    public Driver(String navegador){
        switch (navegador){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
    }

    public WebDriver getDriver(){
        return driver;
    }
}

// Quando a automação for com um navegador, sem a necessidade de usar uma String com para outros navegadores

//public class testeWeb {
//  ChromeDriver driver;
//  @Before
//  public void inicializaTeste(){
//     WebDriverManager.chromedriver().setup();
//     driver = new ChromeDriver();
//     driver.manage().window().maximize();
//    driver.get ("https://www.chronosacademy.com.br");
//    }