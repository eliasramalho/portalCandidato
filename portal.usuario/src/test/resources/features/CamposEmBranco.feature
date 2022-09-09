#language: pt

@CamposEmBranco
Funcionalidade: Criar conta
Como usuario quero preencher os campos do formulario

@testeRapido
Cenario: Campos em Branco

Dado que eu esteja no menu de login
Quando deixar os campos em branco
E clicar no botao fazer login
Mas o botao nao esta clicavel
Entao validamos a mensagem de aviso