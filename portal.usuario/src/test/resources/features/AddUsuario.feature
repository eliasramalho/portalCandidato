#language: pt

@addUsuario
Funcionalidade: Menu login
Como usuario quero criar uma conta 

@adicionar
Cenario: Adicionar novo usuario
Dado que eu esteja na tela de login
Quando eu clicar no botao criar conta
E preencher os campos com dados validos
E aceitar os termos e condicoes e aviso de privacidade
E clicar no botao criar conta
Entao validamos mensagem de sucesso
