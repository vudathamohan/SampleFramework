package CTS;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation{

public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Sample\\src\\main\\resources\\binaries\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

WebDriverWait wait=new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
String data=driver.findElement(By.xpath("//p[text()='WebDriver']")).getText();
System.out.println(data);

}

}


