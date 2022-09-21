package com.classPart1;

public class Matricula {
//  class fields

    private String nome;
    private String email;
    private String foneNum;

// cria metodo para atualizar os campos da classe
// 'void' significa que o metodo nao vai retornar nenhum valor. Ira dar acesso a um dos campos da classe.
    public void  setNome( String nome)/* parametro do metodo*/{
 //     'this.nome' é a variavel da classe. O metodo main tera acesso a essa classe atraves do parametro do metodo 'nome'
//  Analogia: acessoria de impressa
        this.nome = nome;
    }
//  Enquanto o metodo 'set' atualiza os campos da classe, o metodo 'get' "pega" o valor armazenado na variavel
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // o metodo set pode ser usado para fazer validacoes
        String validEmail = email.toLowerCase(); // converte tudo em minuscula
        if (validEmail.equals("puga@email.com")) { // compara o que vai ser inserido no metodo Main com que esta definido aqui
            this.email = email; // se o email inserido for igual a definido aqui, havera o output do email
        }else {
            this.email = "Unknown"; // caso seja diferente, essa sera a mensagem de output
        }
    }

    public String getFoneNum() {
        return foneNum;
    }

    public void setFoneNum(String foneNum) {
        this.foneNum = foneNum;
    }
}
