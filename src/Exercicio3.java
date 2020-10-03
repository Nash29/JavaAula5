
import javax.swing.JOptionPane;


public class Exercicio3 {
    
    public static void main(String[] args) {
        
        // Variaveis
        int voto, quantMonteiro = 0, quantiEuclides = 0, cont=0;
        String resultado=null;
        
        // Laço roda pra sempre
        while (true) {        
            
            cont++;
            
            voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+cont+" voto: "));
            
            //Condição para sair do laço while
            if (voto == 9999) {
                break;
            }
            
            // Adiciona +1 para cada candidato, SE for o numero dele
            if (voto == 10) {
                quantMonteiro++;
            }else if (voto == 35) {
                quantiEuclides++;
            }
            
            // Manda pra variavel resultado o nome do vencedor
            if (quantMonteiro > quantiEuclides) {
                resultado = "Monteiro venceu";
            }else{
                resultado = "Euclides venceu";
            }
            
        }
        
        /* Mostra quantos votos Monteiro recebeu,
        Mostra quantos votos Euclides recebeu
        E mostra o nome do vencedor
        */
        JOptionPane.showMessageDialog(null,
                "Monteiro recebeu "+quantMonteiro+" votos"
                +"\nEuclides recebeu "+quantiEuclides+" votos"
                +"\nNome do vencedor: "+resultado);
    }
    
}
