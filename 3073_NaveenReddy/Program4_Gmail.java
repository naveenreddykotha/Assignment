package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program4_Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for some reasons the google security it is not accepting the third party login process for my account
		//but the working process below is correct...
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //driving into the google login page
	    driver.get("https://accounts.google.com/");
	    
	    //username
	    driver.findElement(By.id("identifierId")).sendKeys("naveenreddykotha7@gmail.com");
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	    driver.findElement(By.xpath("input[name='password']")).sendKeys("Kotha@95267");
	    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	    //Actually here google is not accepting to login the accounts but the process is correct
	    driver.findElement(By.xpath("//img[@class='gb_k gbii']")).click();
	    //here the signout btn is hidden from the developers point
	    driver.findElement(By.className("SedFmc")).click();

	}

}
