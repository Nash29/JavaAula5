
import javax.swing.JOptionPane;


public class Exercicio5 {
    
    public static void main(String[] args) {
        
        int quant=0;
        double poupA = 80000, poupB = 200000, aumentoA=0, aumentoB=0;
        
        while (true) {  
            
            quant++;
            
            poupA += (poupA * 0.03);
            poupB +=((poupB * 1.5) / 100);
            
            if (poupA >= poupB) {
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Quantos anos? " + quant);
        
    }
    
}
