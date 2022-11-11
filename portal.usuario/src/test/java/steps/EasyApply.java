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
		metodos.escrever(el.emailEasy, "diy32v87@lidely.com", "preenchendo campo email");
		metodos.escrever(el.senhaEasy, "Teste123", "preenchendo campo senha");
		metodos.aceitarTermosEasyApply("aceitando termos de uso");

	}

	@Quando("clicar no botao enviar meu cv")
	public void clicarNoBotaoEnviarMeuCv() {
		metodos.clicar(el.enviarCandidatura, "enviando curriculo");

	}

	@Entao("candidatura enviada com sucesso")
	public void candidaturaEnviadaComSucesso() {
		metodos.esperar(8000);
		metodos.validarTexto(el.msgCandidaturaSucesso, "obrigado por se candidatar", "validando msg de sucesso ");
		metodos.screenShot("CT26-candidatura_rapida_sucesso");
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
		metodos.screenShot("CT27-campos_em_branco_easy_apply");
		metodos.encerrarTeste();

	}

	@Quando("preencher os campos do formulario")
	public void preencherOsCamposDoFormulario() {
		metodos.escrever(el.nomeEasy, "Teste nascimento invalido", "escrevendo nome");

	}

	@Quando("data de nascimento estiver invalida")
	public void dataDeNascimentoEstiverInvalida() {
		metodos.escrever(el.dataEasy, "01011048", "preenchendo nascimento");

	}

	@Entao("sistema retorna um modal com mensagem de aviso")
	public void sistemaRetornaUmModalComMensagemDeAviso() {
		metodos.esperar(2000);
		metodos.screenShot("CT28-nascimento_invalido_easy_apply");
		metodos.encerrarTeste();

	}

	@Quando("preencher formulario")
	public void preencherFormulario() {
		metodos.escrever(el.nomeEasy, "Senha sem numeral", "escrevendo nome");
		metodos.escrever(el.dataEasy, "01012000", "preenchendo nascimento");
		metodos.clicar(el.curriculoEasy, "clicando em upload de curriculo");
		metodos.uploadArquivo("anexando curriculo");
		metodos.esperar(1000);
		metodos.escrever(el.emailEasy, "n8ib2@eiaa.com", "preenchendo campo email");

	}

	@Quando("no campo senha preencher com senha sem numeral")
	public void noCampoSenhaPreencherComSenhaSemNumeral() {
		metodos.escrever(el.senhaEasy, "Testeteste", "preenchendo campo senha sem numeral");
		metodos.clicar(el.verSenhaEasy, "visualizar senha");

	}

	@Entao("sistemma retorna mensagem de aviso sem numeral")
	public void sistemmaRetornaMensagemDeAvisoSemNumeral() {
		metodos.esperar(1000);
		metodos.validarTexto(el.msgErroSenhaNumeral, "1 número", "validando msg de erro sem numeral");
		metodos.screenShot("CT29-senha_sem_numeral_easy_apply");
		metodos.encerrarTeste();

	}

	@Quando("Preencher o formulario")
	public void preencherOFormulario() {
		metodos.escrever(el.nomeEasy, "Senha sem maiuscula", "escrevendo nome");
		metodos.escrever(el.dataEasy, "01012000", "preenchendo nascimento");
		metodos.clicar(el.curriculoEasy, "clicando em upload de curriculo");
		metodos.uploadArquivo("anexando curriculo");
		metodos.esperar(1000);

	}

	@Quando("no campo senha preencher com senha sem maiuscula")
	public void noCampoSenhaPreencherComSenhaSemMaiuscula() {
		metodos.escrever(el.senhaEasy, "teste1234", "preenchendo campo senha sem maiuscula");
		metodos.clicar(el.verSenhaEasy, "visualizar senha");

	}

	@Entao("sistemma retorna mensagem de aviso na senha sem maiuscula")
	public void sistemmaRetornaMensagemDeAvisoNaSenhaSemMaiuscula() {
		metodos.esperar(1000);
		metodos.validarTexto(el.msgErroSenhaMaiuscula, "1 letra maíuscula", "validando msg de erro sem maiuscula");
		metodos.screenShot("CT30-senha_sem_maiuscula_easy_apply");
		metodos.encerrarTeste();

	}

	@Quando("Preencher campos")
	public void preencherCampos() {
		metodos.escrever(el.nomeEasy, "Senha sem minuscula", "escrevendo nome");
		metodos.escrever(el.dataEasy, "01012000", "preenchendo nascimento");
		metodos.clicar(el.curriculoEasy, "clicando em upload de curriculo");
		metodos.uploadArquivo("anexando curriculo");
		metodos.esperar(1000);

	}

	@Quando("no campo senha preencher com senha sem minuscula")
	public void noCampoSenhaPreencherComSenhaSemMinuscula() {
		metodos.escrever(el.senhaEasy, "TESTE1234", "preenchendo campo senha sem minuscula");
		metodos.clicar(el.verSenhaEasy, "visualizar senha");

	}

	@Entao("sistemma retorna mensagem de aviso na senha sem minuscula")
	public void sistemmaRetornaMensagemDeAvisoNaSenhaSemMinuscula() {
		metodos.esperar(1000);
		metodos.validarTexto(el.msgErroSenhaMinusclua, "1 letra minúscula", "validando msg de erro sem minuscula");
		metodos.screenShot("CT31-senha_sem_minuscula_easy_apply");
		metodos.encerrarTeste();

	}

	@Quando("Preencher o formulario com dados")
	public void preencherOFormularioComDados() {
		metodos.escrever(el.nomeEasy, "Senha sem oito caracteres", "escrevendo nome");
		metodos.escrever(el.dataEasy, "01012000", "preenchendo nascimento");
		metodos.clicar(el.curriculoEasy, "clicando em upload de curriculo");
		metodos.uploadArquivo("anexando curriculo");
		metodos.esperar(1000);

	}

	@Quando("no campo senha preencher com senha sem oito caractere")
	public void noCampoSenhaPreencherComSenhaSemOitoCaractere() {
		metodos.escrever(el.senhaEasy, "Teste12", "preenchendo campo senha sem oito caracteres");
		metodos.clicar(el.verSenhaEasy, "visualizar senha");

	}

	@Entao("sistemma retorna mensagem de aviso na senha sem oito caractere")
	public void sistemmaRetornaMensagemDeAvisoNaSenhaSemOitoCaractere() {
		metodos.esperar(1000);
		metodos.validarTexto(el.msgErroSenhaOito, "8 caracteres", "validando msg de erro sem oito caracteres");
		metodos.screenShot("CT32-senha_sem_oito_caracteres_easy_apply");
		metodos.encerrarTeste();

	}

	@Quando("Prencher os campos do formulario")
	public void prencherOsCamposDoFormulario() {
		metodos.escrever(el.nomeEasy, "Campo email invalido", "escrevendo nome");
		metodos.escrever(el.dataEasy, "01012000", "preenchendo nascimento");
		metodos.clicar(el.curriculoEasy, "clicando em upload de curriculo");
		metodos.uploadArquivo("anexando curriculo");
		metodos.esperar(1000);

	}

	@Quando("campo email conter dados invalidos")
	public void campoEmailConterDadosInvalidos() {
		metodos.escrever(el.emailEasy, "teste.com.br", "escrevendo email invalido");
		metodos.clicar(el.senhaEasy, null);

	}

	@Entao("valido a resposta de retorno do sistema")
	public void validoARespostaDeRetornoDoSistema() {
		metodos.esperar(1000);
		metodos.validarTexto(el.msgErroEmailEasy, "Por favor, forneça um formato de Email válido",
				"validando msg de erro no email");
		metodos.screenShot("CT33-teste_email_invalido_easy");
		metodos.encerrarTeste();

	}

	@Quando("escrever nos campos")
	public void escreverNosCampos() {
		metodos.escrever(el.dataEasy, "01012000", null);

	}

	@Quando("dados do campo nome forem invalidos")
	public void dadosDoCampoNomeForemInvalidos() {
		metodos.escrever(el.nomeEasy, "1E", "escrevendo nome invalido");
		metodos.clicar(el.dataEasy, null);

	}

	@Entao("valido resposta do sistema no campo nome")
	public void validoRespostaDoSistemaNoCampoNome() {
		metodos.esperar(1000);
		metodos.validarTexto(el.msgErroCampoNomeEasy, "", "validando msg erro nome invalido");
		metodos.screenShot("CT34-nome_invalido_easy");
		metodos.encerrarTeste();

	}

	@Quando("preencher campo email com dados validos")
	public void preencherCampoEmailComDadosValidos() {
		metodos.escrever(el.emailEasy1, "diyep73287@lidely.com", "preenchendo email corretamente");

	}

	@Quando("preencher campo senha corretamente")
	public void preencherCampoSenhaCorretamente() {
		metodos.escrever(el.senhaEasy2, "Teste123", "preenchendo senha corretamente");

	}

	@Quando("clicar no botao candidatar-se")
	public void clicarNoBotaoCandidatarSe() {
		metodos.clicar(el.btnCandidatarEasy, "clicando no botao candidatar se");
		metodos.esperar(8000);

	}

	@Entao("login candiatura realizada com sucesso")
	public void loginCandiaturaRealizadaComSucesso() {
		metodos.validarTexto(el.msgCandidaturaSucesso, "obrigado por se candidatar",
				"validando msg candidatura efetuada");
		metodos.screenShot("CT35-candidatura_com_sucesso");
		metodos.esperar(1000);
		metodos.encerrarTeste();

	}

	@Quando("preencher campo email")
	public void preencherCampoEmail() {
		metodos.escrever(el.emailEasy1, "teste.com.br", "preenchendo email invalido");

	}

	@Quando("os dados forem incorretos")
	public void osDadosForemIncorretos() {
		metodos.escrever(el.senhaEasy2, "Teste123", "escrevendo senha");

	}

	@Entao("valido retorno do sistema")
	public void validoRetornoDoSistema() {
		metodos.esperar(2000);
		metodos.validarTexto(el.msgErroEmailEasy1, "Por favor, forneça um formato de Email válido", "validando msg erro email invalido");
		metodos.screenShot("CT36-email_invalido_easy");
		//metodos.encerrarTeste();

	}

	@Quando("preencher campo senha")
	public void preencherCampoSenha() {
		metodos.escrever(el.emailEasy1, "usuarioteste41@yahoo.com", "escrevendo email");
		metodos.esperar(1000);

	}

	@Quando("os dados nao estiverem corretos")
	public void osDadosNaoEstiveremCorretos() {
		metodos.escrever(el.senhaEasy2, "Teste122345", "escrevendo senha invalida");
		metodos.esperar(1000);
		metodos.clicar(el.btnCandidatarEasy, null);

	}

	@Entao("valido a mensagem de retorno do sistema")
	public void validoAMensagemDeRetornoDoSistema() {
		metodos.esperar(1000);
		metodos.screenShot("CT37-msg_email_ou_senha_invalidos");
		metodos.encerrarTeste();

	}

	@Quando("clicar no botao login com facebook")
	public void clicarNoBotaoLoginComFacebook() {
		metodos.clicar(el.facebookEasy, "login social faceboook");
		metodos.esperar(4000);

	}

	@Entao("login social realizado com sucesso")
	public void loginSocialRealizadoComSucesso() {
		metodos.screenShot("CT38-login_social_facebook");
		metodos.encerrarTeste();

	}

	@Quando("clicar no botao login com google")
	public void clicarNoBotaoLoginComGoogle() {
		metodos.clicar(el.googleEasy, "login social google");
		metodos.esperar(4000);

	}

	@Entao("login social com google com sucesso")
	public void loginSocialComGoogleComSucesso() {
		metodos.screenShot("CT39-login_social_google");
		metodos.encerrarTeste();

	}

	@Quando("inserir os dados nos campos do formulario")
	public void inserirOsDadosNosCamposDoFormulario() {
		metodos.escrever(el.nomeEasy, "usuario menor de idade", "preenchendo campo nome");
		metodos.clicar(el.curriculoEasy, "clicando em upload de curriculo");
		metodos.uploadArquivo("anexando curriculo");
		metodos.esperar(1000);
		metodos.escrever(el.emailEasy, "na5k57u2@kmo5to.com", "preenchendo campo email");
		metodos.escrever(el.senhaEasy, "Teste123", "preenchendo campo senha");
		metodos.aceitarTermosEasyApply("aceitando termos de uso");
		metodos.esperar(2000);

	}

	@Quando("no campo idade informar que usuario for menor de idade")
	public void noCampoIdadeInformarQueUsuarioForMenorDeIdade() {
		metodos.escrever(el.dataEasy, "01012008", "data de nascimento");

	}

	@Quando("inserir dados dos responsaveis corretamente")
	public void inserirDadosDosResponsaveisCorretamente() {
		metodos.escrever(el.nomeResponsavelEasy, "teste de responsavel", "nome responsavel");
		metodos.escrever(el.emailResponsavelEasy, "tesltue1234@tese.com", "email respponsavel");
		metodos.esperar(2000);
		metodos.clicar(el.btnProsseguir, "prosseguindo");
		metodos.esperar(2000);

	}

	@Quando("clicar pra enviar a candidatura")
	public void clicarPraEnviarACandidatura() {
		metodos.clicar(el.enviarCandidatura, "enviiando candidatura");
		metodos.esperar(9000);

	}

	@Entao("validamos o retorno do sistema")
	public void validamosORetornoDoSistema() {
		metodos.validarTexto(el.msgCandidaturaSucesso, "obrigado por se candidatar", "validando msg de sucesso ");
		metodos.esperar(1000);
		metodos.screenShot("CT40-candidatura_rapida_usuario_menor_sucesso");
		metodos.encerrarTeste();

	}

	@Quando("inserir os dados no formulario")
	public void inserirOsDadosNoFormulario() {
		metodos.escrever(el.nomeEasy, "usuario menor de idade", "preenchendo campo nome");
		metodos.clicar(el.curriculoEasy, "clicando em upload de curriculo");
		metodos.uploadArquivo("anexando curriculo");
		metodos.esperar(1000);
		metodos.escrever(el.emailEasy, "neki272@kmo5to.com", "preenchendo campo email");
		metodos.escrever(el.senhaEasy, "Teste123", "preenchendo campo senha");
		metodos.aceitarTermosEasyApply("aceitando termos de uso");
		metodos.esperar(2000);

	}

	@Quando("na idade informar que for menor de idade")
	public void naIdadeInformarQueForMenorDeIdade() {
		metodos.escrever(el.dataEasy, "01012008", "data de nascimento");

	}

	@Quando("nos campos dos responsaveis permanecer em branco")
	public void nosCamposDosResponsaveisPermanecerEmBranco() {
		metodos.clicar(el.nomeResponsavelEasy, "clicando no nome responsavel");
		metodos.clicar(el.emailResponsavelEasy,  "clicando no email respponsavel");
		metodos.clicar(el.nomeResponsavelEasy, "clicando no nome responsavel");
		metodos.esperar(2000);
		

	}

	@Entao("sistema nao permite prosseguir")
	public void sistemaNaoPermiteProsseguir() {
		metodos.screenShot("CT41-modal_responsaveis_em_branco");
		metodos.encerrarTeste();

	}

	@Quando("inseir os dados nos campos")
	public void inseirOsDadosNosCampos() {
		metodos.escrever(el.nomeEasy, "usuario menor de idade", "preenchendo campo nome");
		metodos.clicar(el.curriculoEasy, "clicando em upload de curriculo");
		metodos.uploadArquivo("anexando curriculo");
		metodos.esperar(1000);
		metodos.escrever(el.emailEasy, "a1k7e@kmo5to.com", "preenchendo campo email");
		metodos.escrever(el.senhaEasy, "Teste123", "preenchendo campo senha");
		metodos.aceitarTermosEasyApply("aceitando termos de uso");
		metodos.esperar(2000);

	}

	@Quando("no campo informar a idade do usuario de menor")
	public void noCampoInformarAIdadeDoUsuarioDeMenor() {
		metodos.escrever(el.dataEasy, "01012008", "data de nascimento");

	}

	@Quando("nos campos dos responsaveis inseir nome invalido")
	public void nosCamposDosResponsaveisInseirNomeInvalido() {
		metodos.escrever(el.nomeResponsavelEasy, "te12", "nome responsavel");
		metodos.escrever(el.emailResponsavelEasy, "test1234@tese.com", "email respponsavel");
		metodos.esperar(1000);
		metodos.clicar(el.btnProsseguir, "prosseguindo");
		metodos.esperar(1000);

	}

	@Entao("nao permite avancar no cadastro")
	public void naoPermiteAvancarNoCadastro() {
		metodos.screenShot("CT42-modal_responsaveis_nome_invalido");
		metodos.encerrarTeste();
		
		

	}

	@Quando("estiver criando um usuario novo")
	public void estiverCriandoUmUsuarioNovo() {
		metodos.escrever(el.nomeEasy, "modal responsaveis email invalido", null);

	}

	@Quando("informar na idade que usuario e menor de idade")
	public void informarNaIdadeQueUsuarioEMenorDeIdade() {
		metodos.escrever(el.dataEasy, "01012008", null);
		metodos.esperar(1000);

	}

	@Quando("nos campos dos responsaveis informar email invalido")
	public void nosCamposDosResponsaveisInformarEmailInvalido() {
		metodos.escrever(el.nomeResponsavelEasy, "teste email invalido", null);
		metodos.esperar(1000);
		metodos.escrever(el.emailResponsavelEasy, "teste.com", null);
		metodos.esperar(1000);
		metodos.clicar(el.btnProsseguirEasy, null);
		metodos.esperar(1000);

	}

	@Entao("validamos a mensagem de erro abaixo do campo")
	public void validamosAMensagemDeErroAbaixoDoCampo() {
		metodos.validarTexto(el.msgEmailInvalidoEasy, "Por favor, forneça um formato de Email válido", "validando msg de email invalido");
		metodos.screenShot("CT43-modal_responsaveis_email_invalido");
		metodos.encerrarTeste();

	}

	@Quando("estiver criando um novo usuario")
	public void estiverCriandoUmNovoUsuario() {
		metodos.escrever(el.nomeEasy, "idade nao permitida", null);

	}

	@Quando("colocar dados informando que a idade nao e permitida")
	public void colocarDadosInformandoQueAIdadeNaoEPermitida() {
		metodos.escrever(el.dataEasy, "01012010", "preenchendo campo com idade invalida");
		metodos.esperar(2000);

	}

	@Entao("validamos modal de retorno do sistema")
	public void validamosModalDeRetornoDoSistema() {
		metodos.validarTexto(el.idadeNaoPermitida, "Idade não permitida", "validadndo idade nao permitida");
		metodos.screenShot("CT44-idade_nao_permitida_easy");
		metodos.encerrarTeste();
		

	}

}
