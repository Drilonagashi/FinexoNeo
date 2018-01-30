package pageobjects.pages;

import org.openqa.selenium.WebElement;

public enum InformationPage implements PageObjects {
    InformationTitle(PageObjectUtils.LocatorType.CLASSNAME, "section-title"),
    AgButton(PageObjectUtils.LocatorType.CLASSNAME, "btn-ag"),
    NameOfCompany(PageObjectUtils.LocatorType.ID, "focus"),
    SecondNextButton(PageObjectUtils.LocatorType.CLASSNAME, "btn-blue"),
    PurposeOfCompany(PageObjectUtils.LocatorType.ID, "focus"),
    ThirdNextButton(PageObjectUtils.LocatorType.CLASSNAME, "btn-blue"),
    AddressName(PageObjectUtils.LocatorType.ID, "focus"),
    AddressNameTwo(PageObjectUtils.LocatorType.ID, "addressTwo"),
    ZipNumber(PageObjectUtils.LocatorType.ID, "zip"),
    CityName(PageObjectUtils.LocatorType.ID, "city"),
    FourthNextButton(PageObjectUtils.LocatorType.CLASSNAME, "btn-blue"),
    EmailAddressField(PageObjectUtils.LocatorType.ID, "focus"),
    TelephoneNumber(PageObjectUtils.LocatorType.NAME, "number"),
    FrauButton(PageObjectUtils.LocatorType.CLASSNAME, "btn-Frau"),
    FirstName(PageObjectUtils.LocatorType.NAME, "name"),
    Surname(PageObjectUtils.LocatorType.NAME, "surname"),
    DateOfBirth(PageObjectUtils.LocatorType.ID, "date"),
    Hometown(PageObjectUtils.LocatorType.NAME, "origin"),
    Nationality(PageObjectUtils.LocatorType.NAME, "nationality"),
    StreetName(PageObjectUtils.LocatorType.NAME, "address_one"),
    AddressTwo(PageObjectUtils.LocatorType.NAME, "address_two"),
    ZipCode(PageObjectUtils.LocatorType.NAME, "zip"),
    CityNameTwo(PageObjectUtils.LocatorType.NAME, "city"),
    TitleOfPosition(PageObjectUtils.LocatorType.ID, "titleCompany"),
    Percentage(PageObjectUtils.LocatorType.NAME, "ownership"),
    CollectiveButton(PageObjectUtils.LocatorType.CLASSNAME, "btn-collective"),
    NextButtonFounder(PageObjectUtils.LocatorType.CLASSNAME, "btn-blue"),
    YesButton(PageObjectUtils.LocatorType.CLASSNAME, "btn-yes"),
    YesButtonTerms(PageObjectUtils.LocatorType.CLASSNAME, "btn-yes");

    public PageObjectUtils.LocatorType locator;
    public String id;

    InformationPage(PageObjectUtils.LocatorType locator, String id) {
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
