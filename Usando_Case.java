import javax.swing.JOptionPane;

public class Usando_Case {

    public static void main(String[] args) {
        
        String nome;
        nome = JOptionPane.showInputDialog("Sobre qual menbro da minha família deseja saber?");

        switch (nome) {
            case "bruno": {
                System.out.println("O amor da minha vida");
                break;
            }
            case "pai": {
                System.out.println("Uma lembranca que nunca existiu");
                break;
            }
            case "irma": {
                System.out.println("É reencontrar a infância no sorriso refletido no olhar da gente");
                break;
            }
            case "mae": {
                System.out.println("A razao do meu viver");
                break;
            }
            
            default: {
                System.out.println("Essa pessoa nao faz parte da família");
                break;
            }
        }
    }
}

    
