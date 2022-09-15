
package atividade1exe04;

import java.util.Scanner;

/* 
 * @author Welton
 */

public class Atividade1Exe04 {
    
    public static void main(String[] args) { 
        
        Scanner entrada = new Scanner(System.in,"latin1");
        
         // Declarando Variáveis 
         
        int menu = 0, i = 0, contHospedes = 0, j = 0;
	String[] nomeHospede = new String[15];
        String nomeBusca, nome;
             
	Boolean encontrado; 
        
        // Criando o MENU do sistema
        
        while (menu!=3){
            System.out.println("\n Escolha uma opção no menu! \t");
            System.out.println("\n [1] - CADASTRAR - [2] - PESQUISAR - [3] - SAIR \n");
            menu = entrada.nextInt(); 
            
            // Validando a opção correta do Menu!
            
            if (menu != 1 && menu != 2 && menu!= 3 ){				        
                System.out.println("\n --- OPÇÃO INVÁLIDA! --- \n");
            }
            
            //------ ACESSANDO A OPÇÃO 1 DO MENU! ---------
            
            if (menu == 1){	
		if (contHospedes >= 15)	{
                    System.out.println("\n ----- Número máximo de hóspedes atingido! --- ");
                    System.out.println("\n --- Escolha a opção 2 ou a opção 3 do MENU! ---"); 
                }
                else {
                    System.out.println(" Digite o nome do hóspede para cadastrar: \n"); 
                    
                    nome = entrada.next();                    
                    nomeHospede[i] = nome;
                    i++;
                    contHospedes++;                    
                    System.out.println(" \n Hóspede cadastrado no sistema! \n");
                }
            }
                //------ ACESSANDO A OPÇÃO 2 DO MENU! ---------
                
                if (menu == 2){
                    System.out.println("Digite o nome do hópede para buscar");
                    nomeBusca = entrada.next();
                    
                    while (j < 0 && j > 14){
                        j++;
                    }
                    encontrado = false;
                    
                    for (j=0; j<=14; j++){					
			if (nomeBusca.equals(nomeHospede[j])){
                            System.out.println("\n O hóspede " + nomeHospede[j] + " foi encontrado no índice " + j + "\n");						
                            encontrado = true;
			}				
                    }			 					
                    if (encontrado == false){						
                        System.out.println("\n Hóspede não encontrado! \n");
                    }
                }                    
        }
        
                //------ ACESSANDO A OPÇÃO 3 DO MENU! ---------
        
        if (menu == 3){
            System.out.println("\n\n ----------  VOCÊ SAIU DO PROGRAMA!  ---------- \n");
        }
            System.out.println("************   FIM  DO  PROGRAMA   ************\n\n");
    }
    
}
