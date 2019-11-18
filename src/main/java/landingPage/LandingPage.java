package landingPage;

import enums.Categories;
import landingPage.fragments.CategoriesFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    private WebDriver driver;
    private CategoriesFragment categoriesFragment;

    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectCategory(Categories category){
        categoriesFragment.selectCategory(category).click();
    }
}
