import java.util.Scanner;
import java.lang.Math;


public class QuantidadeNecessaria {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);
    
        double fatiasNecessarias = 0;
        
        int T = scanner.nextInt();
        for(int i = 0; i < T; i++){
          int numeroDeAmigos = scanner.nextInt();
          int quantidadeFatia = scanner.nextInt();
          fatiasNecessarias = numeroDeAmigos * quantidadeFatia;
        }
        
        double totalPizzas = Math.round((fatiasNecessarias / SLICE));
        System.out.println(Math.round(totalPizzas));
            
      }
    }  

