import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class suggestion extends AbstractComponent{
private WebDriverWait wait;
@FindBy(css="")
private List<WebElement> suggestionList;

public suggestion(final WebDriver driver){
    super(driver);
}

public void clickSuggestionByIndex(int index)
{
    this.suggestionList.get(index-1).click();
}

    @Override
    public boolean isDisplayed() {
        return this.wait.until(driver -> this.suggestionList.size()>5);
    }
}
