package pageobjects.pages;

import org.openqa.selenium.WebElement;

public enum AccountPage implements PageObjects {
    AccountTitle(PageObjectUtils.LocatorType.CLASSNAME, "section-title"),
    UsernameInput(PageObjectUtils.LocatorType.NAME, "username"),
    EmailAddressField(PageObjectUtils.LocatorType.ID, "email"),
    PasswordField(PageObjectUtils.LocatorType.ID, "password"),
    SignUpButtonLogin(PageObjectUtils.LocatorType.CLASSNAME, "btn-state"),
    SignUpButtonFinal(PageObjectUtils.LocatorType.CLASSNAME, "btn-blue"),
    NameInputField(PageObjectUtils.LocatorType.ID, "username"),
    EmailInputField(PageObjectUtils.LocatorType.ID, "email"),
    LogoutButton(PageObjectUtils.LocatorType.CLASSNAME, "sign-out-link"),
    LoginButton(PageObjectUtils.LocatorType.CLASSNAME, "btn-blue"),
    PasswordSignUpPage(PageObjectUtils.LocatorType.ID, "password");


    public PageObjectUtils.LocatorType locator;
    public String id;

    AccountPage(PageObjectUtils.LocatorType locator, String id) {
        this.locator = locator;
        this.id = id;
    }

    @Override
    public void initializeMap() {}

    @Override
    public WebElement getElement() {
        return PageObjectUtils.locateElement(driver, locator, id);
    }
}