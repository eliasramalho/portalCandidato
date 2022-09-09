package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosDeTestes;

public class FluxoResetConta {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Given("dado que eu esteja no menu home")
	public void dadoQueEuEstejaNoMenuHome() {
		metodos.clicar(el.cookies);
		metodos.clicar(el.cliqueAqui);
		metodos.clicar(el.esqueciSenha);

	}

	@When("preecher com dados validos")
	public void preecherComDadosValidos() throws InterruptedException {
		

	}

	@When("clicar no botao recuperar senha")
	public void clicarNoBotaoRecuperarSenha() {
		metodos.clicar(el.recuperarSenha);
		metodos.escrever(el.emailEsqueciSenha, "usuarioteste41@yahoo.com");

	}

	@Then("entao validamos a mensagem do sistema")
	public void entaoValidamosAMensagemDoSistema() throws InterruptedException, IOException {
		metodos.clicar(el.recuperarSenha);
		metodos.esperar(3000);
		metodos.validarTexto(el.emailEnviado, "");
		metodos.screenShot("recuperar_conta_sucesso");
		metodos.encerrarTeste();
		

	}

}
