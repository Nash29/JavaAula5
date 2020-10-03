
import javax.swing.JOptionPane;


public class Exercicio1 {
    
    public static void main(String[] args) {
        
        // Variaveis
        int codigo=0, quant=0, conta=0;
        double val=0, total=0;
        String resp=null;
        
        // Roda pra sempre
        while (true) {     
            
            // Sempre vai adicionar 1 a cada volta
            conta++;
            
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do "+conta+" produto: "));
            
            // Opção para sair do laço While
            if (codigo == 0) {
                break;
            }
            
            quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendas do "+conta+" produto: "));
            
            switch (codigo) {
                case 1:
                    // Calculo caso o codigo for 1
                    val = quant * 2.99;
                    break;
                case 2:
                    // Calculo caso o codigo for 2
                    val = quant * 2.19;
                    break;
                case 3:
                    // Calculo caso o codigo for 3
                    val = quant * 0.99;
                    break;
                default:
                    break;
            }
            
            //Variavel que recebe o valor da venda dos produtos
            resp = "Valor da venda do "+conta+" produto: " + val;
            
            // JOptionPane -> Mostra o resultado a cada volta do laço while
            JOptionPane.showMessageDialog(null, 
                "\n"+resp);
            total +=val;
        }
        
        // Mostra o valor total de todas as vendas /// essa parte é fora do laço while
        JOptionPane.showMessageDialog(null,
                "\nValor total: "+ total);
        
    }
    
}
