package com.classPart1;

public class Main {
    public static void main(String[] args) {
//      Iniciando uma classe
//      Cria um objeto chamdado 'eduInfantil' baseado no modelo 'Matricula'
        Matricula eduInfantil = new Matricula();
        eduInfantil.setNome("Puga");
        eduInfantil.setEmail("maga@email.com");
        System.out.printf("%s é aluno da educacao infantil\n", eduInfantil.getNome());
        System.out.println("Email = " + eduInfantil.getEmail());

        Matricula ensFundamental = new Matricula();
        Matricula ensMedio = new Matricula();

    }
}