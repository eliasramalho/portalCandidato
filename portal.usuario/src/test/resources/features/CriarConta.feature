#language: pt

 @criarConta
Funcionalidade: Criar Conta
Como usuario
Quero criar nova conta
Para acessar o portal

Contexto: acessar a tela de cadastro comum
Dado que eu esteja na tela de login

@positivo @smoke 
Cenario: Realizar cadastro de usuario 
Quando eu clicar no botao criar conta
E preencher formulario com dados validos
E aceitar os termos e condicoes e aviso de privacidade
E clicar no botao criar conta
Entao validamos mensagem de sucesso

@negativo @criarConta 
Cenario: Preencher o cadastro com os campos todos em branco
Quando deixar os campos em branco
E clicar no botao fazer login
Mas o botao nao esta clicavel
Entao validamos a mensagem de aviso

@negativo @criarConta 
Cenario: Preencher o cadastro com data de nascimento invalida
Quando for criar a conta
E preencher os campos com os dados validos
E campo idade for preenchido com dado invalido
E clicar no botao de criar conta
Entao validamos mensagem de sucesso do sistema

@negativo @criarConta 
Cenario: Preencher cadastro com email invalido
Quando colocar os dados no campo email
E as informacoes dos dados forem invalidas
Entao validamos a mensagem de erro no campo email

@negativo @criarConta  
Cenario: Preencher cadastro com telefone invalido
Quando preencher o campo telefone
E os dados estiverem incorretos
Entao sistema retorna mensagem de erro no campo

@negativo @criarConta @validarSenha
Cenario: Prencher formulario senha sem letra minuscula
Quando clicar no campo senha
E preencher dados sem uma letra minuscula
Entao valido o retorno do sistema

@negativo @criarConta @validarSenha
Cenario: Prencher cadastro senha sem letra maiuscula
Quando clicar no campo de preencher senha
E colocar dados que nao contem letra maiuscula
Entao validamos a mensagem do sistema 

@negativo @criarConta @validarSenha
Cenario: Prencher cadastro senha sem oito caracteres
Quando Clicar no campo de senha
E Inserir dados sem os oito caraceteres
Entao sistema retorna uma mensagem

@negativo @criarConta @validarSenha 
Cenario: Prencher cadastro senha sem numeral 
Quando preenher o campo senha
E inseir dados que nao contem numeral
Entao Validamos a mensagem de aviso de retorno do sistema

@negativo @criarConta @validarTermos @teste
Cenario: criar usuario e nao aceitar os termos de uso
Quando preencher formulario para criar novo usuario
Mas nao aceitar os termos
Entao botao criar conta nao fica selecionavel























