import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

	private By findInputBar = By.cssSelector("input[id = 'es_search']");
	private By findTitle = By.xpath("//*[@id='itemTitle']");
	private By workListLocator = By.xpath("//*[@id=\"worklist_head\"]/a");
	private By logoutLocator = By.xpath("//*[@class = 'logoutButton']");
	private By logoutEndLocator = By.id("uamExitCurrentButton");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void writeName() throws InterruptedException {
		sendKeys("Pablo Fraquia", findInputBar);
		Thread.sleep(6000);
		clear(findInputBar);
		//System.out.print()
	}
	public void obtainTitle() {
		System.out.println(getText(findTitle));
	}
	public void clickWorklist() {
		click(workListLocator);
	}
	public void clickLogout() {
		click(logoutLocator);
		click(logoutEndLocator);
	}
	
}
