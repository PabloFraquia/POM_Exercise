import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {
	
	private By NEmpleadoLocator = By.xpath("//*[@id=\'form1\']");
	private By ProceedLocator=By.id("proceed-button");
	//private By AuthLocator=By.xpath("//*[@id='auth-code-btn']");
	private By LoginLocator=By.id("form-submit");
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		getPage("https://auth.ultimatix.net/utxLogin");
	}

	public void login() throws InterruptedException  {
		sendKeys("1863134", NEmpleadoLocator);
		click(ProceedLocator);
		//Thread.sleep(5000);
		//click(AuthLocator);
		Thread.sleep(20000);
		click(LoginLocator);

	}

}
