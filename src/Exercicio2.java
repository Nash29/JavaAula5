
import javax.swing.JOptionPane;


public class Exercicio2 {
    
    public static void main(String[] args) {
        
        //Variaveis
        int idade=0, maior=0, cont=0;
        String nome=null, nomeMaior=null;
        
        // Laço roda pra sempre
        while (true) {  
            
            cont++;
            
            //Variavel que recebe o nome do aluno
            nome = JOptionPane.showInputDialog("Digite o nome do "+cont+" aluno: ");
            
            //Condição para sair do laço while
            if (nome.trim().equals("")) {
                break;
            }
            
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do "+cont+" aluno: "));
            
            //Acha a maior idade e o nome da pessoa que tem a maior idade
            if (idade > maior) {
                maior = idade;
                nomeMaior = nome;
            }
        }
        
        //Mostra o aluno mais velho e a idade dele
        JOptionPane.showMessageDialog(null, 
                "O aluno mais velho é: " + nomeMaior
                +"\nCom "+maior+" anos");
    }
    
}
