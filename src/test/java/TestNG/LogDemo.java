package TestNG;

import java.util.List;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {

public static void main(String[] args) {
// TODO Auto-generated method stub
Logger logger=Logger.getLogger("LogDemo");
PropertyConfigurator.configure("Log4j.properties");

System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Sample\\src\\main\\resources\\binaries\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

logger.info("Chrome Driver Opened");

driver.get("https://www.w3schools.com/html/html_tables.asp");

logger.info("Navigated to URL");

driver.manage().window().maximize();

logger.info("Browser Maximized");

System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Alfreds Futterkiste')]")).getText());

WebElement table=driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']"));

List<WebElement> listOfDataInTable=table.findElements(By.tagName("td"));


System.out.println(listOfDataInTable.size());



}

}
