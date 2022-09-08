package steps;

import java.io.IOException;

import coneccoes.DriversFactory;
import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;

public class IdadeInvalida extends DriversFactory {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu esteja no menu de criar conta")
	public void queEuEstejaNoMenuDeCriarConta() {
		metodos.clicar(el.cliqueAqui);
		metodos.clicar(el.btnCriarConta);

	}

	@Quando("clicar no campo idade")
	public void clicarNoCampoIdade() {
		

	}

	@Quando("preencher com dados invalidos")
	public void preencherComDadosInvalidos() {
		metodos.escreverPorNome("7", "16123333");

	}

	@Entao("o validamos a resposta de mensagem de aviso")
	public void oValidamosARespostaDeMensagemDeAviso() throws IOException, InterruptedException {
		metodos.validarTexto(el.entendi, "");
		metodos.screenShot("idade_invalida");
		metodos.esperar(2000);
		metodos.encerrarTeste();

	}

}
