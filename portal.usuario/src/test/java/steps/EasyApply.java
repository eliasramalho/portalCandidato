package steps;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;
import runner.Executa;

public class EasyApply {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu esteja no menu de cadidatura rapida")
	public void queEuEstejaNoMenuDeCadidaturaRapida() {
		Executa.IniciarTeste();
		metodos.clicar(el.cookies, "aceitando os cookies");

	}

	@Quando("preencher os dados corretamente")
	public void preencherOsDadosCorretamente() {
		metodos.escrever(el.nomeEasy, "Teste teste", "escrevendo nome");
		metodos.escrever(el.dataEasy, "01012000", "preenchendo nascimento");
		metodos.clicar(el.curriculoEasy, "clicando em upload de curriculo");
		metodos.uploadArquivo("anexando curriculo");
		metodos.esperar(1000);
		metodos.escrever(el.emailEasy, "nibocam2@deitada.com", "preenchendo campo email");
		metodos.escrever(el.senhaEasy, "Teste123", "preenchendo campo senha");
		metodos.clicar(el.termoUso, "clicando nos termos");
		metodos.esperar(1000);
		metodos.clicar(el.entendi, "aceitando os termos");
		metodos.clicar(el.avisoEasy, "aceitando aviso de privacidade");

	}

	@Quando("clicar no botao enviar meu cv")
	public void clicarNoBotaoEnviarMeuCv() {
		metodos.clicar(el.enviarCandidatura, "enviando curriculo");

	}

	@Entao("candidatura enviada com sucesso")
	public void candidaturaEnviadaComSucesso() {
		metodos.esperar(7000);
		metodos.screenShot("candidatura_rapida_sucesso");
		metodos.encerrarTeste();

	}

	@Quando("preencher os dados")
	public void preencherOsDados() {
		metodos.clicar(el.emailEasy, null);
		metodos.clicar(el.nomeEasy, null);
		metodos.clicar(el.dataEasy, null);

	}

	@Quando("os campos estiverem em branco")
	public void osCamposEstiveremEmBranco() {
		metodos.clicar(el.nomeEasy, null);

	}

	@Entao("sistema retorna mensagem nos campos")
	public void sistemaRetornaMensagemNosCampos() {
		metodos.esperar(2000);
		metodos.validarTexto(el.msgErroCampoDataEasy, "", "validando msg de erro nome");
		metodos.screenShot("campos_em_branco_easy_apply");
		metodos.encerrarTeste();

	}

	@Quando("preencher os campos do formulario")
	public void preencherOsCamposDoFormulario() {

	}

	@Quando("data de nascimento estiver invalida")
	public void dataDeNascimentoEstiverInvalida() {

	}

	@Entao("sistema retorna um modal com mensagem de aviso")
	public void sistemaRetornaUmModalComMensagemDeAviso() {

	}

	@Quando("preencher formulario")
	public void preencherFormulario() {

	}

	@Quando("no campo senha preencher com senha sem numeral")
	public void noCampoSenhaPreencherComSenhaSemNumeral() {

	}

	@Entao("sistemma retorna mensagem de aviso sem numeral")
	public void sistemmaRetornaMensagemDeAvisoSemNumeral() {

	}

	@Quando("Preencher o formulario")
	public void preencherOFormulario() {

	}

	@Quando("no campo senha preencher com senha sem maiuscula")
	public void noCampoSenhaPreencherComSenhaSemMaiuscula() {

	}

	@Entao("sistemma retorna mensagem de aviso na senha sem maiuscula")
	public void sistemmaRetornaMensagemDeAvisoNaSenhaSemMaiuscula() {

	}

	@Quando("Preencher campos")
	public void preencherCampos() {

	}

	@Quando("no campo senha preencher com senha sem minuscula")
	public void noCampoSenhaPreencherComSenhaSemMinuscula() {

	}

	@Entao("sistemma retorna mensagem de aviso na senha sem minuscula")
	public void sistemmaRetornaMensagemDeAvisoNaSenhaSemMinuscula() {

	}

	@Quando("Preencher o formulario com dados")
	public void preencherOFormularioComDados() {

	}

	@Quando("no campo senha preencher com senha sem oito caractere")
	public void noCampoSenhaPreencherComSenhaSemOitoCaractere() {

	}

	@Entao("sistemma retorna mensagem de aviso na senha sem oito caractere")
	public void sistemmaRetornaMensagemDeAvisoNaSenhaSemOitoCaractere() {

	}

}
