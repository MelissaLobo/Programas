import javax.swing.JOptionPane;

public class TrianguloMelissa {
    private static String stringlado1;
    private static String stringlado2;
    private static String stringlado3;
    
    public static void main(String[] args) {
    
        int a;
        int b;
        int c;
        
        
        stringlado1 = JOptionPane.showInputDialog("Informe o lado 1?"); 
        a = Integer.parseInt(stringlado1);

        stringlado2 = JOptionPane.showInputDialog("Informe o lado 2?"); 
        b= Integer.parseInt(stringlado2);
        
        stringlado3 = JOptionPane.showInputDialog("Informe o lado 3?");
        c= Integer.parseInt(stringlado3);
  
        
      if((a == b) && (b == c)){
        System.out.println("O triângulo é equilátero");  
      }
      else{
        if((a == b) || (a == c) || (c == b)){
          System.out.println("O triângulo é isósceles");  
        }
        else{
          System.out.println("O triângulo é escaleno");
        }
      }
    }
    
    }
