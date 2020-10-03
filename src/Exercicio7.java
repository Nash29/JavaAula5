
import javax.swing.JOptionPane;


public class Exercicio7 {
    
    public static void main(String[] args) {
        
        int num1 = 1, num2 = 0, escolha=0;
        
        System.out.println(num2);
        System.out.println(num1);
            
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite até que numero de Fibonacci deseja: "));
        
        while (true) {       
            
            if (num1 >= escolha) {
                break;
            }
            
            num1 = num1 + num2;
            num2 = num1 - num2;
            
            
            JOptionPane.showMessageDialog(null, num1);
            
            
        }
        
    }
    
}
