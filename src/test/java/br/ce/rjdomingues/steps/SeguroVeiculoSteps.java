package br.ce.rjdomingues.steps;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import br.ce.rjdomingues.actions.Actions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class SeguroVeiculoSteps {

	WebDriver driver;

	@Dado("que estou na pagina de preenchimento de pedido de seguro")
	public void que_estou_na_pagina_de_preenchimento_de_pedido_de_seguro() throws IOException {

		// se quiser rodar no Firefox, troque o campo "Chrome" para "Firefox"
		// se quiser rodar no Chrome, troque o campo "Firefox" para "Chrome"
		driver = Actions.abrirSite("Firefox", "http://sampleapp.tricentis.com/101/app.php");
	}

	@Quando("preencho corretamente todos os campos solicitados")
	public void preencho_corretamente_todos_os_campos_solicitados() throws InterruptedException, AWTException, IOException {
		Actions.preencherCamposEnterVehicleData(driver);
		Actions.preencherCamposEnterInsurantData(driver);
		Actions.preencherCamposEnterProductdata(driver);
		Actions.preencherCamposSelectPriceOption(driver);
	}

	@Quando("preencho os dados de cadastro {string},{string},{string},{string},{string}")
	public void preencho_os_dados_de_cadastro(String email, String phone, String username, String password,
			String confirmPass) throws InterruptedException {

		Actions.preencherCamposSendQuote(driver, email, phone, username, password, confirmPass);

	}

	@Entao("recebo uma mensagem de amostra como resultado: {string}")
	public void recebo_uma_mensagem_de_amostra_como_resultado(String mensagem)  throws InterruptedException {

		Actions.validarEmail(driver, mensagem);
		
		//caso queira ver todos os campos preenchidos, apenas comente o comando abaixo e o Browser continuara aberto apos a execucao:
		
		driver.close();

	}

}
