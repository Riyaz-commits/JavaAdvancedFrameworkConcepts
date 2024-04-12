import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebPages extends  AbstractComponent{

    private WebDriverWait wait;

  @FindBy(name="q")
  private WebElement searchBox;



    public WebPages(final WebDriver driver){
        super(driver);
    }

    public void enter(String keyword){
        this.searchBox.clear();
        this.searchBox.sendKeys(keyword);
    }

    @Override
    public boolean isDisplayed() {
        this.wait.until(ExpectedConditions.visibilityOf(this.searchBox));

        return this.searchBox.isDisplayed();
    }
}
