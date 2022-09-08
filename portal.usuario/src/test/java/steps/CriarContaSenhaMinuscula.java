package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosDeTestes;

public class CriarContaSenhaMinuscula {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu acesse o menu criar conta")
	public void queEuAcesseOMenuCriarConta() throws InterruptedException {
		metodos.clicar(el.cookies);
		metodos.esperar(2000);
		metodos.clicar(el.cliqueAqui);
		metodos.clicar(el.btnCriarConta);

	}

	@When("clicar no campo senha")
	public void clicarNoCampoSenha() {
		metodos.escreverPorNome("6", "teste senha sem letra minuscula");
		metodos.escreverPorNome("7", "16121986");
		metodos.escreverPorNome("8", "teste@uaser2654.com.br");
		metodos.escreverPorNome("9", "11988887744");
		metodos.escreverPorNome("10", "TESTE1234");
		metodos.escreverPorNome("11", "TESTE1234");

	}

	@When("preencher dados sem uma letra minuscula")
	public void preencherDadosSemUmaLetraMinuscula() throws InterruptedException {
		metodos.clicar(el.termoUso);
		metodos.esperar(1000);
		metodos.clicar(el.entendi);
		metodos.clicar(el.avisoPrivacidade);
		metodos.clicar(el.mostrarSenha);
		

	}

	@Then("o sistema retorna uma mensagem de aviso")
	public void oSistemaRetornaUmaMensagemDeAviso() throws IOException, InterruptedException {
		metodos.clicar(el.senhaCriarConta);
		metodos.esperar(2000);
		metodos.validarTexto(el.confSenhaCriarConta, "");
		metodos.screenShot("senha_minuscula");
		metodos.encerrarTeste();

	}

}
