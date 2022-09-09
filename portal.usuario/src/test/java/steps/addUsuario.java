package steps;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;

public class addUsuario {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu esteja na tela de login")
	public void queEuEstejaNaTelaDeLogin() {
		metodos.clicar(el.cookies);
		metodos.clicar(el.cliqueAqui);

	}

	@Quando("eu clicar no botao criar conta")
	public void euClicarNoBotaoCriarConta() {
		metodos.clicar(el.btnCriarConta);

	}

	@Quando("preencher os campos com dados validos")
	public void preencherOsCamposComDadosValidos() throws InterruptedException {
		metodos.escrever(el.nomeCompleto, "teste user 118");
		metodos.escrever(el.dataNascimento, "16121986");
		metodos.escrever(el.emailCriarConta, "ketav2916756@aregods.com");
		metodos.escrever(el.telefone, "11999999999");
		metodos.escrever(el.senhaCriarConta, "Teste123");
		metodos.escrever(el.confSenhaCriarConta, "Teste123");
		metodos.clicar(el.mostrarSenha);
		metodos.esperar(1000);
		
		

	}

	@Quando("aceitar os termos e condicoes e aviso de privacidade")
	public void aceitarOsTermosECondicoesEAvisoDePrivacidade() throws InterruptedException {
		metodos.clicar(el.termoUso);
		metodos.esperar(2000);
		metodos.clicar(el.entendi);
		metodos.esperar(1000);
		metodos.clicar(el.avisoPrivacidade);

	}

	@Quando("clicar no botao criar conta")
	public void clicarNoBotaoCriarConta() throws InterruptedException {
		metodos.clicar(el.criarConta);
		metodos.esperar(3000);

	}

	@Entao("validamos mensagem de sucesso")
	public void validamosMensagemDeSucesso() throws IOException, InterruptedException {
		metodos.validarTexto(el.leveParaLogin, "");
		metodos.esperar(3000);
		metodos.screenShot("login-sucesso");
		metodos.encerrarTeste();

	}

}
