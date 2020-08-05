import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
public static WebDriver driver;

@BeforeSuite
public void setUp() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\chakradhar guguloth\\Downloads\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
	driver= new FirefoxDriver();
}
@Test
public void doLogin() {
	driver.get("http://gmail.com");
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("gugulothchakradhar1994");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
	/*WebDriverWait wait = new WebDriverWait (driver, 10);
	WebElement password= driver.findElement(By.name("password"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	password.sendKeys("9440120862csac");
	
	//driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("9440120862csac");*/
	
}
@AfterSuite
public void tearDown() {
	driver.quit();
}
}
