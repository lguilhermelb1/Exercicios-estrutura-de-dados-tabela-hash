/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios4;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    //Menu da tabela
    public static char menu() {
        String msg;
        System.out.println("\n1 para cadastrar funcionário");
        System.out.println("2 para conceder aumento percentual para todos os funcionários");
        System.out.println("3 para exibir soma de salários superiores a 500 reais");
        System.out.println("4 para consultar todos os funcionários");
        System.out.println("5 para excluir por nome");
        System.out.println("6 para fechar o menu");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Hash hash = new Hash();
        Funcionario f;

        float s;
        String n;
        float total = 0; //Para somar os salarios maiores que 500

        char opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case '1':
                    System.out.println("\nInserindo funcionário");
                    f = new Funcionario();
                    System.out.println("\nDigite o nome");
                    n = l.next();
                    f.setNome(n);
                    System.out.println("\nDigite o salário");
                    s = l.nextFloat();
                    if(s > 500){
                        total = total + s;
                    }
                    f.setSalario(s);
                    hash.inserir(f);
                    break;
                case '2':
                    System.out.println("\nDigite o percentual do aumento");
                    s = l.nextFloat();
                    for (int i = 0; i < hash.qtd; i++) {
                        hash.Funcionarios[i].aumentarSalario(s);
                    }
                    System.out.println("Todos os salários foram aumentados");
                    break;
                case '3':
                    System.out.println("\nSoma de salários maiores que 500 reais:");
                    System.out.println("\n" + total);
                    break;
                case '4':
                    System.out.println("\nExibindo todos os funcionários:");
                    for (int i = 0; i < hash.qtd; i++) {
                        System.out.println(hash.Funcionarios[i].imprimir());
                    }
                    break;
                case '5':
                    System.out.println("\nDigite o nome que deseja excluir");
                    n = l.next();
                    for (int i = 0; i < hash.qtd; i++) {
                        hash.Funcionarios[i].remover(n);
                    }
                    break;
                case '6':
                    System.out.println("\nDesligando programa");
                    break;
                default:
                    System.out.println("\nOpção inexistente, tente novamente");
            }
        } while (opcao != '6');
        System.exit(0);
    }

}
