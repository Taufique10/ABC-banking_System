package com.ABCBanking;

import com.TestBase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewCustomerTest extends BaseTest {

     public static void main(String[] args){

         System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
         ChromeOptions opt=new ChromeOptions();
         opt.setAcceptInsecureCerts(true);
         driver=new ChromeDriver(opt);
         driver.manage().window().maximize();

         openURL("https://demo.guru99.com/v4/index.php");
         LogIn();
         smallWait();
         Test_Case01();
         Test_Case02();
         Test_Case03();
         Test_Case04();
         Test_Case05();
         Test_Case06();
         Test_Case07();
         Test_Case08();
         Test_Case09();



    }

    public static void LogIn(){
         WebElement UserId= driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]"));
         UserId.clear();
         UserId.sendKeys("mngr354836");

         WebElement Password1= driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=password]"));
         Password1.clear();
         Password1.sendKeys("jAzEvUd");

         WebElement LoginBtn= driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
         LoginBtn.click();

         WebElement NewCustomer= driver.findElement(By.cssSelector("body > div:nth-child(7) > div > ul > li:nth-child(2) > a"));
         NewCustomer.click();
    }

    public static void Test_Case01() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Anuli Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("09011991");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("105022");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("01743192588");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("Anutan4343907@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("221600");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 01 Pass");
        } else {
            System.out.println("Test Case 01 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void Test_Case02() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Sabbirrrrrrrrrrrrrrrrrrr Hasanaaaaaaaaaaaaaaaaaaaaabbbbbb");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("06021990");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("232021");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("01798124307");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("sabbir43@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("031122");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 02 Pass");
        } else {
            System.out.println("Test Case 02 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void Test_Case03() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Santo Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("04051995");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhakaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("101021");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("0175642684");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("santokhasan219@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("333333");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 03 Pass");
        } else {
            System.out.println("Test Case 03 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void Test_Case04() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Elora Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("12011990");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhakatttttttttttttttttttttttttttttttttttttt");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("171091");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("0160747679");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("elora@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("904321");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 04 Pass");
        } else {
            System.out.println("Test Case 04 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();


    }

    public static void Test_Case05() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Zakaria Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("08011997");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhakaytttttttttttttzzzzzzzzzzzzwwwwweeeerrrrsssw");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("101121");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("01532906753");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("zakaria@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("020202");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 05 Pass");
        } else {
            System.out.println("Test Case 05 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void Test_Case06() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Sovon Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("111011990");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("1010211");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("0180356279");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("rajin@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 06 Pass");
        } else {
            System.out.println("Test Case 06 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void Test_Case07() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Saoun Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("03012002");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("101032");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("01900765322790000");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("saoun@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("113333");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 07 Pass");
        } else {
            System.out.println("Test Case 07 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }

    public static void Test_Case08() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Ullash Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("04011990");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("101077");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("0170245827");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("ullashhhhjhhhhhhhhhhhhhhh@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("331111");

        WebElement Submit = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Submit.click();

        String Expected_Tittle = "Guru99 Bank Customer Registration Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 08 Pass");
        } else {
            System.out.println("Test Case 08 Failed");
        }

        WebElement New_Customer = driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a"));
        New_Customer.click();

    }
    public static void Test_Case09() {
        WebElement Name = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        Name.clear();
        Name.sendKeys("Soumik Hasan");

        WebElement Gender = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement BirthDate = driver.findElement(By.cssSelector("#dob"));
        BirthDate.clear();
        BirthDate.sendKeys("03011990");

        WebElement Address = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.clear();
        Address.sendKeys("Dhaka");

        WebElement City = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement Pin = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        Pin.clear();
        Pin.sendKeys("101021");

        WebElement Mobile = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        Mobile.clear();
        Mobile.sendKeys("0160346279");

        WebElement Email = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        Email.clear();
        Email.sendKeys("soumikhasan19@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=password]"));
        Password.clear();
        Password.sendKeys("333333");

        WebElement Reset = driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(14) > td:nth-child(2) > input[type=reset]:nth-child(2)"));
        Reset.click();

        String Expected_Tittle = "Guru99 Bank New Customer Entry Page";
        String Actual_Tittle = driver.getTitle();
        if (Expected_Tittle.equals(Actual_Tittle)) {
            System.out.println("Test Case 09 Pass");
        } else {
            System.out.println("Test Case 09 Failed");
        }

    }
}
