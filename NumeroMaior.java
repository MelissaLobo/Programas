import javax.swing.JOptionPane;

public class NumeroMaior {

    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int numero3;
        int numeroMaior;

       String primeiroNumero;
       String segundoNumero;
       String terceiroNumero;
       
       
        String stringprimeiroNumero = JOptionPane.showInputDialog("Informe o primeiro numero?"); 
        numero1= Integer.parseInt(stringprimeiroNumero);

        String stringsegundoNumero = JOptionPane.showInputDialog("Informe o segundo numero?"); 
        numero2= Integer.parseInt(stringsegundoNumero);
        
        String stringterceiroNumero = JOptionPane.showInputDialog("Informe o terceiro numero?"); 
        numero3= Integer.parseInt(stringterceiroNumero);
        
       
        if((numero1 > numero2)){
           numeroMaior=numero1;
        }else{
           numeroMaior=numero2;
        }
        
        if(numeroMaior > numero3){
            System.out.println(numeroMaior);
        }else{
            System.out.println(numero3);
        }
 
    }
   
}
