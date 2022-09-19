#language: pt

@teste @easyApply
Funcionalidade: Candidatura Rapida
  Como usuario
  Quero realizar a candidatura rapida
  Para acessar o portal

Contexto: acessando a tela de candidatura rapida
Dado que eu esteja no menu de cadidatura rapida
  
  @positivio @smoke 
  Cenario: Candidatura rapida
    Quando preencher os dados corretamente
    E clicar no botao enviar meu cv
    E clicar na pergunta filtro
    Entao candidatura enviada com sucesso

 