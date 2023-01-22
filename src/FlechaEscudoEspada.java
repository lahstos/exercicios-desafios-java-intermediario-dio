import java.util.Scanner;  

public class FlechaEscudoEspada {  
    public static void main(String[] args){  

        Scanner leitor = new Scanner(System.in);  

        int jogadaJogador = leitor.nextInt();  
        int jogadaInimigo = leitor.nextInt(); 
        
        int pedra = 1;
        int papel = 2;
        int tesoura = 3;
        
        // 1 - Pedra 
        // 2 - Papel 
        // 3 - Tesoura 
        
        switch(jogadaJogador) {
          case 1:
            if(jogadaInimigo == tesoura) {
              System.out.println("Ganhou");
              break;
            }
            if(jogadaInimigo == pedra) {
              System.out.println("Empatou");
              break;
            }
            if(jogadaInimigo == papel) {
              System.out.println("Perdeu");
              break;
            }
          case 2:
            if(jogadaInimigo == pedra) {
              System.out.println("Ganhou");
              break;
            }
            if(jogadaInimigo == papel) {
              System.out.println("Empatou");
              break;
            }
            if(jogadaInimigo == tesoura) {
              System.out.println("Perdeu");
              break;
            }
          case 3:
            if(jogadaInimigo == papel) {
              System.out.println("Ganhou");
              break;
            }
            if(jogadaInimigo == tesoura) {
              System.out.println("Empatou");
              break;
            }
            if(jogadaInimigo == pedra) {
              System.out.println("Perdeu");
              break;
            }
        }
     }
}