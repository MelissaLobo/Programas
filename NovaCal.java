public class NovaCal {
   
    public static void main(String[] args) {
    
    int numero1;
    int operador;
    int numero2;
    int resultado;
    
    String primeiroNumero;
    String operacao;
    String segundoNumero;
    
    String stringprimeiroNumero = JOptionPane.showInputDialog("Informe o primeiro numero?"); 
    numero1= Integer.parseInt(stringprimeiroNumero);
        
    String stringoperacao = JOptionPane.showInputDialog("Operacao");
   
        
    String stringsegundoNumero = JOptionPane.showInputDialog("Informe o segundo numero?"); 
    numero2= Integer.parseInt(stringsegundoNumero);
    
        switch
                (stringoperacao) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println("Resutado"+ resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("Resutado"+ resultado);
                break;
            case "/":
                resultado = numero1 / numero2;
                System.out.println("Resutado"+ resultado);
                break;    
            case "*":
                resultado = numero1 * numero2;
                System.out.println("Resutado"+ resultado);
                break;
               
        }
        
    }
}
