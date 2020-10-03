
import javax.swing.JOptionPane;


public class Exercicio1 {
    
    public static void main(String[] args) {
        
        int codigo=0, quant=0, conta=0;
        double val=0, total=0;
        String resp=null;
        
        while (true) {     
            
            conta++;
            
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do "+conta+" produto: "));
            
            if (codigo == 0) {
                break;
            }
            
            quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendas do "+conta+" produto: "));
            
            switch (codigo) {
                case 1:
                    val = quant * 2.99;
                    break;
                case 2:
                    val = quant * 2.19;
                    break;
                case 3:
                    val = quant * 0.99;
                    break;
                default:
                    break;
            }
            
            resp = "Valor da venda do "+conta+" produto: " + val;
            JOptionPane.showMessageDialog(null, 
                "\n"+resp);
            total +=val;
        }
        
        JOptionPane.showMessageDialog(null,
                "\nValor total: "+ total);
        
    }
    
}
