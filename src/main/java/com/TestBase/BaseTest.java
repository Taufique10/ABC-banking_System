package com.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    public static void launch_chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void openURL(String URL){
        driver.get(URL);
    }

    public static void Close_Chrome(){
        driver.close();
    }

    public static void smallWait(){
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void MediumWait(){
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void LongWait(){
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void CustomWait(int milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void implicitWait(int Seconds){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public String getPageTittle(){
        return driver.getTitle();
    }

    public String getPageUrl(){
        return driver.getCurrentUrl();
    }
}



