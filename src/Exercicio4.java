
import javax.swing.JOptionPane;


public class Exercicio4 {
    
    public static void main(String[] args) {
        
        int sexo=0, resposta=0, quantSim=0, quantNao=0, mulherSim=0;
        
        // Laço roda pra sempre
        while (true) {         
            //Variavel que recebe o sexo
            sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite o sexo do candidato: "));
            
            //Condição de saida
            if (sexo < 0) {
                break;
            }
            
            // Variavel que recebe a resposta
            resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite a resposta do candidato: "));
            
            //Adiciona +1 para cada resposta
            if (resposta == 1) {
                quantSim++;
            }else if (resposta == 0) {
                quantNao++;
            }
            
            // Adiciona +1 para cada mulher que responder sim
            if (sexo == 0 && resposta == 1) {
                mulherSim++;
            }
        }
        
        /*Mostra numero de pessoas que disseram SIM
        Mostra numero de pessoas que disseram NAO
        Mostra o numero de MULHERES que disseram SIM
        */
        JOptionPane.showMessageDialog(null, 
                "Numero de pessoas que disseram SIM: " + quantSim
                +"\nNumero de pessoas que disseram NAO: "+ quantNao
                +"\nNumero de mulheres que disseram SIM: "+mulherSim);
    }
    
}
