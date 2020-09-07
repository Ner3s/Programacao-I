package exercicio01;
import javax.swing.JOptionPane;
public class Try {
    public static void main(String[] args) {
        int n1,n2=1;
        while(n2 !=0){
            try{
                int div;
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite num1: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o num2: "));
                div = n1/n2;
                JOptionPane.showMessageDialog(null,"A divisão dos números é: "+div);
                n2 = 0;
            }catch(NumberFormatException Error){
                JOptionPane.showMessageDialog(null,"Digite Numeros");
                n2 = 1;
            }catch(ArithmeticException Errowsem0burraun){
                JOptionPane.showMessageDialog(null,"não divida por zero.");
                n2 = 1;
            }
        }
        
        
    }
    
}
