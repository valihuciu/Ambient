package pages.SearchPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SearchPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SearchPage.class);
    public static SearchPage instance;

    private SearchPage() {
    }

    public static SearchPage getInstance() {
        if (instance == null) {
            instance = new SearchPage();
        }
        return instance;
    }


    private By searchField = By.id("srcweb");
    private By searchButton = By.id("basic-addon2");
    private By addToCart = By.xpath("//button[@data-id='8630']");
    private By addToCart2 = By.xpath("//button[@data-id='5601']");
    private By removeProduct = By.xpath("//button//i[@class='las la-times']");


    public void insertProduct(String product) {
        LOG.info("insert product in search field");
        driver.findElement(searchField).sendKeys(product);
    }

    public void pressSearch() {
        LOG.info("press search button");
        driver.findElement(searchButton).click();
    }

    public void addToCart() {
        LOG.info("press add to cart button");
        driver.findElement(addToCart).click();
    }

    public void addToCart2() {
        LOG.info("press add to cart button");
        driver.findElement(addToCart2).click();
    }

    public void removeProduct() {
        LOG.info("press remove product button");
        driver.findElement(removeProduct).click();
    }

}
