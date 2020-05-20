import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Desktop\\selenium\\documentos\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		LoginPage lp = new LoginPage(driver);
        	PageFactory.initElements(driver, lp);
		HomePage hp = new HomePage(driver);
		Worklist wl=new Worklist(driver);
		BusinessList bl = new BusinessList(driver);
		lp.login();
		hp.obtainTitle();
		hp.writeName();
		hp.clickWorklist();
		System.out.println(wl.listTBody());
		wl.clickBusiness();
		System.out.println(bl.listTitle());
		hp.clickLogout();
		
	}

}
