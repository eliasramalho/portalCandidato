package steps;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.MetodosDeTestes;
import runner.Executa;

public class MenuLogin {
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu esteja no menu login")
	public void queEuEstejaNoMenuLogin() {
		Executa.IniciarTeste();
		metodos.clicar(el.cookies, "aceitando os cookies");
		metodos.clicar(el.cliqueAqui, "acessando menu login");
		metodos.esperar(1000);

	}

	@Quando("preencher os campos email e senha corretamente")
	public void preencherOsCamposEmailESenhaCorretamente() {
		metodos.escrever(el.email, "usuarioteste41@yahoo.com", "preenchendo campo email");
		metodos.escrever(el.senha, "Teste123", "preenchendo campo senha");

	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		metodos.clicar(el.btnFazerLogin, "clicando no botao fazer login");
		metodos.esperar(4000);

	}

	@Entao("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
		metodos.screenShot("login_email_e_senha_sucesso");
		metodos.encerrarTeste();

	}

	@Quando("Preencher os campos")
	public void preencherOsCampos() {
		metodos.clicar(el.email, null);
		metodos.clicar(el.senha, null);

	}

	@Quando("os dados estiverem em branco")
	public void osDadosEstiveremEmBranco() {
		metodos.clicar(el.btnFazerLogin, null);
		metodos.esperar(2000);

	}

	@Entao("validamos a mensagem de aviso do sistema")
	public void validamosAMensagemDeAvisoDoSistema() {
		metodos.screenShot("campos_em_branco_login");
		metodos.encerrarTeste();

	}

	@Quando("preencher os dados do login")
	public void preencherOsDadosDoLogin() {
		metodos.escrever(el.email, "e@e.com", "email invalido");

	}

	@Quando("estiverem incorretos")
	public void estiveremIncorretos() {
		metodos.escrever(el.senha, "Teste123", "preenchendo senha");
		metodos.clicar(el.btnFazerLogin, "clicando no botao fazer login");
		metodos.esperar(1000);

	}

	@Entao("sistema informa que email ou senha estao incorretos")
	public void sistemaInformaQueEmailOuSenhaEstaoIncorretos() {
		metodos.screenShot("email_ou_senha_incorretos_login");
		metodos.esperar(1000);
		metodos.encerrarTeste();

	}

	@Quando("clicar no botao recuperar conta antiga")
	public void clicarNoBotaoRecuperarContaAntiga() {
		metodos.clicar(el.resgatarConta, "clicando no botao resgatar conta antiga");

	}

	@Quando("Preencher com email valido")
	public void preencherComEmailValido() {
		metodos.escrever(el.emailResgatarConta, "usuarioteste41@yahoo.com", "preenchendo email valido");

	}

	@Quando("preencher o cpf")
	public void preencherOCpf() {
		metodos.escrever(el.cpfResgatarConta, "11123345676", "preenchendo campo cpf");

	}

	@Quando("clicar no botao recuperar senha")
	public void clicarNoBotaoRecuperarSenha() {
		metodos.clicar(el.btnParaResgatarConta, "clicando para recuperar conta antiga");

	}

	@Entao("email enviado com sucesso")
	public void emailEnviadoComSucesso() {
		metodos.esperar(1000);
		metodos.validarTexto(el.msgEmailEnviado, "", "validando msg de email enviado com sucesso");
		metodos.screenShot("email_enviado_Resgatar_conta_antiga");
		metodos.encerrarTeste();

	}

	@Quando("clicar selecionar opcao conta antiga")
	public void clicarSelecionarOpcaoContaAntiga() {

	}

	@Quando("Preencher campo email com dados invalidos")
	public void preencherCampoEmailComDadosInvalidos() {

	}

	@Quando("preencher o campo cpf")
	public void preencherOCampoCpf() {

	}

	@Quando("clicar na opcao recuperar senha")
	public void clicarNaOpcaoRecuperarSenha() {

	}

	@Entao("sistema retorna uma mensagem no campo com erro")
	public void sistemaRetornaUmaMensagemNoCampoComErro() {

	}

	@Quando("selecionar o botao recuperar conta antiga")
	public void selecionarOBotaoRecuperarContaAntiga() {

	}

	@Quando("Preencher campo email corretamente")
	public void preencherCampoEmailCorretamente() {

	}

	@Quando("preencher o cpf invalido")
	public void preencherOCpfInvalido() {

	}

	@Quando("selecionar o botao recuperar senha")
	public void selecionarOBotaoRecuperarSenha() {

	}

	@Entao("sistema retorna uma mensagem com erro")
	public void sistemaRetornaUmaMensagemComErro() {

	}

	@Quando("clicar no botao esqueci senha")
	public void clicarNoBotaoEsqueciSenha() {
		metodos.clicar(el.esqueciSenha, "acessando menu esqueci senha");

	}

	@Quando("preencher um email valido")
	public void preencherUmEmailValido() {
		metodos.escrever(el.emailEsqueciSenha, "usuarioteste41@yahoo.com", "preenchendo campo email");
		metodos.esperar(2000);

	}

	@Quando("clicar no botao de recuperar senha")
	public void clicarNoBotaoDeRecuperarSenha() {
		metodos.clicar(el.recuperarSenha, "clincando no botao recuperar senha");
		metodos.esperar(2000);

	}

	@Entao("o email e enviado com sucesso")
	public void oEmailEEnviadoComSucesso() {
		metodos.screenShot("esqueci_senha_email_sucesso");
		metodos.encerrarTeste();
		

	}

	@Quando("selecionar botao esqueci senha")
	public void selecionarBotaoEsqueciSenha() {
		metodos.clicar(el.esqueciSenha, "acessando menu esqueci senha");
		

	}

	@Quando("Deixar os campos em branco")
	public void deixarOsCamposEmBranco() {
		metodos.clicar(el.emailEsqueciSenha, null);

	}

	@Quando("escolher a opcao recuperar senha")
	public void escolherAOpcaoRecuperarSenha() {
		metodos.clicar(el.recuperarSenha, "clicando no botao recuperar senha");
		metodos.esperar(1000);

	}

	@Entao("validamos a mensagem de aviso no campo")
	public void validamosAMensagemDeAvisoNoCampo() {
		metodos.screenShot("esqueci_senha_campo_em_branco");
		metodos.encerrarTeste();

	}

	@Quando("selecionar a opcao esqueci senha")
	public void selecionarAOpcaoEsqueciSenha() {
		metodos.clicar(el.esqueciSenha, "acessando menu esqueci senha");

	}

	@Quando("preencher o email com dados invalidos")
	public void preencherOEmailComDadosInvalidos() {
		metodos.escrever(el.emailEsqueciSenha, "testeteste.com", "email invalido");

	}

	@Quando("selecionar botao recuperar senha")
	public void selecionarBotaoRecuperarSenha() {
		metodos.clicar(el.recuperarSenha, "clicando no botao recuperar senha");
		metodos.esperar(1000);
		

	}

	@Entao("retorna uma mensagem no campo com erro")
	public void retornaUmaMensagemNoCampoComErro() {
		metodos.screenShot("esqueci_senha_email_invalido");
		metodos.encerrarTeste();
		

	}

	@Quando("clicar no icone google ou facebook")
	public void clicarNoIconeGoogleOuFacebook() {
	metodos.clicar(el.facebook, "clicando no botao facebook");

	}

	@Quando("selecionar a conta desejada")
	public void selecionarAContaDesejada() {

	}

	@Entao("login social realizaddo com sucesso")
	public void loginSocialRealizaddoComSucesso() {

	}

	@Quando("clicar no icone de login social")
	public void clicarNoIconeDeLoginSocial() {

	}

	@Quando("escolher conta desejada")
	public void escolherContaDesejada() {

	}

	@Quando("preencher idade do usuario")
	public void preencherIdadeDoUsuario() {

	}

	@Quando("clicar no botao prosseguir")
	public void clicarNoBotaoProsseguir() {

	}

	@Entao("login relizado")
	public void loginRelizado() {

	}

}
