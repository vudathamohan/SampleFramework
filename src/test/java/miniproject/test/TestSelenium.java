package miniproject.test;


import org.testng.annotations.Test;
import miniproject.utility.configReader;

import java.io.ObjectInputFilter.Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;




public class TestSelenium {
configReader config;
@BeforeTest
public void setup() {

config=new configReader();

System.setProperty("webdriver.chrome.driver", config.getchromepath());

System.out.println("Set up is Ready");

}

@Test
public void testchrome() {
System.out.println("Navigate to URL");
WebDriver driver=new ChromeDriver();
driver.get(config.getApplicationURL());


}
}
