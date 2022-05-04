package Parabank.application;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class App 
{ public static WebDriver driver;

    public void drivertype(String drivername) {
    	if(drivername.equalsIgnoreCase("Chrome")) {
    		System.setProperty("webdriver.chrome.driver","C:\\Users\\harsh\\eclipse-workspace\\car_wash_services\\driver\\chromedriver.exe");
    	  driver=new ChromeDriver();  
    	}
    	
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void url(String url) {
    	driver.get(url);
    }
    public void click(String xpath) {
    	driver.findElement(By.xpath(xpath)).click();
    }
    public void enter(String xpath,String value) {
    	driver.findElement(By.xpath(xpath)).sendKeys(value);
    }
    public void close() {
    	driver.close();
    }
    
}
