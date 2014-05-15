import javax.swing.JOptionPane;

public class Usando_ElseIf {
    
public static void main(String[] args) {
        
        String nome;
        nome = JOptionPane.showInputDialog("Sobre qual menbro da minha família deseja saber?");

     if(nome.equals("bruno")){
            System.out.println("O amor da minha vida");
        }else if(nome.equals("pai")){
            System.out.println("Uma lembranca que nunca existiu");
        }else if(nome.equals("irma")){
            System.out.println("É reencontrar a infância no sorriso refletido no olhar da gente");
        }else if(nome.equals("mae")){
            System.out.println("A razao do meu viver");
        }else{
           System.out.println("Não faz parte da família");
        }
    
 }
}

