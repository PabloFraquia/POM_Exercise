import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusinessList extends Base {

	public BusinessList(WebDriver driver) {
		super(driver);
	}

	private String locator = "(//a[@id='itemTitle'])[%d]";


	public String listTitle() {
		int i = 1;
		String ret = "";
		By TitleLocator;
		while (i < Integer.MAX_VALUE) {
			try {
				TitleLocator = By.xpath(String.format(locator, i));
				ret += getText(TitleLocator);

				ret += "\n";
				i++;
				
			} catch (Exception ex) {
				i = Integer.MAX_VALUE;
				continue;
			}
		}
		return ret;
	}

}
