package case1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step {
    WebDriver c;
	@When("Login into app")
	public void a1() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium3.0\\\\SeleniumJars\\\\Drivers\\\\chromedriver.exe");
	   c=new ChromeDriver();
	   c.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   c.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	   Thread.sleep(3000);	
	   
	}
	
	@Then("Enter username {word}")
	public void b(String h1) {
	   c.findElement(By.name("userName")).sendKeys(h1);
	}
	@Then("Enter firstname {word}")
	public void c(String h2) {
	   c.findElement(By.name("firstName")).sendKeys(h2);
	}
	 @Then("Enter lastname {word}") 
	 public void c1(String h3) {
	   c.findElement(By.name("lastName")).sendKeys(h3);
	}
	
	@Then("Enter password")
	public void d() {
		System.out.println("passsssssssss");
	   c.findElement(By.name("password")).sendKeys("hii123456");
	   c.findElement(By.name("confirmPassword")).sendKeys("hii123456");
	}
	@Then("Enter gender")
	public void e() {
	   List<WebElement> l =c.findElements(By.name("gender"));
	   l.get(1).click();
	}
	@Then("Enter contact")
	public void f() {
	
	   c.findElement(By.name("emailAddress")).sendKeys("hii@gmail.com");
	   c.findElement(By.name("mobileNumber")).sendKeys("3434435353");
	   c.findElement(By.name("dob")).sendKeys("03/03/1998");
	   c.findElement(By.name("address")).sendKeys("hii hjbng jfng jnfjk jn");
	}
	@And("Enter sec ques")
	public void g() {
	   WebElement dropdown=c.findElement(By.name("securityQuestion"));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
		
	   c.findElement(By.name("answer")).sendKeys("black");
	}
}
