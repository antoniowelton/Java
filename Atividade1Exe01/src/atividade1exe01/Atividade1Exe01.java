/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1exe01;

import java.util.Scanner;

/*
 * @author Welton
 */
public class Atividade1Exe01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner entrada = new Scanner(System.in);
        short numConvidados, cadeirasExtras;
        
        System.out.println("Informe o número de convidados:");        
        numConvidados = (short) entrada.nextInt();
        
        if (numConvidados < 0 || numConvidados > 350){
            System.out.println("Número de convidados inválido!");
            System.out.println("Por favor, informe um número de 0 a 350!");
        }
        if (numConvidados > 220 && numConvidados <= 350){
            System.out.println("Use o auditório Beta!");
        }
        if (numConvidados >= 0 && numConvidados <= 220){
            System.out.println("Use o auditório Alfa! ");
        }
        
        cadeirasExtras =  (short) (numConvidados - 150);
        
        if (numConvidados > 150 && numConvidados <= 220){
        System.out.println("Adicione " + (cadeirasExtras) + " cadeiras extras!");
    }    
        
        
    }
    
}
