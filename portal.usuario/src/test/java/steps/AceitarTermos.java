package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosDeTestes;

public class AceitarTermos {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu acesse o menu de criar conta")
	public void queEuAcesseOMenuDeCriarConta() {
		metodos.clicar(el.cookies);
		metodos.clicar(el.cliqueAqui);
		metodos.clicar(el.btnCriarConta);

	}

	@When("preencher todos os campos")
	public void preencherTodosOsCampos() {
		metodos.escreverPorNome("6", "Teste de Usuario");
		metodos.escreverPorNome("7", "16121986");
		metodos.escreverPorNome("8", "teste@user90098.com");
		metodos.escreverPorNome("9", "11999999999");
		metodos.escreverPorNome("10", "Teste123");
		metodos.escreverPorNome("11", "Teste123");

	}

	@When("clicar no checkbox")
	public void clicarNoCheckbox() throws InterruptedException{
		metodos.clicar(el.termoUso);
		metodos.esperar(2000);
		
		
	}

	@Then("sistema abre guia com termos e condicoes")
	public void sistemaAbreGuiaComTermosECondicoes() throws IOException, InterruptedException {
		metodos.validarTexto(el.entendi, "");
		metodos.screenShot("termos_uso");
		metodos.clicar(el.entendi);
		metodos.esperar(3000);
		metodos.encerrarTeste();

	}

}
