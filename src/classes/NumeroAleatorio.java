


    // [ " CRIADOR: LUIZ ÂNGELO MARTINS " ]:



// PACOTE DA CLASSE:
package classes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.Random;


// MÉTODO PRINCIPAL:
public class NumeroAleatorio {
    
    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    Random aleatorio = new Random();

    
    // FUNÇÃO PARA GERAR OS NÚMEROS ALEATÓRIOS:
    public void gerando_numero( int quantia_a_gerar, int limite_gerador ) {
        
        
        // VARIAVEIS:
        int aux0 = 0;
        int repetidor1 = 0;
        int repetidor2 = 0;
        int vetor_numero[] = new int[quantia_a_gerar];
        System.out.println("");
        
        
            // GERANDO O VETOR:
            while( repetidor1 != quantia_a_gerar ) {
                
                vetor_numero[repetidor1] = aleatorio.nextInt(limite_gerador);
                repetidor1++;
                
            }
            
            
            // ORDENANDO O VETOR:
            for ( int aux1 = 0; aux1 < vetor_numero.length; aux1++ ) {
                
                for ( int aux2 = 0; aux2 < vetor_numero.length; aux2++) {
                    
                    if ( vetor_numero[aux1] < vetor_numero[aux2] ) {
                        
                        aux0 = vetor_numero[aux1];
                        vetor_numero[aux1] = vetor_numero[aux2];
                        vetor_numero[aux2] = aux0;
                        
                    }
                    
                }
                
            }
               
            
            // EXIBINDO OS VALORES:
            while( repetidor2 != vetor_numero.length ) {
                
                System.out.println("ALEATÓRIO [ " + ( repetidor2 + 1 ) + " ] - " + vetor_numero[repetidor2] );
                repetidor2++;
                
            }
        
        System.out.println("");
        System.out.println("NÚMEROS GERADOS COM SUCESSO!");
        System.out.println("");
        
    }
    
    
}




