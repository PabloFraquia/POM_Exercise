
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Worklist extends Base {

	// private By ListLocator=By.xpath("//table[@id='myWorklist']/tbody/");
	private String locator = "//table[@id='myWorklist']/tbody/tr[%d]/td[%d]/span";
	private By businessButton = By.xpath("//*[@id=\'buzz_head\']/a"); 

	public Worklist(WebDriver driver) {
		super(driver);
		
	}

	public String listTBody() {
		int i = 2;
		int e = 1;
		String ret = "";
		By AppNameLocatorFormatted = null;
		while (i < Integer.MAX_VALUE) {
			try {
				AppNameLocatorFormatted = By.xpath(String.format(locator, i, e));
				ret += getText(AppNameLocatorFormatted);
				
				ret += " ";
				e = 3;
				AppNameLocatorFormatted = By.xpath(String.format(locator, i, e));
				ret += getText(AppNameLocatorFormatted);	
				
				ret += "\n";
				i++;
				e = 1;

			} catch (Exception ex) {
				i = Integer.MAX_VALUE;
				continue;
			}
		}
		return ret;
	}

	public void clickBusiness() {
		click(businessButton);
		
	}

}