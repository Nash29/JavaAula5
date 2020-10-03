
import javax.swing.JOptionPane;


public class Exercicio4 {
    
    public static void main(String[] args) {
        
        int sexo=0, resposta=0, quantSim=0, quantNao=0, mulherSim=0;
        
        while (true) {            
            sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite o sexo do candidato: "));
            
            if (sexo < 0) {
                break;
            }
            
            resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite a resposta do candidato: "));
            
            if (resposta == 1) {
                quantSim++;
            }else if (resposta == 0) {
                quantNao++;
            }
            
            if (sexo == 0 && resposta == 1) {
                mulherSim++;
            }
        }
        
        JOptionPane.showMessageDialog(null, 
                "Numero de pessoas que disseram SIM: " + quantSim
                +"\nNumero de pessoas que disseram NAO: "+ quantNao
                +"\nNumero de mulheres que disseram SIM: "+mulherSim);
    }
    
}
