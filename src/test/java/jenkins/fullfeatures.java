package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class fullfeatures {

WebDriver driver;

@When("i enter opens the chrome and opens the testme app")
public void i_enter_opens_the_chrome_and_opens_the_testme_app() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
    driver =new ChromeDriver();
	  driver.manage().window().maximize(); 
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}
@When("i clicks signin")
public void i_clicks_signin() {
	driver.findElement(By.linkText("SignIn")).click();
}

@When("i enters the username")
public void i_enters_the_username() {
	driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Lalitha");
}

@When("i enters the password")
public void i_enters_the_password() {
	driver.findElement(By.name("password")).sendKeys("Password123");
}

@When("i clicks thelogin button")
public void i_clicks_thelogin_button() {
	driver.findElement(By.name("Login")).click();
}

@When("find the products in search box")
public void find_the_products_in_search_box() {
	  driver.findElement(By.id("myInput")).sendKeys("Headphone");
}

@Then("clicks the find details button")
public void clicks_the_find_details_button() {
	  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	 String b= driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText();
      Assert.assertFalse(b,false);
}
}
