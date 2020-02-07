package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement categoryCombo = driver.findElement(By.xpath("//html/body/div[2]/div[2]/nav/div/div[1]/div/div/form/div[2]/div/select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("//html/body/div[2]/div[2]/nav/div/div[1]/div/div/form/input"));
        inputField.sendKeys("mavic mini");
        inputField.submit();
    }
}