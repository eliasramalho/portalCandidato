#language: pt

@regressivos @CadastroRapido
Funcionalidade: Realizar cadastro rapido
Como usuario 
Quero acessar o site da randstand
Para realizar o cadastro rapido

Contexto: acessar a tela de cadastro rapido
Dado que eu esteja na tela de cadastro rapido

@positivo @smoke
Cenario: Realizar o cadastro rapido
Quando eu preencher os dados corretamente
E incluir um curriculo
E aceitar os termos e condicoes
Entao sistema realiza o cadastro de usuario

@negativo 
Cenario: Realizar cadastro com campos em branco
Quando nao preencher os campos 
Entao o sistema retorna a mensagem de erro
		
@negativo		
Cenario: Preencher campo email com dados invlidos
Quando preencher o campo email
E os dados forem invalidos
Entao o sistema retorna uma mensagem

@positivo 
Cenario: Preencher campos data nascimento com dados invalidos
Quando Preencher o campo data de nascimento
Mas Contem dados invalidos no campo
Entao O sistema retorna um modal com uma mensagem

@positivo @teste
Cenario: Usuario menor de quatorze anos
Quando preencher os campos com dados corretos
E usuario for menor de quatorze anos
E enviar o curriculo
Entao o sistema retorna uma modal 











