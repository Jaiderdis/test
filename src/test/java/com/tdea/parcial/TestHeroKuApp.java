package com.tdea.parcial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestHeroKuApp {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/ChromeDriver/chromedriver.exe");

        driver=new ChromeDriver();
        
        
    }

    @Test
    void seDeberiaAñadir1ElementoYborrarlo() {
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement buttom= driver.findElement(By.tagName("Button"));
        buttom.click();
        buttom=driver.findElement(By.className("added-manually"));
        buttom.click();
        driver.close();


    }

    @Test
    void deberiaDescargarsomefile() {
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/download");

        WebElement link=driver.findElement(By.linkText("some-file.txt"));
        link.click();
    }

    @AfterEach
    void tearDown() {

    }
}
