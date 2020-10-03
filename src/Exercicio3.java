
import javax.swing.JOptionPane;


public class Exercicio3 {
    
    public static void main(String[] args) {
        
        int voto, quantMonteiro = 0, quantiEuclides = 0, cont=0;
        String resultado=null;
        
        while (true) {        
            
            cont++;
            
            voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+cont+" voto: "));
            
            if (voto == 9999) {
                break;
            }
            
            if (voto == 10) {
                quantMonteiro++;
            }else if (voto == 35) {
                quantiEuclides++;
            }
            
            if (quantMonteiro > quantiEuclides) {
                resultado = "Monteiro venceu";
            }else{
                resultado = "Euclides venceu";
            }
            
        }
        
        JOptionPane.showMessageDialog(null,
                "Monteiro recebeu "+quantMonteiro+" votos"
                +"\nEuclides recebeu "+quantiEuclides+" votos"
                +"\nNome do vencedor: "+resultado);
    }
    
}
