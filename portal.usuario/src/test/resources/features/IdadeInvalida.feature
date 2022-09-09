#language: pt

@idadeInvalida
Funcionalidade: Menu login
Como usuario quero preencher campo com dados invalidos

@testeRapido
Cenario:  Idade com dados invalidos

Dado que eu esteja no menu de criar conta
Quando clicar no campo idade
E preencher com dados invalidos
Entao o validamos a resposta de mensagem de aviso