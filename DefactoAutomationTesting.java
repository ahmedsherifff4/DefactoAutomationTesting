package ODCxINSTANT_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
public class DefactoAutomationTesting {
    ChromeOptions options = new ChromeOptions();
    Map<String, Object> prefs = new HashMap<String, Object>();
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void BeforeMethod() {
      //  options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0 Safari/537.36");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://www.defacto.com.eg/en-eg");


    }
    @AfterClass
    public void afterClass() throws InterruptedException {
     Thread.sleep(2000);
     driver.quit();

    }

    @Test(priority = 0)
    public void loginWithEmptyEmail() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.className("home-main__image--text")).click();
        Thread.sleep(1500);


        driver.findElement(By.className("header__section--toggle")).click();
        Thread.sleep(2000);

        WebElement emailField = driver.findElement(By.name("LoginModel.Email"));
        emailField.clear();

        driver.findElement(By.id("LoginModel_Password")).sendKeys("Ahmed343420");
        Thread.sleep(500);
        driver.findElement(By.id("LoginBtn")).click();

        // driver.findElement(By.tagName("body")).click();

      /*  boolean errorDisplayed = !driver.findElements(By.xpath("//*[contains(text(),'E-mail')]")).isEmpty();

        Assert.assertTrue(errorDisplayed, "Validation message for empty email is not displayed");
        */


    }

    @Test(priority = 1)
    public void LoginFunc() throws InterruptedException {




      /*      driver.findElement(By.className("home-main__image--text")).click();

            Thread.sleep(3000);
            driver.findElement(By.className("header__section--toggle")).click();
           */
        Thread.sleep(1000);
        driver.findElement(By.id("LoginModel_Email")).sendKeys("ahmed.sherif.official29@gmail.com");
        Thread.sleep(500);
        //  driver.findElement(By.id("LoginModel_Password")).sendKeys("Ahmed343420");
        driver.findElement(By.id("LoginBtn")).click();
        Thread.sleep(3000);

    }

    @Test(priority = 2)
    public void productDetails() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='WOMAN']")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("header__menu-button")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='menu__main--item menu__main--item-mobile menu__main--item-1 swiper-slide small swiper-slide-active' ]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='product-card__title--name'][1]")).click();

        String actual = "ADD TO CART";
        if (driver.findElement(By.className("action-btn-text1")).getText().equals(actual)) {
            System.out.println("done");
        } else {
            System.out.println("not done");
        }

        Thread.sleep(500);
        driver.navigate().back();
        Thread.sleep(500);
    }

    @Test(priority = 3)
    public void addToFavFun() throws InterruptedException {

           /* driver.findElement(By.xpath("//span[text()='WOMAN']")).click();
            Thread.sleep(2000);
            driver.findElement(By.className("header__menu-button")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("//div[@class='menu__main--item menu__main--item-mobile menu__main--item-1 swiper-slide small swiper-slide-active' ]")).click();

            Thread.sleep(1000);*/
        //div[@class="ui-icon ui-icon--primary"]
        By firstFavBtn = By.xpath("(//div[contains(@class,'product-card__favourite') and contains(@class,'add-to-favorites')])[1]");
        driver.findElement(firstFavBtn).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='header__section-favorite header__section-item']")).click();
        String actual = "https://www.defacto.com.eg/en-eg/Customer/Wishlist";
        String ExcpectRus = driver.getCurrentUrl();
        Assert.assertEquals(actual, ExcpectRus);

        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
        //  driver.navigate().back();

    }

    @Test(priority = 4)
    public void AddToCart() throws InterruptedException {
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefs);

        //    driver.get("https://www.defacto.com.eg/en-eg");
        //  driver.findElement(By.className("home-main__image--text")).click();
        // driver.findElement(By.className("header__menu-button")).click();
        //  Thread.sleep(4000);
        //driver.findElement(By.className("menu__main--item-link")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@data-variantindex='3444787'][1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'size-selector-sizes-size__button') and contains(@class,'is-low-stock')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("flycartBtn")).click();
        Thread.sleep(2000);
        String ActualResult = "1"; //LOOSE FIT BOAT NECK LONG SLEEVE T-SHIRT
        String ExcpectedResult = driver.findElement(By.className("piece-product")).getText();
        System.out.println(ExcpectedResult);
        Assert.assertEquals(ActualResult, ExcpectedResult);

    }

    @Test(priority = 5)
    public void increaseItemCart() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.className("add-product")).click();
        Thread.sleep(3000);
        String ActualResult = "2"; //LOOSE FIT BOAT NECK LONG SLEEVE T-SHIRT
        String ExcpectedResult = driver.findElement(By.className("piece-product")).getText();
        System.out.println(ExcpectedResult);
        Assert.assertEquals(ActualResult, ExcpectedResult);

    }

    @Test(priority = 6)
    public void decreaseItemCart() throws InterruptedException {
        driver.findElement(By.className("minus-product")).click();
        Thread.sleep(3000);
        String ActualResult = "1"; //LOOSE FIT BOAT NECK LONG SLEEVE T-SHIRT
        String ExcpectedResult = driver.findElement(By.className("piece-product")).getText();
        System.out.println(ExcpectedResult);
        Assert.assertEquals(ActualResult, ExcpectedResult);

    }

    @Test(priority = 7)
    public void RemoveFromCart() throws InterruptedException {

        driver.findElement(By.xpath("//a[@class='product-delete-item']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("delete-button")).click();


      //  Thread.sleep(3000);
       /* String ActualResult = "0"; //LOOSE FIT BOAT NECK LONG SLEEVE T-SHIRT
        String ExcpectedResult = driver.findElement(By.xpath("//div[@class='sideMenu__title'][1]")).getText();
        System.out.println(ExcpectedResult);
        Assert.assertEquals(ActualResult, ExcpectedResult);*/
        Thread.sleep(3000);
       // driver.findElement(By.xpath("//button[@aria-label='Shopping Cart']")).click();
        driver.navigate().back();
    }

    @Test(priority = 8)
    public void searchProduct() throws InterruptedException {


       // Thread.sleep(2000);


        Thread.sleep(3000);

        WebElement searchBar = driver.findElement(By.cssSelector("input.search-button.main-search-button"));

        searchBar.click();
        Thread.sleep(2000);
        WebElement searchBar2 = driver.findElement(By.id("header-search-autocomplete"));
        searchBar2.sendKeys("Jeans");
        Thread.sleep(2000);


        WebElement searchIcon = driver.findElement(By.className("header__search-form--search"));
        searchIcon.click();


        Thread.sleep(3000);

        System.out.println("Search for Jeans completed successfully.");

        // //// viewing  the first product ... then press add to cart .. then choosing size

        WebElement firstProduct = driver.findElement(By.xpath("//a[@title='Boy Wide Leg Straight Leg Jeans'][1]")); //---------
        firstProduct.click();
        Thread.sleep(3000);

        WebElement addToCartBtn = driver.findElement(By.className("product-detail__purchase-button-addToCart"));
        addToCartBtn.click();
        System.out.println("Product added to cart.");

        Thread.sleep(3000);

        //Choosing size
        try {
            WebElement sizeL = driver.findElement(By.xpath("//button[@data-size='13/14 Years (164 cm)']"));
            sizeL.click();
            System.out.println("Size L selected.");
        } catch (Exception e) {
            System.out.println("Size L might be out of stock!");
        }
        Thread.sleep(2000);


        //after adding the item to cart and choosing the size
        //we wait for the pop up (top right) "GO TO CART" to click it.

        WebElement goToCartBtn = driver.findElement(By.cssSelector(".addtocarttoastmesage-right a"));
        goToCartBtn.click();

        System.out.println("Success: Navigated to Cart page via pop-up.");

        Thread.sleep(5000);


        WebElement plusBtn = driver.findElement(By.className("add-product"));

        plusBtn.click();
        System.out.println("Increased quantity to 2");
        Thread.sleep(2000); // Wait for the price to update


        //for the second + click
        WebElement plusBtn2 = driver.findElement(By.className("add-product"));

        plusBtn2.click();
        System.out.println("Increased quantity to 3");
        Thread.sleep(5000);

        //clicking "COMPLETE ORDER " BUTTON
        WebElement completeOrderBtn = driver.findElement(By.id("dropdownSummaryButton"));
        completeOrderBtn.click();

        System.out.println("Clicked Complete Order.");

        Thread.sleep(5000);
        // WaitING for the checkout/login page to load

        driver.navigate().to("https://www.defacto.com.eg/en-eg/woman");
    }

    @Test(priority = 9)
    public void sale_filter() throws InterruptedException {


        //   WebElement womanCategory = driver.findElement(By.xpath("//span[text()='WOMAN']"));
        //  womanCategory.click();
        //  System.out.println("Clicked WOMAN category.");
        Thread.sleep(4000);

        //clicking the menu button
        WebElement menuBtn = driver.findElement(By.cssSelector("button.header__menu-button"));
        menuBtn.click();
        System.out.println("Opened Sidebar Menu.");
        Thread.sleep(3000);


        WebElement saleOption = driver.findElement(By.xpath("//div[text()='SALE']"));
        saleOption.click();
        System.out.println("Sale option  expanded.");
        Thread.sleep(2000);


        // then we click "see all "
        WebElement seeAllBtn = driver.findElement(By.xpath("//a[@data-id='1cdf81ce-4df1-4435-9b39-bd92e155316b']"));
        seeAllBtn.click();
        System.out.println("Navigated to the full Sale page.");

        // Wait for the products to show
        Thread.sleep(5000);

        // filter button
        WebElement filterBtn = driver.findElement(By.id("filter-toggle"));
        filterBtn.click();
        System.out.println("Filter sidebar opened.");
        Thread.sleep(3000);


        WebElement priceDescending = driver.findElement(By.xpath("//label[@for='sort-2']"));
        priceDescending.click();
        System.out.println("Sorting by Price: Descending selected.");
        Thread.sleep(2000);

        WebElement showProductsBtn = driver.findElement(By.xpath("//button[contains(text(),'Show Products')]"));
        showProductsBtn.click();
        System.out.println("Filter applied successfully.");

        Thread.sleep(5000);


    }

    @Test(priority = 10) //
    public void verifyThatUserCanSwitchBetweenArEn() throws InterruptedException {
//        Thread.sleep(5000);
//        // WaitING for the checkout/login page to load
//
//        driver.navigate().to("https://www.defacto.com.eg/en-eg/woman");
        driver.get("https://www.defacto.com.eg/en-eg");

        String actualRes = "عربة التسوق";

        WebElement mandeep = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.className("home-main__image--text")
                )
        );
        mandeep.click();

        WebElement menu = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.className("header__menu-button")
                )
        );
        menu.click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-progress")));


        WebElement changeLanButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("languageSelection")
                )
        );
        changeLanButton.click();

        WebElement arButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.className("form-check-label")
                )
        );
        arButton.click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-progress")));


        WebElement saveButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.className("btn-text")
                )
        );
        saveButton.click();

        Thread.sleep(3000);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-progress")));


        WebElement expectedRes = driver.findElement(By.cssSelector("#flycartBtn span"));

        Assert.assertEquals(actualRes, expectedRes.getText().trim());

    }

    @Test(priority = 11)
    public void verifyThatUserCanAccessOrderFromMenu() throws InterruptedException {
        driver.get("https://www.defacto.com.eg/en-eg");

        WebElement mandeep = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.className("home-main__image--text")
                )
        );
        mandeep.click();

        WebElement menu = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.className("header__menu-button")
                )
        );
        menu.click();

//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader-progress")));
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to bottom of the page
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//a[.//div[text()='My Orders']]")));
        WebElement myOrder = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[.//div[text()='My Orders']]")
                )
        );
        myOrder.click();

        wait.until(ExpectedConditions.urlContains("https://www.defacto.com.eg/en-eg/Customer%2FOrderList"));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.defacto.com.eg/en-eg/Customer%2FOrderList"));


        // Scroll to bottom of the page
   /*     js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.className("logoutBtn")));


        driver.findElement(By.className("logoutBtn")).click();
        Thread.sleep(3000);

    */
    }

  @Test(priority = 12)
  public void logoutFunc() throws InterruptedException {
  /*      driver.findElement(By.className("home-main__image--text")).click();
        Thread.sleep(2000);
        WebElement profileIcon = driver.findElement(By.xpath("//div[@class='header_section-user menu-open header_section-item']"));
        profileIcon.click();*/
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to bottom of the page
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.className("logoutBtn")));


        driver.findElement(By.className("logoutBtn")).click();
        Thread.sleep(3000);
    }

}




