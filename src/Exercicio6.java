
import javax.swing.JOptionPane;


public class Exercicio6 {
    
    public static void main(String[] args) {
        
        int num1=0, num2=0;
        
        while (true) {       
            
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° valor: "));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° valor: "));
            
            double val = Math.pow(num1, num2);
            
            JOptionPane.showMessageDialog(null, "Valor: " + val);
            
        }
        
    }
    
}
