package br.ce.rjdomingues.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjects {

	public WebDriver driver;

	//////////// ELEMENTOS DO PRIMEIRO FORMULARIO/////////////

	@FindBy(id = "cylindercapacity")
	WebElement cylinderCapacity;

	@FindBy(id = "engineperformance")
	WebElement enginePerformance;

	@FindBy(id = "dateofmanufacture")
	WebElement dateOfManufacture;

	@FindBy(id = "payload")
	WebElement payLoad;

	@FindBy(id = "totalweight")
	WebElement totalWeight;

	@FindBy(id = "listprice")
	WebElement listPrice;

	@FindBy(id = "licenseplatenumber")
	WebElement licensePlateNumber;

	@FindBy(id = "annualmileage")
	WebElement annualMileage;

	@FindBy(id = "nextenterinsurantdata")
	WebElement nextEnterInsurantData;

	@FindBy(xpath = "//label[@class='ideal-radiocheck-label'][2]")
	WebElement handDriveNo;

	@FindBy(xpath = "//label[@class='ideal-radiocheck-label'][1]")
	WebElement handDriveYes;

////////////FIM ELEMENTOS DO PRIMEIRO FORMULARIO/////////////
/////////////////////////////////////////////////////////////
///////////ELEMENTOS DO SEGUNDO FORMULARIO///////////////////


	@FindBy(id = "firstname")
	WebElement firstName;

	@FindBy(id = "lastname")
	WebElement lastName;

	@FindBy(id = "birthdate")
	WebElement birthDate;

////gender:
	@FindBy(xpath = "//label[@class='ideal-radiocheck-label'][2]//span[@class='ideal-radio']")
	WebElement genderFemale;

	@FindBy(xpath = "//label[@class='ideal-radiocheck-label'][1]//span[@class='ideal-radio']")
	WebElement genderMale;
//////

//////Hobbies:

	@FindBy(xpath = "//label[@class='ideal-radiocheck-label'][1]//span[@class='ideal-check']")
	WebElement speeding;
	@FindBy(xpath = "//label[@class='ideal-radiocheck-label'][2]//span[@class='ideal-check']")
	WebElement bungeeJumping;
	@FindBy(xpath = "//label[@class='ideal-radiocheck-label'][3]//span[@class='ideal-check']")
	WebElement cliffDiving;
	@FindBy(xpath = "//label[@class='ideal-radiocheck-label'][4]//span[@class='ideal-check']")
	WebElement skyDiving;
	@FindBy(xpath = "//label[@class='ideal-radiocheck-label'][5]//span[@class='ideal-check']")
	WebElement other;
/////

	@FindBy(id = "streetaddress")
	WebElement streetAddress;

	@FindBy(id = "zipcode")
	WebElement zipCode;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(id = "website")
	WebElement website;

	@FindBy(id = "nextenterproductdata")
	WebElement nextEnterProductData;

	//////////////// FIM ELEMENTOS SEGUNDO FORMULARIO/////////////
//////////////////////////////////////////////////////////////////////
	//////////////// ELEMENTOS TERCEIRO FORMULARIO///////////////

	@FindBy(id = "nextselectpriceoption")
	WebElement nextSelectPriceOption;

	@FindBy(xpath = "//label[@class='ideal-radiocheck-label'][2]//span[@class='ideal-check']")
	WebElement legalDefenseInsurance;

	@FindBy(id = "startdate")
	WebElement startDate;

	@FindBy(xpath = "//label[@class='ideal-radiocheck-label'][1]//span[@class='ideal-check']")
	WebElement euroProtection;

	////////////////FIM DOS ELEMENTOS TERCEIRO FORMULARIO///////////////
////////////////////////////////////////////////////////////////////////////
	////////////////ELEMENTOS QUARTO FORMULARIO/////////////////////////
	
	@FindBy(xpath = "//label[@class='choosePrice ideal-radiocheck-label'][1]//span[@class='ideal-radio']")
	WebElement silver;

	@FindBy(xpath = "//label[@class='choosePrice ideal-radiocheck-label'][2]//span[@class='ideal-radio']")
	WebElement gold;

	@FindBy(xpath = "//label[@class='choosePrice ideal-radiocheck-label'][3]//span[@class='ideal-radio']")
	WebElement platinum;

	@FindBy(xpath = "//label[@class='choosePrice ideal-radiocheck-label'][4]//span[@class='ideal-radio']")
	WebElement ultimate;

	@FindBy(xpath = "//button[@id='nextsendquote']")
	WebElement nextSendQuote;

	////////////////FIM DOS ELEMENTOS QUARTO FORMULARIO/////////////////
//////////////////////////////////////////////////////////////////////////
	////////////////ELEMENTOS QUINTO FORMULARIO/////////////////////////

	@FindBy(id = "email")
	WebElement eMail;

	@FindBy(id = "phone")
	WebElement phone;

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "confirmpassword")
	WebElement confirmPass;

	@FindBy(id = "Comments")
	WebElement comments;

	@FindBy(id = "sendemail")
	WebElement sendEmail;

////////////////FIM ELEMENTOS QUINTO FORMULARIO/////////////////////////

	public PageObjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

////////////ELEMENTOS DO PRIMEIRO FORMULARIO/////////////

	public Select dropMake() {
		Select dropOp = new Select(driver.findElement(By.xpath("//select[@id='make']")));

		return (dropOp);
	}

	public Select dropModel() {
		Select dropModelo = new Select(driver.findElement(By.xpath("//select[@id='model']")));

		return (dropModelo);
	}

	public WebElement cylinderCapacity() {
		return (cylinderCapacity);
	}

	public WebElement enginePerformance() {
		return (enginePerformance);
	}

	public WebElement dateOfManufacture() {
		return (dateOfManufacture);
	}

	public Select numberOfSeats() {
		Select numSeats = new Select(driver.findElement(By.xpath("//select[@id = 'numberofseats']")));

		return (numSeats);
	}

	public Select numberOfSeatsMotorcycle() {
		Select numSeatsMotor = new Select(driver.findElement(By.xpath("//select[@id = 'numberofseatsmotorcycle']")));

		return (numSeatsMotor);
	}

	public WebElement handDriveYes() {

		return (handDriveYes);
	}

	public WebElement handDriveNo() {
		return (handDriveNo);
	}

	public Select fuel() {
		Select fuelType = new Select(driver.findElement(By.xpath("//select[@id='fuel']")));

		return (fuelType);
	}

	public WebElement payLoad() {
		return (payLoad);
	}

	public WebElement totalWeight() {
		return (totalWeight);
	}

	public WebElement listPrice() {
		return (listPrice);
	}

	public WebElement licensePlateNumber() {
		return (licensePlateNumber);
	}

	public WebElement annualMileage() {
		return (annualMileage);
	}

	public WebElement nextEnterInsurantData() {
		return (nextEnterInsurantData);
	}

	////////////FIM ELEMENTOS DO PRIMEIRO FORMULARIO/////////////
/////////////////////////////////////////////////////////////////////
	///////////ELEMENTOS DO SEGUNDO FORMULARIO//////////////////

	public WebElement firstName() {
		return (firstName);
	}

	public WebElement lastName() {
		return (lastName);
	}

	public WebElement birthDate() {
		return (birthDate);
	}

	public WebElement streetAddress() {
		return (streetAddress);
	}

	public WebElement zipCode() {
		return (zipCode);
	}

	public WebElement city() {
		return (city);
	}

	public WebElement website() {
		return (website);
	}

	public Select country() {
		Select country = new Select(driver.findElement(By.xpath("//select[@id='country']")));

		return (country);
	}

	public Select occupation() {
		Select occupation = new Select(driver.findElement(By.xpath("//select[@id='occupation']")));

		return (occupation);
	}

	public WebElement genderMale() {

		return (genderMale);
	}

	public WebElement genderFemale() {

		return (genderFemale);
	}

	public WebElement speeding() {

		return (speeding);
	}

	public WebElement bungeeJumping() {

		return (bungeeJumping);
	}

	public WebElement skyDiving() {

		return (skyDiving);
	}

	public WebElement cliffDiving() {

		return (cliffDiving);
	}

	public WebElement other() {

		return (other);
	}

	@FindBy(xpath = "//button[@id='open']")
	WebElement openImage;

	public WebElement openImage() {

		return (openImage);
	}

	public WebElement nextEnterProductData() {
		return (nextEnterProductData);

	}
	////////////FIM ELEMENTOS DO SEGUNDO FORMULARIO//////////////////
/////////////////////////////////////////////////////////////////////////
	////////////ELEMENTOS DO TERCEIRO FORMULARIO////////////////////

	public WebElement startDate() {

		return (startDate);
	}

	public Select insuranceSum() {
		Select insuranceSum = new Select(driver.findElement(By.xpath("//select[@id='insurancesum']")));

		return (insuranceSum);
	}

	public Select meritRating() {
		Select meritRating = new Select(driver.findElement(By.xpath("//select[@id='meritrating']")));

		return (meritRating);
	}

	public Select damageInsurance() {
		Select damageInsurance = new Select(driver.findElement(By.xpath("//select[@id='damageinsurance']")));

		return (damageInsurance);
	}

	public WebElement euroProtection() {

		return (euroProtection);
	}

	public WebElement legalDefenseInsurance() {

		return (legalDefenseInsurance);
	}

	public Select courtesyCar() {
		Select courtesyCar = new Select(driver.findElement(By.xpath("//select[@id='courtesycar']")));

		return (courtesyCar);
	}

	public WebElement nextSelectPriceOption() {
		return (nextSelectPriceOption);

	}

	////////////////FIM DOS ELEMENTOS TERCEIRO FORMULARIO//////
/////////////////////////////////////////////////////////////////////
	////////////////ELEMENTOS QUARTO FORMULARIO///////////////

	public WebElement silver() {
		return (silver);
	}

	public WebElement gold() {
		return (gold);
	}

	public WebElement platinum() {
		return (platinum);
	}

	public WebElement ultimate() {
		return (ultimate);
	}

	public WebElement nextSendQuote() {
		return (nextSendQuote);

	}

	////////////////FIM DOS ELEMENTOS QUARTO FORMULARIO///////////////
/////////////////////////////////////////////////////////////////////////
	////////////////ELEMENTOS QUINTO FORMULARIO//////////////////////

	public WebElement eMail() {
		return (eMail);
	}

	public WebElement phone() {
		return (phone);
	}

	public WebElement username() {
		return (username);
	}

	public WebElement password() {
		return (password);
	}

	public WebElement confirmPass() {
		return (confirmPass);
	}

	public WebElement comments() {
		return (comments);
	}

	public WebElement sendEmail() {
		return (sendEmail);
	}

////////////////FIM DOS ELEMENTOS QUINTO FORMULARIO///////////////
}
