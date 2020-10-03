
import javax.swing.JOptionPane;


public class main {
    
    public static void main(String[] args) {
        
        String menu = "*** Escolha uma opção"
                + "\n1 - Exercicio 1"
                + "\n2 - Exemplo 2"
                + "\n3 - Exemplo 3"
                + "\n4 - Exemplo 4"
                + "\n5 - Exemplo 5"
                + "\n6 - Exemplo 6"
                + "\n7 - Exemplo 7";
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch (opcao) {
            case 1:
                Exercicio1.main(args);
                break;
            case 2:
                Exercicio2.main(args);
                break;
            case 3:
                Exercicio3.main(args);
                break;
            case 4:
                Exercicio4.main(args);
                break;
            case 5:
                Exercicio5.main(args);
                break;
            case 6:
                Exercicio6.main(args);
                break;
            case 7:
                Exercicio7.main(args);
                break;
            default:
                break;
        }
    }
    
}
