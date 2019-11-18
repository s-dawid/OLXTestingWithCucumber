package landingPage.fragments;

import enums.Categories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesFragment {

    @FindBy (className = "maincategories")
    private WebElement mainCategories;

    public final WebElement selectCategory(Categories category){
        return mainCategories.findElement(By.cssSelector("div.item a[href*='" + category.category() +"']"));
    }
}