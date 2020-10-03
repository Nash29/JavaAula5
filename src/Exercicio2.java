
import javax.swing.JOptionPane;


public class Exercicio2 {
    
    public static void main(String[] args) {
        
        int idade=0, maior=0, cont=0;
        String nome=null, nomeMaior=null;
        
        while (true) {  
            
            cont++;
            
            nome = JOptionPane.showInputDialog("Digite o nome do "+cont+" aluno: ");
            
            if (nome.trim().equals("")) {
                break;
            }
            
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do "+cont+" aluno: "));
            
           
            
            if (idade > maior) {
                maior = idade;
                nomeMaior = nome;
            }
        }
        
        JOptionPane.showMessageDialog(null, 
                "O aluno mais velho é o: " + nomeMaior);
    }
    
}
