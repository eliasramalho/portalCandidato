package steps;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;
import runner.Executa;

public class CriarContaTestes {

	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu esteja na tela de login")
	public void queEuEstejaNaTelaDeLogin() {
		Executa.IniciarTeste();
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
		metodos.escrever(el.emailCriarConta, "f5003@migonom.com", "preenchendo campo email");
		metodos.escrever(el.telefone, "11988888888", "preenchendo campo telefone");
		metodos.escrever(el.senhaCriarConta, "Teste123", "preenchendo campo senha");
		metodos.escrever(el.confSenhaCriarConta, "Teste123", "preenchendo campo conf senha");

	}

	@Quando("aceitar os termos e condicoes e aviso de privacidade")
	public void aceitarOsTermosECondicoesEAvisoDePrivacidade() {
		metodos.aceitarTermosCriarConta("aceitando os termos e aviso de privacidade");

	}

	@Quando("clicar no botao criar conta")
	public void clicarNoBotaoCriarConta() {
		metodos.esperar(1000);
		metodos.clicar(el.criarConta, "clicando no botao para criar a conta");
		metodos.esperar(5000);

	}

	@Entao("validamos mensagem de sucesso")
	public void validamosMensagemDeSucesso() {
		metodos.validarTexto(el.msgSucessoCriarConta, "Confirme sua conta no seu e-mail", "validando a tela de sucesso");
		metodos.screenShot("criar_conta_comum_sucesso");
		metodos.encerrarTeste();

	}

	@Quando("deixar os campos em branco")
	public void deixarOsCamposEmBranco() {
		metodos.clicar(el.btnCriarConta, "acessando menu criar conta");
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
		metodos.encerrarTeste();

	}

	@Quando("for criar a conta")
	public void forCriarAConta() {
		metodos.clicar(el.btnCriarConta, "acessando pagina de criar conta de usuario");

	}

	@Quando("preencher os campos com os dados validos")
	public void preencherOsCamposComOsDadosValidos() {
		metodos.escrever(el.nomeCompleto, "teste data de nascimento invalida", "preenchendo campo nome");
		metodos.escrever(el.emailCriarConta, "tesa6y06@teste.com", "preenchendo campo email");
		metodos.escrever(el.telefone, "11988888888", "preenchendo campo telefone");
		metodos.escrever(el.senhaCriarConta, "Teste123", "preenchendo campo senha");
		metodos.escrever(el.confSenhaCriarConta, "Teste123", "preenchendo campo conf senha");

	}

	@Quando("campo idade for preenchido com dado invalido")
	public void campoIdadeForPreenchidoComDadoInvalido() {
		metodos.escrever(el.dataNascimento, "01012015", "data de nascimento invalida");
		
		

	}


	@Entao("validamos mensagem de sucesso do sistema")
	public void validamosMensagemDeSucessoDoSistema() {
		metodos.esperar(2000);
		metodos.validarTexto(el.idadeNaoPermitida, "Idade não permitida", "validando moddal idade nao permitida");
		metodos.screenShot("data_de_nascimento_invalido");
		metodos.encerrarTeste();

	}

	@Quando("colocar os dados no campo email")
	public void colocarOsDadosNoCampoEmail() {
		metodos.clicar(el.btnCriarConta, "acessando pagina de criar conta de usuario");
		metodos.escrever(el.nomeCompleto, "teste email invalido", "preenchendo campo nome");
		metodos.escrever(el.dataNascimento, "17021987", "preenchendo data de nascimento");
		metodos.escrever(el.telefone, "11988888888", "preenchendo campo telefone");
		metodos.escrever(el.senhaCriarConta, "Teste123", "preenchendo campo senha");
		metodos.escrever(el.confSenhaCriarConta, "Teste123", "preenchendo campo conf senha");

	}

	@Quando("as informacoes dos dados forem invalidas")
	public void asInformacoesDosDadosForemInvalidas() {
		metodos.escrever(el.emailCriarConta, "testes.com", "preenchendo campo email com dado invalido");
		metodos.clicar(el.dataNascimento, null);

	}

	@Entao("validamos a mensagem de erro no campo email")
	public void validamosAMensagemDeErroNoCampoEmail() {
		metodos.esperar(1000);
		metodos.validarTexto(el.msgEmailInvalido, "Por favor, forneça um formato de Email válido", "validando email invalido");
		metodos.esperar(1000);
		metodos.screenShot("criar_conta_email_invalido");
		metodos.encerrarTeste();

	}

	@Quando("preencher o campo telefone")
	public void preencherOCampoTelefone() {
		metodos.clicar(el.btnCriarConta, "acessando pagina de criar conta de usuario");
		metodos.esperar(1000);
		metodos.escrever(el.nomeCompleto, "teste telefone invalido", "preenchendo campo nome");
		metodos.escrever(el.dataNascimento, "17021987", "preenchendo data de nascimento");
		metodos.escrever(el.emailCriarConta, "te223pr@test.com.com", "preenchendo email");
		metodos.escrever(el.senhaCriarConta, "Teste123", "preenchendo campo senha");
		metodos.escrever(el.confSenhaCriarConta, "Teste123", "preenchendo campo conf senha");

	}

	@Quando("os dados estiverem incorretos")
	public void osDadosEstiveremIncorretos() {
		metodos.escrever(el.telefone, "'", "preenchendo campo telefone");
		metodos.aceitarTermosCriarConta("aceitando termos");
		metodos.clicar(el.criarConta, "clicando no botao criar conta");

	}

	@Entao("sistema retorna mensagem de erro no campo")
	public void sistemaRetornaMensagemDeErroNoCampo() {
		metodos.esperar(3000);
		metodos.screenShot("campo_telefone_invalido");
		metodos.encerrarTeste();

	}

	@Quando("clicar no campo senha")
	public void clicarNoCampoSenha() {
		metodos.clicar(el.btnCriarConta, "acessando pagina de criar conta de usuario");
		metodos.esperar(1000);
		metodos.escrever(el.nomeCompleto, "teste senha invalida", "preenchendo campo nome");
		metodos.escrever(el.dataNascimento, "17021987", "preenchendo data de nascimento");
		metodos.escrever(el.emailCriarConta, "test2ypeelamr@test.com.com", "preenchendo email");

	}

	@Quando("preencher dados sem uma letra minuscula")
	public void preencherDadosSemUmaLetraMinuscula() {
		metodos.escrever(el.senhaCriarConta, "TESTE123", "preenchendo campo senha");

	}

	@Entao("valido o retorno do sistema")
	public void validoORetornoDoSistema() {
		metodos.esperar(3000);
		metodos.validarTexto(el.msgSenhaMinuscula, "Pelo menos uma Letra Minúscula", "validando a mensagem senha minuscula");
		metodos.screenShot("criar_conta_senha_minuscula");
		metodos.encerrarTeste();

	}

	@Quando("clicar no campo de preencher senha")
	public void clicarNoCampoDePreencherSenha() {
		metodos.clicar(el.btnCriarConta, "acessando pagina de criar conta de usuario");
		metodos.esperar(1000);
		metodos.escrever(el.nomeCompleto, "denha sem ltra maiuscula", "preenchendo campo nome");
		metodos.escrever(el.dataNascimento, "17021987", "preenchendo data de nascimento");
		metodos.escrever(el.emailCriarConta, "test2pamr@test.com.com", "preenchendo email");

	}

	@Quando("colocar dados que nao contem letra maiuscula")
	public void colocarDadosQueNaoContemLetraMaiuscula() {
		metodos.escrever(el.senhaCriarConta, "teste123", "preenchendo campo senha");

	}

	@Entao("validamos a mensagem do sistema")
	public void validamosAMensagemDoSistema() {
		metodos.esperar(3000);
		metodos.validarTexto(el.msgSenhaMaiuscula, "Pelo menos uma Letra Maiúscula", "validando a mensagem senha maiuscula");
		metodos.screenShot("criar_conta_senha_maiuscula");
		metodos.encerrarTeste();

	}

	@Quando("Clicar no campo de senha")
	public void clicarNoCampoDeSenha() {
		metodos.clicar(el.btnCriarConta, "acessando pagina de criar conta de usuario");
		metodos.esperar(1000);
		metodos.escrever(el.nomeCompleto, "teste senha invalida", "preenchendo campo nome");
		metodos.escrever(el.dataNascimento, "17021987", "preenchendo data de nascimento");
		metodos.escrever(el.telefone, "11912334456", "escrevendo telefone");
		metodos.escrever(el.emailCriarConta, "teas3amr@test.com.com", "preenchendo email");

	}

	@Quando("Inserir dados sem os oito caraceteres")
	public void inserirDadosSemOsOitoCaraceteres() {
		metodos.escrever(el.senhaCriarConta, "Test123", "preenchendo campo senha");

	}

	@Entao("sistema retorna uma mensagem")
	public void sistemaRetornaUmaMensagem() {
		metodos.esperar(3000);
		metodos.validarTexto(el.msgSenhaOito, "Pelo menos Oito Caracteres", "validando a mensagem senha oito caracteres");
		metodos.screenShot("criar_conta_senha_oito_caracteres");
		metodos.encerrarTeste();

	}

	@Quando("preenher o campo senha")
	public void preenherOCampoSenha() {
		metodos.clicar(el.btnCriarConta, "acessando pagina de criar conta de usuario");
		metodos.esperar(1000);
		metodos.escrever(el.nomeCompleto, "teste senha invalida", "preenchendo campo nome");
		metodos.escrever(el.dataNascimento, "17021987", "preenchendo data de nascimento");
		metodos.escrever(el.telefone, "11912334456", "escrevendo telefone");
		metodos.escrever(el.emailCriarConta, "t2ar@test.com.com", "preenchendo email");

	}

	@Quando("inseir dados que nao contem numeral")
	public void inseirDadosQueNaoContemNumeral() {
		metodos.escrever(el.senhaCriarConta, "TesteTeste", "preenchendo campo senha");

	}

	@Entao("Validamos a mensagem de aviso de retorno do sistema")
	public void validamosAMensagemDeAvisoDeRetornoDoSistema() {
		metodos.esperar(3000);
		metodos.validarTexto(el.msgSenhaNumeral, "Pelo menos um Número ou Símbolo", "validando a mensagem senha sem numeral");
		metodos.screenShot("criar_conta_senha_sem_numeral");
		metodos.encerrarTeste();

	}

	@Quando("preencher formulario para criar novo usuario")
	public void preencherFormularioParaCriarNovoUsuario() {
		metodos.clicar(el.btnCriarConta, "acessando pagina de criar conta de usuario");
		metodos.esperar(1000);
		metodos.escrever(el.nomeCompleto, "teste nao aceitar os termos", "preenchendo campo nome");
		metodos.escrever(el.dataNascimento, "17021987", "preenchendo data de nascimento");
		metodos.escrever(el.telefone, "11912334456", "escrevendo telefone");
		metodos.escrever(el.emailCriarConta, "tedar@test.com.com", "preenchendo email");
		metodos.escrever(el.senhaCriarConta, "Teste123", "preenchendo campo senha");
		metodos.escrever(el.confSenhaCriarConta, "Teste123", "preenchendo campo confir senha");

	}

	@Quando("nao aceitar os termos")
	public void naoAceitarOsTermos() {
		metodos.esperar(2000);

	}

	@Entao("botao criar conta nao fica selecionavel")
	public void botaoCriarContaNaoFicaSelecionavel() {
		metodos.screenShot("criar_conta_sem_aceitar_termos");
		metodos.encerrarTeste();

	}

}
