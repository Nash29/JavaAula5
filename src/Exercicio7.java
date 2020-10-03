
import javax.swing.JOptionPane;


public class Exercicio7 {
    
    public static void main(String[] args) {
        
        //Variaveis
        int num1 = 1, num2 = 0, escolha=0;
            
        //escolha vai reber o numero q o usuario digitar
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite até que numero de Fibonacci deseja: "));
        
        // Laço roda pra sempre
        while (true) {       
            
            //Condição de saida
            if (num1 >= escolha) {
                break;
            }
            
            //Calculo do Fibonacci/// OBS: caso n entender me perguntar no whatsapp
            num1 = num1 + num2;
            num2 = num1 - num2;
            
            
            //Mostra cada valor do Fibonacci
            JOptionPane.showMessageDialog(null, num1);
            
            
        }
        
    }
    
}
