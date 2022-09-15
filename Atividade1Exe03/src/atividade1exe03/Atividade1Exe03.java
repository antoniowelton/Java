
package atividade1exe03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/* 
 * @author Welton
 */
public class Atividade1Exe03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Date relogio = new Date();
        
        // Variáveis 
        float valorPadrao, valorTotal, totalMeia, totalInteira;
	String fecharPrograma = "S", nomeHospede;
        
	int idadeHospede, contGratuidade = 0 , contMeia = 0, contHospede = 0;
        
        System.out.println("Informe o valor padrão da diária: ");
        valorPadrao = entrada.nextInt();
        
        if (valorPadrao < 0)
            {
                System.out.println("Valor inválido. Reinicie o programa!");
            }
        else 
            {
                while (!"p".equals(fecharPrograma))                    
                    {                
                        
                        System.out.println("Informe o nome do hóspede: ");

                        nomeHospede = entrada.next();  // O comando nextLine() não funciona. O programa simplesmente ignora e pula pra próxima linha.
                                                        // Sendo assim, o problema foi resolvido usanso somente .next ()
                        contHospede++;

                        System.out.println("Informe a idade do hóspede: ");
                        idadeHospede = entrada.nextInt();

                        if (idadeHospede >= 0 && idadeHospede <4){
                            System.out.println(nomeHospede + " possui gratuidade!");
                            contGratuidade ++;
                        }
                        if (idadeHospede > 80){
                            System.out.println(nomeHospede + " paga meia!");
                            contMeia ++;
                        }
                        if (idadeHospede < 0){
                            System.out.println("Idade inválida! Informe outro valor para idade!");                    
                        }

                        System.out.println("Cadastrar novo Hóspede: digite 's' | Encerrar: digite 'p'  pra sair do programa:  ");
                        fecharPrograma = entrada.next(); 
                
               
                    }
                
            }
                totalMeia = (float) ((contMeia * 0.5f) * valorPadrao);
                totalInteira = (contHospede - contMeia - contGratuidade) * valorPadrao;
                valorTotal = totalMeia + totalInteira;
                
                
                System.out.println("Valor total com hospedagens: R$" + (valorTotal) + ";");
                System.out.println("Total de hóspedes: " + (contHospede) + " , sendo: ");
                System.out.println("Inteiras:" + (contHospede - contMeia - contGratuidade));
                System.out.println("Gratuidades: " + (contGratuidade));
                System.out.println("Meia(s: " + (contMeia));  
                
                
                System.out.println("-----------------------------------------------------------------------------------------------");
                
                String consulta = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
                System.out.println("Consulta realizada em: " + consulta);
                
                System.out.println("-----------------------------------------------------------------------------------------------");
                
                System.out.println("***********   FIM  DO  PROGRAMA   *************");
        }           
    
}
