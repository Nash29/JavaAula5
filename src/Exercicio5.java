
import javax.swing.JOptionPane;


public class Exercicio5 {
    
    public static void main(String[] args) {
        
        //Varialvel
        int quant=0;
        double poupA = 80000, poupB = 200000, aumentoA=0, aumentoB=0;
        
        // Laço roda pra sempre
        while (true) {  
            
            quant++;
            
            //Acrescenta 3% a cada loop do while
            poupA += (poupA * 0.03);
            //Acrescenta 1,5% a cada loop do while
            poupB +=((poupB * 1.5) / 100);
            
            //Condição de saida do loop
            if (poupA >= poupB) {
                break;
            }
        }
        
        // Mostra quanto anos vai demorar para poupA igualar ou passar de poupB
        JOptionPane.showMessageDialog(null, "Quantos anos? " + quant);
        
    }
    
}
