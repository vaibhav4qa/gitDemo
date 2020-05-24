package phpTravellogin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\eclipse-workspace\\phpTravel\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/home");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals(title)) {
			System.out.println("this is home page");
		}else
		{System.out.println("something went wrong");}
		
		//book flight
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[2]/a")).click();;
		//driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[2]/div/div/div/ul/li[2]")).click();
		// verify that the “radio button” is displayed and enabled
        boolean isBtnPresence = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div[1]")).isDisplayed();
        boolean isRadEnabled = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div[1]")).isEnabled();
		System.out.println(isBtnPresence+"==and =="+isRadEnabled);
		if(isRadEnabled==true)
		{
			driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div[1]")).click();
		}
		
		driver.findElement(By.xpath("//select[@name='cabinclass']"));
		//System.out.println(drpCountry);
		// drpCountry.selectByVisibleText("Business");


	try {	
		WebElement fromDestination=driver.findElement(By.xpath("*//select[@id='s2id_location_from']"));
		fromDestination.clear();
		fromDestination.sendKeys("mum");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		fromDestination.sendKeys(Keys.ENTER);

		WebElement toDestination=driver.findElement(By.xpath("//select[@id='s2id_location_to']"));
		toDestination.clear();
		toDestination.sendKeys("bca");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		toDestination.sendKeys(Keys.ENTER);

	      }catch(Exception e) {System.out.println(e);}
	}
}


