import java.util.Random;
import java.util.Scanner;



public class sorteio {
  
    public static void main(String[] args)
    {
        sorteando(new Scanner(System.in));
    }
    
        public static void sorteando(Scanner scanner)
        {
            int verificação = 1;
            int tentativas = 0;

            Random random = new Random();
            int sorteado = random.nextInt(20000) + 0;
            System.out.println("estamos comecando o palpite e acerto;");
            
            while (verificação == 1) 
            {
              System.out.println("vamos-la qual e seu palpite?");
              int palpite = Integer.parseInt(scanner.next());
              

                if (palpite > sorteado) 
                {
                    System.out.println("vc errou!!!, o numero e menor\n tente denovo");
                }
                if (palpite == sorteado) 
                {
                    System.err.println("parabens!!!, vc acertou o numero");
                    verificação ++;
                    System.out.println("vc acertou com : "+(tentativas+1)+" tentativas");
                    return;
                }
                if (palpite < sorteado) 
                {   
                    System.out.println("vc errou!!!, o numero e maior\n tente denovo");
                }
                tentativas++;
            }
        }
}