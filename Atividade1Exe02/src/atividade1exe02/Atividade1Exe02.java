
package atividade1exe02;

import java.util.Scanner;

/*
 * @author Welton
 */
        /* Escreva um programa Java que faça a troca de quartos entre dois
hospedes. Receba o nome de um cliente e sua idade; ele a princípio será
hospedado no quarto A. Depois receba o nome de outro cliente e sua
idade; se ele for mais jovem, ficará no quarto B, mas se for mais velho que o
primeiro cliente, ele ficará no quarto A e o primeiro cliente ficará no quarto
B. Além disso, se a pessoa mais velha for idosa (tem 60 anos ou mais)
terá desconto de 40%. Mostre ao final o nome do cliente que ficou no
quarto A e o desconto, se possuir, e qual ficou no quarto B.
Exemplo:
[Entrada de dados]
Maria (nome cliente)
20 (idade cliente)
Joao (nome cliente)
60 (idade cliente)
[Saída de dados]
Quarto A: Joao com desconto de 40%; Quarto B: Maria
*/
public class Atividade1Exe02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "latin1");
        
       String nome, name, maiorNome,menorNome, idosoMaior, idosoMenor;
        int idade, age, idoso = 60;

        System.out.println("Digite o nome do Hospede: ");
        nome = entrada.next();

        System.out.println("Digite a idade do Hospede: ");
        idade = entrada.nextInt();

        System.out.println("Digite o nome do  Hospede: ");
        name = entrada.next();

        System.out.println("Digite a idade do Hospede: ");
        age = entrada.nextInt();

        if (age < 0 && idade < 0) {
            System.out.println("Idade inválida, digite uma idade maior que 0!");
        }
        else if (age < idoso && idade < idoso) {
            maiorNome = nome;
            menorNome = name;

            System.out.println("Quarto A " + menorNome + " Quarto B " + maiorNome);
        }
        else if (idade >= idoso && age < idoso) {
             maiorNome = nome;
             menorNome = name;
            System.out.println("Quarto A " + maiorNome + " com desconto de 40% Quarto B " + menorNome );
        }
        else if (age >= idoso && idade < idoso) {
            maiorNome = nome;
            menorNome = name;
            System.out.println("Quarto A " + menorNome + " com desconto de 40% Quarto B " + maiorNome );
        }
        if (age >= idoso && idade >= idoso) {
            idosoMaior = nome;
            idosoMenor = name;

            System.out.println("Quarto A " + idosoMaior + " com desconto de 40% Quarto B " + idosoMenor + " com desconto de 40%" );
        }
    }       
    }
    

