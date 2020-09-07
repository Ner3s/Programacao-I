package excecao1;
import javax.swing.JOptionPane;
public class Excecao {
    public static void main(String[] args) {
        int num=9999;
        while(num != 0){
            try{
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
                int cubo = ((num*num)*num);
                JOptionPane.showMessageDialog(null,"o numero ao cubo é: "+cubo);
                num = 0;
            }catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null,"Somente numeros.");
                num = 1;
            }
        }
    }
}
