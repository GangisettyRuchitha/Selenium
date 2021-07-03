package SampleProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class BaseTest 
{
	public static void main(String[] args) throws Exception
	{
		/*System.setProperty("webdriver.chrome.driver", "E:\\ruchi\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();*/
		
		
		/*System.setProperty("webdriver.gecko.driver", "E:\\ruchi\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();*/
		
		/*System.setProperty("webdriver.ie.driver", "E:\\ruchi\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();*/
		
		
		/*System.setProperty("webdriver.edge.driver", "E:\\ruchi\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();*/
		
		OperaOptions oo=new OperaOptions();
		oo.setBinary("E:\\ruchi\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		System.setProperty("webdriver.opera.driver", "E:\\ruchi\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		OperaDriver driver=new OperaDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		
	}

}
