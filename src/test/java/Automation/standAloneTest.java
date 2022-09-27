package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class standAloneTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://Rahulshettyacademy.com/client");
		System.out.println("Test1 Passes1");
		System.out.println("Test1 Passes2");
		System.out.println("Test1 Passes3");

	}

}
