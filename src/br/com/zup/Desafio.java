package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    HashMap<String, String> funcionarios = new HashMap<String, String>();

    //Declarando variáveis

    int contador = 1;
    int voltarAoMenu = 0;
    int opcaoEscolhida = 0;
    String nomeDoFuncionario = "";
    String telefoneDoFuncionario = "";
    String emailDoFuncionario = "";
    String cpfDoFuncionario = "";

    //Apresentando o programa

    System.out.println("Bem vinde! Este programa quer te auxiliar a criar uma lista de funcionários, que possa ser gerenciada por você sem dificuldades.");
    System.out.println("Vamos começar?");

    //Criando menu e inserindo mais funcionários

    do {
      System.out.println(""); //pulando uma linha
      System.out.println("MENU - Considere as opções a seguir:");
      System.out.println("1 - Inserir novo funcionário;");
      System.out.println("2 - Exibir lista completa de funcionários cadastrados;");
      System.out.println("3 - Encerrar programa.");
      System.out.println("0 - Voltar ao menu principal");
      System.out.println(""); //pulando uma linha
      System.out.println("Por favor, digite a opção desejada: ");
      opcaoEscolhida = leitor.nextInt();

      leitor.nextLine();

      switch (opcaoEscolhida) {
        case 1:
          System.out.println("Nome completo do funcionário: ");
          nomeDoFuncionario = leitor.nextLine();
          System.out.println("Telefone do funcionário: ");
          telefoneDoFuncionario = leitor.nextLine();
          System.out.println("E-mail do funcionário: ");
          emailDoFuncionario = leitor.nextLine();
          System.out.println("CPF do funcionário: ");
          cpfDoFuncionario = leitor.nextLine();
          funcionarios.put(cpfDoFuncionario, " Nome: " + nomeDoFuncionario + " Telefone: " + telefoneDoFuncionario + " Email: " + emailDoFuncionario);

          System.out.println("Para voltar ao menu, digite 0");
          voltarAoMenu = leitor.nextInt();
          break;

        case 2:
          for (String chaveCPF : funcionarios.keySet()) {
            System.out.println(funcionarios.get(chaveCPF) + chaveCPF);
          }
          System.out.println(funcionarios);
          break;

        case 3:
          System.out.println("O programa foi encerrado!");
          System.out.println(""); //pulando uma linha
          System.out.println("DESEJA RETORNAR?");
      }

    } while (voltarAoMenu == 0);


  }
}


