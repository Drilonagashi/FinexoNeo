package pageobjects.pages;

import org.openqa.selenium.WebElement;
import pageobjects.PageElementIds;

public enum WelcomePage implements PageObjects {

    AnfangButton(PageObjectUtils.LocatorType.CLASSNAME, "btn-blue"),
    HierAnmeldenLink(PageObjectUtils.LocatorType.LINK, "Hier anmelden"),
    SwitchToDE(PageObjectUtils.LocatorType.CLASSNAME, "de"),
    SwitchToFR(PageObjectUtils.LocatorType.CLASSNAME, "fr"),
    WelcomeButton(PageObjectUtils.LocatorType.LINK, "Willkommen"),
    InformationButton(PageObjectUtils.LocatorType.LINK, "Informationen"),
    AccountButton(PageObjectUtils.LocatorType.LINK, "Konto"),
    PaymentButton(PageObjectUtils.LocatorType.LINK, "Payment"),
    MainTitle(PageObjectUtils.LocatorType.CLASSNAME, "main-title");

    public PageObjectUtils.LocatorType locator;
    public String id;

    WelcomePage(PageObjectUtils.LocatorType locator, String id) {
        this.locator = locator;
        this.id = id;
    }

    @Override
    public void initializeMap() {}

    @Override
    public WebElement getElement() {
        return PageObjectUtils.locateElement(driver, locator, id);
    }

    public static String getWebsiteUrl() {
        return PageElementIds.LoginPageIds.WEBSITE_URL.getUrl();
    }
}
