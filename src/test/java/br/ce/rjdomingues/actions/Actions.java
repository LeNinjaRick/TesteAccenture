package br.ce.rjdomingues.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.ce.rjdomingues.pageobjects.PageObjects;

public class Actions {

	// Metodo para executar acoes da classe robot com o Clipboard. (CTRL + C) e
	// (CTRL + V)
	public static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	// Metodo para abrir browser. Ex: 'Firefox' = Abrir com Firefox | 'Chrome' = Abrir com Chrome
	public static WebDriver abrirSite(String browser, String url) throws IOException {
		WebDriver driver;

		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();

		}
		driver.get(url);
		driver.manage().window().maximize();

		return driver;
	}

	// 1
	// Acoes do primeiro formulario
	public static void preencherCamposEnterVehicleData(WebDriver driver) throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		PageObjects objects = new PageObjects(driver);

		// seleciona BMW no DropDown:
		objects.dropMake().selectByVisibleText("BMW");
		// modelo selecionado
		objects.dropModel().selectByVisibleText("Motorcycle");
		// capacidade do cilindro enviada
		objects.cylinderCapacity().clear();
		objects.cylinderCapacity().sendKeys("323");
		// performance do motor enviada
		objects.enginePerformance().clear();
		objects.enginePerformance().sendKeys("123");
		// data de fabricacaoo enviada como saida de teclado
		objects.dateOfManufacture().clear();
		objects.dateOfManufacture().sendKeys("07/05/2020");
		// numero de assentos selecionado
		objects.numberOfSeats().selectByVisibleText("2");
		// numero de assentos de moto selecionado
		objects.numberOfSeatsMotorcycle().selectByVisibleText("2");
		//////////////////////////////////
		// volante nao esta do lado direito:
		objects.handDriveNo().click();
		// volante esta do lado direito:
		// objects.handDriveYes().click();
		///////////////////////////////////

		// rolagem da tela ate o meio da tela:
		jse.executeScript("window.scrollTo(0,500);");

		// Tipo de combustivel selecionado
		objects.fuel().selectByVisibleText("Diesel");
		// payload preenchido:
		objects.payLoad().clear();
		objects.payLoad().sendKeys("1");
		// Peso total inserido:
		objects.totalWeight().clear();
		objects.totalWeight().sendKeys("400");
		// Preco de tabela inserido
		objects.listPrice().clear();
		objects.listPrice().sendKeys("12345");

		// rolagem ate o fim da tela:
		jse.executeScript("window.scrollTo(0,600);");

		// numero da placa inserido
		objects.licensePlateNumber().clear();
		objects.licensePlateNumber().sendKeys("4545");
		// Quilometragem anual inserida
		objects.annualMileage().clear();
		objects.annualMileage().sendKeys("123");
		// pedindo um tempo de espera
		Thread.sleep(5000);
		// clica no botao next:
		objects.nextEnterInsurantData().click();

	}

	// 2
	// Acoes do segundo formulario
	public static void preencherCamposEnterInsurantData(WebDriver driver)
			throws InterruptedException, AWTException, IOException {

		PageObjects objects = new PageObjects(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// inserir primeiro nome
		objects.firstName().clear();
		objects.firstName().sendKeys("Ricardo");
		// inserir o sobrenome
		objects.lastName().clear();
		objects.lastName().sendKeys("Junior");
		// inserir data de nascimento
		objects.birthDate().clear();
		objects.birthDate().sendKeys("12/12/2000");
		// selecionando o genero Male:
		// objects.genderMale().click();
		// ou Female:
		objects.genderFemale().click();

		// dar check nos Hobbies:
		objects.skyDiving().click();
		objects.cliffDiving().click();
		objects.other().click();
		objects.bungeeJumping().click();
		objects.speeding().click();

		// inserir endereco da rua
		objects.streetAddress().clear();
		objects.streetAddress().sendKeys("Rua Joao quinto");
		// selecionando o Brasil no dropdown:
		objects.country().selectByVisibleText("Brazil");
		// inserir CEP
		objects.zipCode().clear();
		objects.zipCode().sendKeys("13123222");

		// scroll ate o meio da pagina:
		jse.executeScript("window.scrollTo(0,500);");

		// inserir a cidade:
		objects.city().clear();
		objects.city().sendKeys("Hortolandia");
		// selecionando occupation:
		objects.occupation().selectByVisibleText("Unemployed");

		// ir para o fim da pagina:
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");

		// inserir o website, no caso o linkedin:
		objects.website().clear();
		objects.website().sendKeys("https://www.linkedin.com/in/ricardo-junior-b44648197/");

		// Enviar a imagem:
		// a variavel assume o caminho do arquivo
		String path = new File("../TesteAccentureRicardoVaz/imagem.jpg").getCanonicalPath();
		// clicar no botao de upload:
		objects.openImage().click();
		// espera
		Thread.sleep(2000);
		// deixa o CTRL + C carregado com o caminho do arquivo:
		setClipboardData(path);
		// CTRL, V e ENTER keys do teclado
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

		Thread.sleep(10000);
		// clicar no botao next:
		objects.nextEnterProductData().click();

	}

	// 3
	// Acoes do terceiro formulario
	public static void preencherCamposEnterProductdata(WebDriver driver) throws InterruptedException {

		PageObjects objects = new PageObjects(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Start date do seguro:
		objects.startDate().clear();
		objects.startDate().sendKeys("12/15/2020");
		// selecionar a soma de seguros
		objects.insuranceSum().selectByVisibleText("3.000.000,00");
		// selecionar a classificacao de merito
		objects.meritRating().selectByVisibleText("Malus 10");

		// rolagem da tela:
		jse.executeScript("window.scrollTo(0,250);");

		// selecionar o seguro por danos
		objects.damageInsurance().selectByVisibleText("Partial Coverage");
		// selecionar o checkbox
		objects.euroProtection().click();
		// e tambem o outro checkbox:
		objects.legalDefenseInsurance().click();
		// selecionando o carro de cortesia:
		objects.courtesyCar().selectByVisibleText("Yes");
	
		// espera
		Thread.sleep(5000);
		// Clicar no botao next
		objects.nextSelectPriceOption().click();

	}

	// 4
	// Acoes do Quarto Formulario
	public static void preencherCamposSelectPriceOption(WebDriver driver) throws InterruptedException {

		PageObjects objects = new PageObjects(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Selecionar o plano:
		objects.platinum().click();
		// ou
		// objects.gold().click();
		// objects.ultimate().click();
		// objects.silver().click();
		///////////////////////////

		// scroll do mouse
		jse.executeScript("window.scrollTo(0,350);");

		// espera
		Thread.sleep(5000);
		// clicar no botao next
		objects.nextSendQuote().click();

	}

	// 5
	// Acoes do Quinto Formulario
	public static void preencherCamposSendQuote(WebDriver driver, String email, String phone, String username,
			String password, String confirmPass) throws InterruptedException {

		PageObjects objects = new PageObjects(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// preencher o campo Email
		objects.eMail().clear();
		objects.eMail().sendKeys(email);
		// preencher o campo Phone
		objects.phone().clear();
		objects.phone().sendKeys(phone);
		// preencher o campo Username
		objects.username().clear();
		objects.username().sendKeys(username);
		//////// scroll do mouse
		jse.executeScript("window.scrollTo(0,250);");
		// preencher o campo Password
		objects.password().clear();
		objects.password().sendKeys(password);
		// preencher o campo Confirm Password
		objects.confirmPass().clear();
		objects.confirmPass().sendKeys(confirmPass);
		// preencer o campo comments:
		objects.comments().clear();
		objects.comments().sendKeys("Comentario Teste");
	
		// espera
		Thread.sleep(5000);
		// clicar no botao send email:
		objects.sendEmail().click();

	}

	// Acao de validacao
	public static void validarEmail(WebDriver driver, String mensagem) throws InterruptedException {
		// espera implicita pro carregamento da mensagem de Enviado
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		String mensagemEmail = driver.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']//h2"))
				.getText();

		// Assert de resposta pra validar a mensagem de sucesso:
		Assert.assertEquals(mensagem, mensagemEmail);

		// espera apos finalizar a verificacao.
		Thread.sleep(5000);

	}

}
