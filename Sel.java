package selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		    driver = new FirefoxDriver();
		    baseUrl = "http://121.193.130.195:8080";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }

		  @Test
		  public void testFinal() throws Exception {
		    driver.get(baseUrl + "/");
		    driver.findElement(By.id("name")).clear();
		    driver.findElement(By.id("name")).sendKeys("3014218152");
		    driver.findElement(By.id("pwd")).clear();
		    driver.findElement(By.id("pwd")).sendKeys("218152");
		    driver.findElement(By.id("submit")).click();
		    Thread.sleep(1000000);
		  }

	  
	  
	}
