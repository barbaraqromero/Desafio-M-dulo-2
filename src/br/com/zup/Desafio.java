package br.com.zup;

/*Crie um programa para gerenciar uma lista de funcionários de uma empresa,
cada funcionário tem nome, telefone, email e CPF. No final do programa deve ser
exibida a lista de funcionários cadastrados.

Entrega Mínima: O sistema permite, via terminal, inserir pelo menos 1 funcionário
em uma lista e retornar o mesmo na tela.

Entrega Média: O sistema permite adicionar mais de um funcionário e apresenta
um menu para decidir se deverá:
1. Adicionar mais funcionários.
2. Exibir a lista de todos os funcionários cadastrados.
3. Encerrar o programa.

Entrega Máxima: O Sistema permite excluir um funcionário usando como
parâmetro o CPF e não permite inserir um funcionário com o CPF repetido.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    HashMap<String, String> funcionarios = new HashMap<String, String>();

    //Apresentando o programa
    System.out.println("Bem vinde! Este programa quer te auxiliar a criar uma lista de funcionários, que possa ser gerenciada por você sem dificuldades.");
    System.out.println("Vamos começar?");

    //Inserindo dados do funcionário, cadastrando em uma lista e mostrando para o usuário
    System.out.println("Nome completo do funcionário: ");
    String nomeDoFuncionario = leitor.nextLine();
    System.out.println("Telefone do funcionário: ");
    String telefoneDoFuncionario = leitor.nextLine();
    System.out.println("E-mail do funcionário: ");
    String emailDoFuncionario = leitor.nextLine();
    System.out.println("CPF do funcionário: ");
    String cpfDoFuncionario = leitor.nextLine();

    funcionarios.put(cpfDoFuncionario, " Nome: " + nomeDoFuncionario + " Telefone: " + telefoneDoFuncionario + " Email: " +emailDoFuncionario);
    System.out.println(funcionarios);



  }
}
