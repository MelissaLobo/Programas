import javax.swing.JOptionPane;

public class TrianguloBruno {

    
    public static void main(String[] args) {
    
        int numeroLado1;
        int numeroLado2;
        int numeroLado3;

       String stringlado1;
       String stringlado2;
       String stringlado3;
        
        stringlado1 = JOptionPane.showInputDialog("Informe o lado 1?"); 
        numeroLado1= Integer.parseInt(stringlado1);

        stringlado2 = JOptionPane.showInputDialog("Informe o lado 2?"); 
        numeroLado2= Integer.parseInt(stringlado2);
        
        stringlado3 = JOptionPane.showInputDialog("Informe o lado 3?");
        numeroLado3= Integer.parseInt(stringlado3);
  
    
      if((numeroLado1 == numeroLado2) && (numeroLado2 == numeroLado3)){
        System.out.println("O triângulo é equilátero");  
      }
      else{
        if((numeroLado1 == numeroLado2) || (numeroLado1 == numeroLado3) || (numeroLado3 == numeroLado2)){
          System.out.println("O triângulo é isósceles");  
        }
        else{
          System.out.println("O triângulo é escaleno");
        }
        
    }
}   
}
