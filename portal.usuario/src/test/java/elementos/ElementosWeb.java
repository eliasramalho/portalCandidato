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
	
		
		//elementos da pag de sucesso
		public By leveParaLogin = By.xpath("//span[text()=' me leve para o login ']");
		
		//xpath da mensagem de validacao
		public By msgSucesso = By.xpath("//h1[text()='email enviado.']");
		
		//xpath dos elementos do menu login
		public By email = By.xpath("//*[@id=\"mat-input-4\"]");
		public By senha = By.xpath("//*[@id=\"mat-input-5\"]");
		public By btnFazerLogin = By.xpath("//span[text()='fazer login ']");
		
		
		//perfil do usuario
		public By campoBuscaHome = By.xpath("//*[@id=\"mat-input-6\"]");
		public By btnBuscar = By.xpath("//button[@class='mat-focus-indicator perso-button search-button mat-stroked-button mat-button-base mat-primary']");
		public By texto = By.xpath("//p[text()='é hora de impulsionar o seu talento.']");
		public By menu = By.xpath("//*[@id=\"profileOptionsButton\"]");
		
		//xpath dos elementos do perfil
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
		public By cVaqui = By.xpath("//div[@class='upload-container']");
		public By cRtermos = By.xpath("//label[@for='mat-checkbox-7-input']");
		public By cRaviso = By.xpath("//label[@for='mat-checkbox-8-input']");
		
		
		//xpath elementos Easy Apply
		public By nomeEasy = By.xpath("//*[@id=\"mat-input-4\"]");
		public By dataEasy = By.xpath("//*[@id=\"mat-input-5\"]");
		public By emailEasy = By.xpath("//*[@id=\"mat-input-6\"]");
		public By senhaEasy = By.xpath("//*[@id=\"mat-input-7\"]");
		public By curriculoEasy = By.xpath("//h3[text()=' clique e arraste até aqui ou clique para buscar o arquivo no seu computador. ']");
		
	
		
		
		
		//xpath elementos em Prod
		public By cookies = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
		public By emailProd = By.xpath("//*[@id=\"mat-input-0\"]");
		public By senhaProd = By.xpath("//*[@id=\"mat-input-1\"]");
		public By fazerLoginPtod = By.xpath("//span[text()='fazer login ']");
		
		public By btnPerfil = By.xpath("//*[@id=\"profileOptionsButton\"]/img");
		public By emailEnviado = By.xpath("//h1[text()='email enviado.']");
		
		
}
