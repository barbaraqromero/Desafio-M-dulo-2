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

    //Criando uma nova opção no menu (4) que permite excluir um funcionário a partir da chave (cpf)

    while (voltarAoMenu == 0) {
      System.out.println("\nMENU - Considere as opções a seguir:");
      System.out.println("1 - Inserir novo funcionário;");
      System.out.println("2 - Exibir lista completa de funcionários cadastrados;");
      System.out.println("3 - Excluir um funcionário;");
      System.out.println("4 - Encerrar programa;");
      System.out.println("0 - Voltar ao menu principal.");
      System.out.println("\nPor favor, digite a opção desejada: ");
      opcaoEscolhida = leitor.nextInt();
      leitor.nextLine();

      //Recebendo dados de um novo funcionário a ser cadastrado

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

          //Verificando duplicidade de chave (cpf)

          if (funcionarios.containsKey(cpfDoFuncionario)) {
            System.out.println("Ops, este CPF já consta em nosso sistema!");
          }

          //Incluindo dados na hashmap

          funcionarios.put(cpfDoFuncionario, " Nome: " + nomeDoFuncionario + " Telefone: " + telefoneDoFuncionario + " Email: " + emailDoFuncionario);

          System.out.println("Para voltar ao menu, digite 0");
          voltarAoMenu = leitor.nextInt();
          break;

        //Exibindo funcionários cadastrados

        case 2:
          for (String chaveCPF : funcionarios.keySet()) {
            System.out.println(funcionarios.get(chaveCPF) + chaveCPF);
          }
          System.out.println(funcionarios);
          System.out.println("\nPara voltar ao menu, digite 0");
          voltarAoMenu = leitor.nextInt();
          break;

        //Excluindo um funcionário

        case 3:
          System.out.println("Por favor, insira o número CPF que deseja excluir: ");
          cpfDoFuncionario = leitor.nextLine();
          funcionarios.remove(cpfDoFuncionario);
          System.out.println("Funcionário excluído!");
          System.out.println("\nPara voltar ao menu, digite 0");
          voltarAoMenu = leitor.nextInt();
          break;

        //Encerrando o programa

        case 4:
          System.out.println("O programa foi encerrado!");
          voltarAoMenu = -1;
          break;

        //Sinalizando sobre opção inválida

        default:
          System.out.println("Opção inválida!");
      }

    }
  }
}



