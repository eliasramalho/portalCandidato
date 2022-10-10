#language: pt

 @easyApply
Funcionalidade: Candidatura Rapida
  Como usuario
  Quero realizar a candidatura rapida
  Para acessar o portal

Contexto: acessando a tela de candidatura rapida
Dado que eu esteja no menu de cadidatura rapida
  
  @positivio @smoke 
  Cenario: Realizar candidatura rapida
    Quando preencher os dados corretamente
    E clicar no botao enviar meu cv
    Entao candidatura enviada com sucesso

@negativo 
 Cenario: Candidatura rapida campos em branco
    Quando preencher os dados
    E os campos estiverem em branco
    Entao sistema retorna mensagem nos campos
    
    @positivo 
    Cenario: Candidatura rapida campo data de nascimento invalido
    Quando preencher os campos do formulario
    E data de nascimento estiver invalida
    Entao sistema retorna um modal com mensagem de aviso 
    
    @negativo 
    Cenario: Candidatura rapida senha sem numeral
    Quando preencher formulario
    E no campo senha preencher com senha sem numeral
    Entao sistemma retorna mensagem de aviso sem numeral
    
    @negativo 
    Cenario: Candidatura rapida senha sem maiuscula
    Quando Preencher o formulario
    E no campo senha preencher com senha sem maiuscula
    Entao sistemma retorna mensagem de aviso na senha sem maiuscula
    
     @negativo 
    Cenario: Candidatura rapida senha sem minuscula
    Quando Preencher campos
    E no campo senha preencher com senha sem minuscula
    Entao sistemma retorna mensagem de aviso na senha sem minuscula
    
     @negativo 
    Cenario: Candidatura rapida senha sem oito caracteres
    Quando Preencher o formulario com dados
    E no campo senha preencher com senha sem oito caractere
    Entao sistemma retorna mensagem de aviso na senha sem oito caractere
    
    @negativo
    Cenario: Candidatura rapida campo email invalido
    Quando Prencher os campos do formulario
    E campo email conter dados invalidos
    Entao valido a resposta de retorno do sistema
    
    @negativo  
    Cenario: Candidatura rapida campo nome invalido
    Quando escrever nos campos
    E dados do campo nome forem invalidos
    Entao valido resposta do sistema no campo nome
    
    @positivo @regressivos
    Cenario: Candidatura rapida login comum
    Quando preencher campo email com dados validos
    E preencher campo senha corretamente
    E clicar no botao candidatar-se
    Entao login candiatura realizada com sucesso
    
    @negativo
    Cenario: Candidatura rapida login comum email invalido
    Quando preencher campo email
    E os dados forem incorretos
    Entao valido retorno do sistema
    
    @negativo
    Cenario: Candidatura rapida login comum senha invalida
    Quando preencher campo senha
    E os dados nao estiverem corretos
    Entao valido a mensagem de retorno do sistema 
    
    @positivo
    Cenario: Candidatura rapida login social facebook
    Quando clicar no botao login com facebook
    Entao login social realizado com sucesso
    
    @positivo
    Cenario: Candidatura rapida login social google
    Quando clicar no botao login com google
    Entao login social com google com sucesso
    
    
    
    
    