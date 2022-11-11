#language: pt

   @easyApply
Funcionalidade: Candidatura Rapida
  Como usuario
  Quero realizar a candidatura rapida
  Para acessar o portal

Contexto: acessando a tela de candidatura rapida
Dado que eu esteja no menu de cadidatura rapida
  
  @positivio @smoke
  Cenario: CT26-Realizar candidatura rapida
    Quando preencher os dados corretamente
    E clicar no botao enviar meu cv
    Entao candidatura enviada com sucesso

@negativo 
 Cenario: CT27-Candidatura rapida campos em branco
    Quando preencher os dados
    E os campos estiverem em branco
    Entao sistema retorna mensagem nos campos
    
    @positivo 
    Cenario: CT28-Candidatura rapida campo data de nascimento invalido
    Quando preencher os campos do formulario
    E data de nascimento estiver invalida
    Entao sistema retorna um modal com mensagem de aviso 
    
    @negativo
    Cenario: CT29-Candidatura rapida senha sem numeral
    Quando preencher formulario
    E no campo senha preencher com senha sem numeral
    Entao sistemma retorna mensagem de aviso sem numeral
    
    @negativo 
    Cenario: CT30-Candidatura rapida senha sem maiuscula
    Quando Preencher o formulario
    E no campo senha preencher com senha sem maiuscula
    Entao sistemma retorna mensagem de aviso na senha sem maiuscula
    
     @negativo 
    Cenario: CT31-Candidatura rapida senha sem minuscula
    Quando Preencher campos
    E no campo senha preencher com senha sem minuscula
    Entao sistemma retorna mensagem de aviso na senha sem minuscula
    
     @negativo 
    Cenario: CT32-Candidatura rapida senha sem oito caracteres
    Quando Preencher o formulario com dados
    E no campo senha preencher com senha sem oito caractere
    Entao sistemma retorna mensagem de aviso na senha sem oito caractere
    
    
    
    @negativo
    Cenario: CT33-Candidatura rapida campo email invalido
    Quando Prencher os campos do formulario
    E campo email conter dados invalidos
    Entao valido a resposta de retorno do sistema
    
    @negativo  
    Cenario: CT34-Candidatura rapida campo nome invalido
    Quando escrever nos campos
    E dados do campo nome forem invalidos
    Entao valido resposta do sistema no campo nome
    
    @positivo  
    Cenario: CT35-Candidatura rapida login comum
    Quando preencher campo email com dados validos
    E preencher campo senha corretamente
    E clicar no botao candidatar-se
    Entao login candiatura realizada com sucesso
    
    @negativo  
    Cenario: CT36-Candidatura rapida login comum email invalido
    Quando preencher campo email
    E os dados forem incorretos
    Entao valido retorno do sistema
    
    @negativo 
    Cenario: CT37-Candidatura rapida login comum senha invalida
    Quando preencher campo senha
    E os dados nao estiverem corretos
    Entao valido a mensagem de retorno do sistema 
    
    @positivo 
    Cenario: CT38-Candidatura rapida login social facebook
    Quando clicar no botao login com facebook
    Entao login social realizado com sucesso
    
    @positivo 
    Cenario: CT39-Candidatura rapida login social google
    Quando clicar no botao login com google
    Entao login social com google com sucesso
    
    @positivo @regressivos
    Cenario: CT40-Candidatura rapida usuario menor de idade
    Quando inserir os dados nos campos do formulario
    E no campo idade informar que usuario for menor de idade
    E inserir dados dos responsaveis corretamente
    E clicar pra enviar a candidatura
    Entao validamos o retorno do sistema
    
    @negativo
    Cenario: CT41-Usuario menor de idade campo responsaveis em branco
    Quando inserir os dados no formulario
    E na idade informar que for menor de idade
    E nos campos dos responsaveis permanecer em branco
    Entao sistema nao permite prosseguir
    
    @negativo  
    Cenario: CT42-Usuario menor de idade nome responsavel invalido
    Quando inseir os dados nos campos
    E no campo informar a idade do usuario de menor
    E nos campos dos responsaveis inseir nome invalido
    Entao nao permite avancar no cadastro
    
    @negativo 
    Cenario: CT43-Usuario menor de idade email invalido
    Quando estiver criando um usuario novo
    E informar na idade que usuario e menor de idade
    E nos campos dos responsaveis informar email invalido
    Entao validamos a mensagem de erro abaixo do campo
    
    @negativo 
    Cenario: CT44-Usuario com idade nao permitida
    Quando estiver criando um novo usuario
    E colocar dados informando que a idade nao e permitida
    Entao validamos modal de retorno do sistema
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    