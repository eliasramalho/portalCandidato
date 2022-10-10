package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	//xpath esqueci senha
		public By esqueciSenha = By.xpath("//a[text()='esqueci a senha ']");
		public By emailEsqueciSenha = By.xpath("//*[@id=\"mat-input-6\"]");
		public By recuperarSenha = By.xpath("//span[text()='recuperar senha']"); 
				//By.xpath("//button[@class='mat-focus-indicator perso-button perso-button-link "
				//+ "link social mat-stroked-button mat-button-base mat-button-disabled']//span[text()='recuperar senha']");
		public By criarNovaConta = By.xpath("//a[@class='mat-focus-indicator perso-button perso-button-link link social mat-stroked-button mat-button-base']//span[text()='criar uma nova conta']");
		public By voltar = By.xpath("//span[text()='voltar']");

		
		//xpath do menu criar conta
		public By cliqueAqui = By.xpath("//span[text()='Clique aqui']");
		public By btnCriarConta = By.xpath("//*[text()='criar conta ']");
		public By nomeCompleto = By.xpath("//*[@id=\"mat-input-6\"]");
		public By dataNascimento = By.xpath("//*[@id=\"mat-input-7\"]");
		public By emailCriarConta = By.xpath("//*[@id=\"mat-input-8\"]");
		public By telefone = By.xpath("//*[@id=\"mat-input-9\"]");
		public By senhaCriarConta = By.xpath("//*[@id=\"mat-input-10\"]");
		public By confSenhaCriarConta = By.xpath("//*[@id=\"mat-input-11\"]");
		public By mostrarSenha = By.xpath("//div[@class='mat-checkbox-inner-container']");
		public By termoUso = By.xpath("//span[text()=' li e concordo com os Termos e Condições de Uso ']");
		public By entendi = By.xpath("//span[text()='entendi']");
		public By avisoPrivacidade = By.xpath("//*[@id=\"mat-checkbox-6\"]/label");
		public By criarConta = By.xpath("//span[text()='criar conta']");
		public By msgEmailInvalido = By.xpath("//span[text()='Por favor, forneça um formato de Email válido']");
		
			
		
		//elementos da pag de sucesso
		public By msgSucessoCriarConta = By.xpath("//h1[text()='Confirme sua conta no seu e-mail']");
		public By btnLeveParaLogin = By.xpath("//span[text()=' me leve para o login ']");
		
		
		//xpath da mensagem de validacao
		public By msgSucesso = By.xpath("//h1[text()='email enviado.']");
		
		//xpath modal de permissao requerida
		public By nomeResponsavel = By.id("mat-input-4");
		public By emailResponsavel = By.id("mat-input-5");
		public By btnProsseguir = By.xpath("//span[text()='prosseguir']");
		
		
		//xpath dos elementos do menu login
		public By email = By.xpath("//*[@id=\"mat-input-4\"]");
		public By senha = By.xpath("//*[@id=\"mat-input-5\"]");
		public By btnFazerLogin = By.xpath("//span[text()='fazer login ']");
		public By resgatarConta = By.xpath("//*[text()='resgatar conta antiga ']");
		public By emailResgatarConta = By.xpath("//app-public-recover-account/div/div/form/mat-form-field[1]/div/div[1]/div[3]");
		public By cpfResgatarConta = By.xpath("//div[@class='mat-form-field-infix ng-tns-c113-22']");
		public By btnParaResgatarConta = By.xpath("//span[text()='recuperar senha']");
		public By msgEmailEnviado = By.xpath("//h1[text()='email enviado.']");
		public By facebook = By.xpath("//span[text()=' Facebook ']");
		public By google = By.xpath("//*[@class='google-icon']");
		
		//perfil do usuario
		public By campoBuscaHome = By.xpath("//*[@id=\"mat-input-6\"]");
		public By btnBuscar = By.xpath("//button[@class='mat-focus-indicator perso-button search-button mat-stroked-button mat-button-base mat-primary']");
		public By texto = By.xpath("//p[text()='é hora de impulsionar o seu talento.']");
		public By menu = By.xpath("//*[@id=\"profileOptionsButton\"]");
		public By meuCurriculo = By.xpath("//a[text()='meu currículo']");
		public By analista = By.xpath("//h1[text()='Analista de Desenvolvimento Pleno']");
		public By resultadoBusca = By.xpath("/html/body/div[2]/div/div/app-root/app-private-layout/main/section/app-private-search//div/div[2]/button/span[1]");
		public By favoritar = By.xpath("//html/body/div[2]/div//app-root/app-private-layout/main//app-private-candidature-card/div/div[1]/i");
		public By seCandidatar = By.xpath("//span[text()='me candidatar']");
		public By confCandidatura = By.xpath("//span[text()='confirmar candidatura']");
				
		
		
		//xpath dos elementos do cadastro rapido
		public By cRnomeCompleto = By.xpath("//*[@id=\"mat-input-0\"]");
		public By cRnascimento = By.xpath("//*[@id=\"mat-input-1\"]");
		public By cRemail = By.xpath("//*[@id=\"mat-input-2\"]");
		public By cRsenha = By.xpath("//*[@id=\"mat-input-3\"]");
		public By cRCurriculo = By.xpath("//div[@class='upload-container']");
		public By cRtermos = By.xpath("//*[@id=\"mat-checkbox-1\"]/label/div");
		public By cREntendi = By.xpath("//span[text()='entendi']");
		public By cRaviso = By.xpath("//*[@id=\"mat-checkbox-2\"]/label/div");
		public By cRSalvarCadastro = By.xpath("//span[text()=' salvar cadastro ']");
		public By cRMsgSucesso = By.xpath("");
		public By msgErroNome = By.xpath("//*[text()='Nome do Responsável']");
		public By msgErroEmail = By.xpath("//span[text()='Por favor, forneça um formato de Email válido']");
		public By msgSenhaNumeral = By.xpath("//p[text()='Pelo menos um Número ou Símbolo']");
		public By msgSenhaMinuscula = By.xpath("//p[text()='Pelo menos uma Letra Minúscula']");
		public By msgSenhaMaiuscula = By.xpath("//p[text()='Pelo menos uma Letra Maiúscula']");
		public By msgSenhaOito = By.xpath("//p[text()='Pelo menos Oito Caracteres']");
		
		
		
		//xpath elementos Easy Apply
		public By nomeEasy = By.id("mat-input-0");
		public By dataEasy = By.id("mat-input-1");
		public By emailEasy = By.id("mat-input-2");
		public By senhaEasy = By.id("mat-input-3");
		public By curriculoEasy = By.xpath("//div[@class='upload-container']");
		public By enviarCandidatura = By.xpath("//*[text()=' enviar minha candidatura ']");
		public By avisoEasy = By.xpath("//*[@id=\"mat-checkbox-2-input\"]");
		public By msgErroCampoNomeEasy = By.xpath("//*[text()=' Por favor, preencha o campo Nome Completo ']");
		public By msgErroCampoDataEasy = By.xpath("//*[@id=\"mat-error-1\"]");
		public By verSenhaEasy = By.xpath("//img[@class='eye-icon ng-tns-c113-3']");
		public By msgErroSenhaOito = By.xpath("//*/div/div/main/div[1]/div/form[1]/div[4]/p[1]");
		public By msgErroSenhaMinusclua = By.xpath("//*/div/div/main/div[1]/div/form[1]/div[4]/p[2]");
		public By msgErroSenhaMaiuscula = By.xpath("//*/div/div/main/div[1]/div/form[1]/div[4]/p[3]");
		public By msgErroSenhaNumeral = By.xpath("//*/div/div/main/div[1]/div/form[1]/div[4]/p[4]");
		public By msgErroEmailEasy = By.xpath("//*[@id=\"mat-error-6\"]/span");
		public By btnCandidatarEasy = By.xpath("//span[text()=' candidatar-se ']");
		
		
	
		
		
		
		//xpath elementos em Prod
		public By cookies = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
		//public By emailProd = By.xpath("//*[@id=\"mat-input-0\"]");
		//public By senhaProd = By.xpath("//*[@id=\"mat-input-1\"]");
		//public By fazerLoginPtod = By.xpath("//span[text()='fazer login ']");
		
		
		//public By btnPerfil = By.xpath("//*[@id=\"profileOptionsButton\"]/img");
		//public By emailEnviado = By.xpath("//h1[text()='email enviado.']");
		
		
		
}
