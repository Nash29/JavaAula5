
import javax.swing.JOptionPane;


public class Exercicio6 {
    
    public static void main(String[] args) {
        
        int num1=0, num2=0;
        
        // Laço roda pra sempre
        while (true) {       
            
            /* pegas os dois numeros o primeiro vai ser elevado ao segundo
            Ex: 2³ == 2^3
            */
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° valor: "));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° valor: "));
            
            /*Math.pow -> é uma 'instrução' em java que ajudar a gente elevar os numeros
            Expli: faz uma variavel pra receber o resultado, o numero q sera
            elevado é 'num1' e o valor por quanto sera elevado vai ser 'num2'
            */
            double val = Math.pow(num1, num2);
            
            //Vai mostrar o valor do numero elevado
            JOptionPane.showMessageDialog(null, "Valor: " + val);
            
        }
        
    }
    
}
