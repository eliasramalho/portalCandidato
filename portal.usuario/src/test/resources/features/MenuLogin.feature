#language: pt

 @menuLogin
Funcionalidade: Realizar login comum
Como usuario 
Quero realizar o login 
Para acessar o portal

Contexto: Acessar a tela de login
Dado que eu esteja no menu login

@positivo @smoke
Cenario: Fazer login comum
Quando preencher os campos email e senha corretamente
E clicar no botao login
Entao login realizado com sucesso

@negativo 
Cenario: Campos em branco
Quando Preencher os campos
E os dados estiverem em branco
Entao validamos a mensagem de aviso do sistema

@negativo
Cenario: Preencher email ou senha invalidos
Quando preencher os dados do login
E estiverem incorretos
Entao sistema informa que email ou senha estao incorretos

@positivo
Cenario: Recuperar conta antiga
Quando clicar no botao recuperar conta antiga
E Preencher com email valido
E preencher o cpf
E clicar no botao recuperar senha
Entao email enviado com sucesso

@negativo
Cenario: Recuperar conta antiga com email invalido
Quando clicar selecionar opcao conta antiga
E Preencher campo email com dados invalidos
E preencher o campo cpf
E clicar na opcao recuperar senha
Entao sistema retorna uma mensagem no campo com erro

@negativo
Cenario: Recuperar conta antiga com cpf invalido
Quando selecionar o botao recuperar conta antiga
E Preencher campo email corretamente
E preencher o cpf invalido
E selecionar o botao recuperar senha
Entao sistema retorna uma mensagem com erro

@positivo
Cenario: Reset de senha
Quando clicar no botao esqueci senha
E preencher um email valido
E clicar no botao de recuperar senha
Entao o email e enviado com sucesso

@negativo
Cenario: Reset de senha com email em branco
Quando selecionar botao esqueci senha
E Deixar os campos em branco
E escolher a opcao recuperar senha
Entao validamos a mensagem de aviso no campo

@negativo
Cenario: Reset de senha com email invalido
Quando selecionar a opcao esqueci senha
E preencher o email com dados invalidos
E selecionar botao recuperar senha
Entao retorna uma mensagem no campo com erro

@positivo
Cenario: Realizar login social
Quando clicar no icone google ou facebook
E selecionar a conta desejada
Entao login social realizaddo com sucesso

@positivo
Cenario: Login social com conta nova
Quando clicar no icone de login social
E escolher conta desejada
E preencher idade do usuario
E clicar no botao prosseguir
Entao login relizado













