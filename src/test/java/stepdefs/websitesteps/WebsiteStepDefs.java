package stepdefs.websitesteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.pages.AccountPage;
import pageobjects.pages.InformationPage;
import pageobjects.pages.WelcomePage;
import selenium.WebDriverFactory;
import stepdefs.DriverHandler;

import javax.sound.sampled.Line;

public class WebsiteStepDefs extends DriverHandler {

    @Given("^The user navigates to the Finexo page$")
    public void theUserNavigatesToTheFinexoPage() throws Throwable {
        if (driver == null) driver = WebDriverFactory.getInstance().getWebDriver();
        driver.navigate().to(WelcomePage.getWebsiteUrl());
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("main-title")));
        Assert.assertTrue("the user was not directed to the welcome page", WelcomePage.MainTitle.getElement().getText().equals("Willkommen bei Finexo"));
    }

    @When("^The user clicks the Anfang button on the Finexo Welcome Page$")
    public void theUserClicksTheAnfangButtonOnTheFinexoWelcomePage() throws Throwable {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-blue")));
        WelcomePage.AnfangButton.clickElement();
    }

    @Then("^User is directed to the Information page$")
    public void userIsDirectedToTheInformationPage() throws Throwable {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("section-title")));
        Assert.assertTrue("the user is not in the information page", InformationPage.InformationTitle.getElement().getText().equals("Welche Firmenart wollen Sie gründen?"));
    }

    @Given("^The user is in the information menu page$")
    public void theUserIsInTheInformationMenuPage() throws Throwable {
        theUserNavigatesToTheFinexoPage();
        theUserClicksTheAnfangButtonOnTheFinexoWelcomePage();
        userIsDirectedToTheInformationPage();
    }

    @When("^The user clicks the AG button in the information page$")
    public void theUserClicksTheAGButtonInTheInformationPage() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-ag")));
        InformationPage.AgButton.clickElement();
    }

    @And("^The user writes the name of company to (.*) in the company input field$")
    public void theUserWritesTheNameOfCompanyToTestInTheCompanyInputField(String company) throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("focus")));
        InformationPage.NameOfCompany.getElement().sendKeys(company);
    }

    @And("^The user clicks on the second Next button in the information page$")
    public void theUserClicksOnTheSecondNextButtonInTheInformationPage() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-blue")));
        InformationPage.SecondNextButton.clickElement();
    }

    @And("^The user writes the purpose of company to (.*) in the company purpose input field$")
    public void theUserWritesThePurposeOfCompanyToThisIsJustAPlainTextInTheCompanyPurposeInputField(String purpose) throws Throwable {
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBe(By.className("section-title"), "Was wird der Zweck von Test AG?"));
        InformationPage.PurposeOfCompany.getElement().sendKeys(purpose);
    }

    @And("^The user clicks on the third Next button in the information page$")
    public void theUserClicksOnTheThirdNextButtonInTheInformationPage() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-blue")));
        InformationPage.ThirdNextButton.clickElement();
    }


    @And("^The user writes the address one on the address to (.*) in the one address input field$")
    public void theUserWritesTheAddressOneOnTheAddressTocInTheOneAddressInputField(String addressOne) throws Throwable {
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBe(By.className("section-desc"), "Dies kann auch eine Private Adresse (c/o Adresse) sein."));
        InformationPage.AddressName.getElement().sendKeys(addressOne);
    }

    @And("^The user writes the address two on the address to (.*) in the two address input field$")
    public void theUserWritesTheAddressTwoOnTheAddressToLegendInTheTwoAddressInputField(String address) throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("addressTwo")));
        InformationPage.AddressNameTwo.getElement().sendKeys(address);
    }

    @And("^The user writes the zip code to (.*) in the zip input field$")
    public void theUserWritesTheZipCodeToInTheZipInputField(String zip) throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("zip")));
        InformationPage.ZipNumber.getElement().sendKeys(zip);
    }

    @And("^The user writes the city name to (.*) in the city name input field$")
    public void theUserWritesTheCityNameToPrishtinaInTheCityNameInputField(String city) throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("city")));
        InformationPage.CityName.getElement().sendKeys(city);
    }


    @And("^The user clicks on the state Next button in the information page$")
    public void theUserClicksOnTheStateNextButtonInTheInformationPage() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-blue")));
        InformationPage.FourthNextButton.clickElement();
    }


    @And("^The user writes the email address to (.*) in the email input field$")
    public void theUserWritesTheEmailAddressToDrilonaFraktonComInTheEmailInputField(String email) throws Throwable {
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBe(By.className("section-title"), "Wer ist der Gründer der Test AG?"));
        InformationPage.EmailAddressField.getElement().sendKeys(email);
    }

    @And("^The user writes the telephone number to (.*) in the telephone input field$")
    public void theUserWritesTheTelephoneNumberToInTheTelephoneInputField(String telephone) throws Throwable {
        InformationPage.TelephoneNumber.getElement().sendKeys(telephone);
    }

    @And("^The user click on Frau button in the Gender section$")
    public void theUserClickOnFrauButtonInTheGenderSection() throws Throwable {
        InformationPage.FrauButton.clickElement();
    }

    @And("^The user writes the name to (.*) in the name input field$")
    public void theUserWritesTheNameToJessicaInTheNameInputField(String name) throws Throwable {
        InformationPage.FirstName.getElement().sendKeys(name);
    }

    @And("^The user writes the surname to (.*) in the surname input field$")
    public void theUserWritesTheSurnameToJonesInTheSurnameInputField(String surname) throws Throwable {
        InformationPage.Surname.getElement().sendKeys(surname);
    }

    @And("^The user writes the date of birth to (.*) in the date of birth input field$")
    public void theUserWritesTheDateOfBirthToInTheDateOfBirthInputField(String dateBirth) throws Throwable {
        InformationPage.DateOfBirth.getElement().sendKeys(dateBirth);
    }

    @And("^The user writes the hometown to (.*) in the hometown input field$")
    public void theUserWritesTheHometownToSwissInTheHometownInputField(String hometown) throws Throwable {
        InformationPage.Hometown.getElement().sendKeys(hometown);
    }

    @And("^The user writes the nationality to (.*) in the nationality input field$")
    public void theUserWritesTheNationalityToGermanInTheNationalityInputField(String nationality) throws Throwable {
        InformationPage.Nationality.getElement().sendKeys(nationality);
    }

    @And("^The user writes the address one to (.*) in the address one input field on the private address section$")
    public void theUserWritesTheAddressOneToTemplateStreetInTheAddressOneInputFieldOnThePrivateAddressSection(String street) throws Throwable {
        InformationPage.StreetName.getElement().sendKeys(street);
    }

    @And("^The user writes the address two to (.*) in the address two input field on the private address section$")
    public void theUserWritesTheAddressTwoToBerlinInTheAddressTwoInputFieldOnThePrivateAddressSection(String addressOne) throws Throwable {
        InformationPage.AddressTwo.getElement().sendKeys(addressOne);
    }

    @And("^The user writes the zip code to (.*) in the zip code input field on the private address section$")
    public void theUserWritesTheZipCodeToInTheZipCodeInputFieldOnThePrivateAddressSection(String zipCode) throws Throwable {
        InformationPage.ZipCode.getElement().sendKeys(zipCode);
    }

    @And("^The user writes the city name to (.*) in the city name input field on the private address section$")
    public void theUserWritesTheCityNameToBerlinInTheCityNameInputFieldOnThePrivateAddressSection(String cityName) throws Throwable {
        InformationPage.CityNameTwo.getElement().sendKeys(cityName);
    }

    @And("^The user writes the title of company to (.*) in the company input field on the company section$")
    public void theUserWritesTheTitleOfCompanyToEinzelmitgliedInTheCompanyInputFieldOnTheCompanySection(String position) throws Throwable {
        InformationPage.TitleOfPosition.getElement().sendKeys(position);
    }

    @And("^The user writes the percentage number to (.*) in the percentage input field on the percentage section$")
    public void theUserWritesThePercentageNumberToInThePercentageInputFieldOnThePercentageSection(String percentage) throws Throwable {
        InformationPage.Percentage.getElement().sendKeys(percentage);
    }

    @And("^The user clicks on Collective button on permission to sign the application in the founder page$")
    public void theUserClicksOnCollectiveButtonOnPermissionToSignTheApplicationInTheFounderPage() throws Throwable {
        InformationPage.CollectiveButton.clickElement();
    }

    @And("^The user clicks on the Next button in the founder page$")
    public void theUserClicksOnTheNextButtonInTheFounderPage() throws Throwable {
        InformationPage.NextButtonFounder.clickElement();
    }

    @And("^The user clicks on Yes button in the telephone contact page$")
    public void theUserClicksOnYesButtonInTheTelephoneContactPage() throws Throwable {
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBe(By.className("section-title"), "Wollen Sie per Telefon kontaktiert werden für eine Beratung ?"));
        InformationPage.YesButton.clickElement();
    }

    @And("^The user clicks on Yes button in the terms and conditions page$")
    public void theUserClicksOnYesButtonInTheTermsAndConditionsPage() throws Throwable {
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.textToBe(By.className("section-title"), "Akzeptieren Sie unsere Nutzungsbedingungen ?"));
        InformationPage.YesButtonTerms.clickElement();
    }

    @Then("^User is directed to the Account page$")
    public void userIsDirectedToTheAccountPage() throws Throwable {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBe(By.className("section-title"), "Einschreiben"));
        Assert.assertTrue("the user is not in the account page", AccountPage.AccountTitle.getElement().getText().equals("Einschreiben"));
    }

    @When("^The user writes the username to (.*) in the username input field in the Account Page$")
    public void theUserWritesTheUsermenuToJessicaInTheUsernameInputFieldInTheAccountPage(String username) throws Throwable {
        AccountPage.UsernameInput.getElement().sendKeys(username);
    }

    @And("^The user writes the email address to (.*) in the email input field in the Account Page$")
    public void theUserWritesTheEmailAddressToDrilonaFraktonComInTheEmailInputFieldInTheAccountPage(String emailAddress) throws Throwable {
        AccountPage.EmailAddressField.getElement().sendKeys(emailAddress);
    }

    @And("^The user writes the password to (.*) in the password input field in the Account Page$")
    public void theUserWritesThePasswordToDrilonaTestInThePasswordInputFieldInTheAccountPage(String password) throws Throwable {
        AccountPage.PasswordField.getElement().sendKeys(password);
    }

    @And("^The user clicks on the Login button in the Account Page$")
    public void theUserClicksOnTheLoginButtonInTheAccountPage() throws Throwable {
        AccountPage.LoginButton.clickElement();
    }

    @Given("^The user is in the account menu page$")
    public void theUserIsInTheAccountMenuPage() throws Throwable {
        theUserNavigatesToTheFinexoPage();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(WelcomePage.AccountButton.getElement()));
        WelcomePage.AccountButton.clickElement();
        wait.until(ExpectedConditions.textToBe(By.className("section-title"), "Anmelden"));
        Assert.assertTrue("the user is not on the account page", AccountPage.AccountTitle.getElement().getText().equals("Anmelden"));
    }

    @Then("^The user is directed to Status Page$")
    public void theUserIsDirectedToStatusPage() throws Throwable {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("sign-out-link"), 1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sign-out-link")));
        Assert.assertTrue("the user is not on the status page", AccountPage.LogoutButton.getElement().isDisplayed());
    }

    @And("^The user writes the password to (.*) in the password input field on the sign up page of Account Page$")
    public void theUserWritesThePasswordToDrilonaTestInThePasswordInputFieldOnTheSignUpPageOfAccountPage(String passwordSignUp) throws Throwable {
        AccountPage.PasswordSignUpPage.getElement().sendKeys(passwordSignUp);
    }


    @When("^The user clicks on the Sign up button in the Login Account Page$")
    public void theUserClicksOnTheSignUpButtonInTheLoginAccountPage() throws Throwable {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBe(By.className("section-title"), "Anmelden"));
        AccountPage.SignUpButtonLogin.clickElement();
    }

    @And("^The user writes the name to (.*) in the name input field in the Account Page$")
    public void theUserWritesTheNameToJessicaInTheNameInputFieldInTheAccountPage(String nameOfUser) throws Throwable {
        AccountPage.NameInputField.getElement().clear();
        AccountPage.NameInputField.getElement().sendKeys(nameOfUser);
    }

    @And("^The user writes the email to (.*) in the email input field in the Account Page$")
    public void theUserWritesTheEmailToDrilonaFraktonComInTheEmailInputFieldInTheAccountPage(String emailField) throws Throwable {
        AccountPage.EmailInputField.getElement().clear();
        AccountPage.EmailInputField.getElement().sendKeys(emailField);
    }

    @And("^The user clicks on the Sign up button in the Account Page$")
    public void theUserClicksOnTheSignUpButtonInTheAccountPage() throws Throwable {
        AccountPage.SignUpButtonFinal.clickElement();
    }

    @And("^The message for the successful redirect to the sign up page in the Account Page$")
    public void theMessageForTheSuccessfulRedirectToTheSignUpPageInTheAccountPage() throws Throwable {
        Assert.assertTrue("The message didn't appear", driver.findElement(By.className("error-finexo"))
                .getText().equals("This is a follow-up process which enables you to track your business registration status."));
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("error-finexo")));
    }
}

