package steps;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;

public class CriarContaTestes {

	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu esteja na tela de login")
	public void queEuEstejaNaTelaDeLogin() {
		metodos.clicar(el.cookies, "aceitando os cookies");
		metodos.clicar(el.cliqueAqui, "acessando menu home");

	}

	@Quando("eu clicar no botao criar conta")
	public void euClicarNoBotaoCriarConta() {
		metodos.clicar(el.btnCriarConta, "acessando pagina de criar conta de usuario");

	}

	@Quando("preencher formulario com dados validos")
	public void preencherFormularioComDadosValidos() {
		metodos.escrever(el.nomeCompleto, "teste de novo usuario", "preenchendo campo nome");
		metodos.escrever(el.dataNascimento, "16121986", "preenchendo campo data de nascimento");
		metodos.escrever(el.emailCriarConta, "test1278906@teste.com", "preenchendo campo email");
		metodos.escrever(el.telefone, "11988888888", "preenchendo campo telefone");
		metodos.escrever(el.senhaCriarConta, "Teste123", "preenchendo campo senha");
		metodos.escrever(el.confSenhaCriarConta, "Teste123", "preenchendo campo conf senha");

	}

	@Quando("aceitar os termos e condicoes e aviso de privacidade")
	public void aceitarOsTermosECondicoesEAvisoDePrivacidade() {
		metodos.aceitarTermos("aceitando os termos e aviso de privacidade");

	}

	@Quando("clicar no botao criar conta")
	public void clicarNoBotaoCriarConta() {
		metodos.clicar(el.criarConta, "clicando no botao para criar a conta");
		metodos.esperar(4000);

	}

	@Entao("validamos mensagem de sucesso")
	public void validamosMensagemDeSucesso() {
       metodos.validarTexto(el.msgSucessoCriarConta, "", "validando a tela de sucesso");
       metodos.screenShot("criar_conta_comum_sucesso");


	}

	@Quando("deixar os campos em branco")
	public void deixarOsCamposEmBranco() {
		metodos.clicar(el.btnCriarConta, "acessoando menu criar conta");
		metodos.clicar(el.nomeCompleto, null);
		metodos.clicar(el.dataNascimento, null);
		metodos.clicar(el.emailCriarConta, null);

	}

	@Quando("clicar no botao fazer login")
	public void clicarNoBotaoFazerLogin() {
		metodos.clicar(el.telefone, null);
		metodos.clicar(el.senhaCriarConta, null);
		

	}

	@Quando("o botao nao esta clicavel")
	public void oBotaoNaoEstaClicavel() {
		metodos.clicar(el.confSenhaCriarConta, null);

	}

	@Entao("validamos a mensagem de aviso")
	public void validamosAMensagemDeAviso() {
		metodos.esperar(4000);
		metodos.screenShot("criar_conta_campos_em_branco");
	

	}

	@Quando("for criar a conta")
	public void forCriarAConta() {
		metodos.clicar(el.btnCriarConta, "acessando pagina de criar conta de usuario");

	}

	@Quando("preencher os campos com os dados validos")
	public void preencherOsCamposComOsDadosValidos() {
		metodos.escrever(el.nomeCompleto, "teste data de nascimento invalida", "preenchendo campo nome");
		metodos.escrever(el.emailCriarConta, "testy18006@teste.com", "preenchendo campo email");
		metodos.escrever(el.telefone, "11988888888", "preenchendo campo telefone");
		metodos.escrever(el.senhaCriarConta, "Teste123", "preenchendo campo senha");
		metodos.escrever(el.confSenhaCriarConta, "Teste123", "preenchendo campo conf senha");

	}

	@Quando("campo idade for preenchido com dado invalido")
	public void campoIdadeForPreenchidoComDadoInvalido() {
		metodos.escrever(el.dataNascimento, "00000987", "data de nascimento invalida");
		metodos.aceitarTermos("aceitando os termos");

	}

	@Quando("clicar no botao de criar conta")
	public void clicarNoBotaoDeCriarConta() {
		metodos.clicar(el.criarConta, "clicando no botao para criar a conta");

	}

	@Entao("validamos mensagem de sucesso do sistema")
	public void validamosMensagemDeSucessoDoSistema() {
		metodos.esperar(3000);
		metodos.screenShot("data_de_nascimento_invalido");

	}

	@Quando("colocar os dados no capos email")
	public void colocarOsDadosNoCaposEmail() {

	}

	@Quando("as informacoes dos dados forem invalidas")
	public void asInformacoesDosDadosForemInvalidas() {

	}

	@Entao("validamos a mensagem de erro no campo email")
	public void validamosAMensagemDeErroNoCampoEmail() {

	}

	@Quando("preencher o campo telefone")
	public void preencherOCampoTelefone() {

	}

	@Quando("os dados estiverem incorretos")
	public void osDadosEstiveremIncorretos() {

	}

	@Entao("sistema retorna mensagem de erro no campo")
	public void sistemaRetornaMensagemDeErroNoCampo() {

	}

	@Quando("clicar no campo senha")
	public void clicarNoCampoSenha() {

	}

	@Quando("preencher dados sem uma letra minuscula")
	public void preencherDadosSemUmaLetraMinuscula() {

	}

	@Entao("valido o retorno do sistema")
	public void validoORetornoDoSistema() {

	}

	@Quando("clicar no campo de preencher senha")
	public void clicarNoCampoDePreencherSenha() {

	}

	@Quando("colocar dados que nao contem letra maiuscula")
	public void colocarDadosQueNaoContemLetraMaiuscula() {

	}

	@Entao("validamos a mensagem do sistema")
	public void validamosAMensagemDoSistema() {

	}

	@Quando("Clicar no campo de senha")
	public void clicarNoCampoDeSenha() {

	}

	@Quando("Inserir dados sem os oito caraceteres")
	public void inserirDadosSemOsOitoCaraceteres() {

	}

	@Entao("sistema retorna uma mensagem")
	public void sistemaRetornaUmaMensagem() {

	}

	@Quando("preenher o campo senha")
	public void preenherOCampoSenha() {

	}

	@Quando("inseir dados que nao contem numeral")
	public void inseirDadosQueNaoContemNumeral() {

	}

	@Entao("Validamos a mensagem de aviso de retorno do sistema")
	public void validamosAMensagemDeAvisoDeRetornoDoSistema() {

	}

	@Quando("preencher formulario para criar novo usuario")
	public void preencherFormularioParaCriarNovoUsuario() {

	}

	@Quando("inserir o curriculo")
	public void inserirOCurriculo() {

	}

	@Quando("nao aceitar os termos")
	public void naoAceitarOsTermos() {

	}

	@Entao("botao criar conta nao fica selecionavel")
	public void botaoCriarContaNaoFicaSelecionavel() {

	}

}
