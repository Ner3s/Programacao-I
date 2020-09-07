package AppMatematica;

// Desejo criar uma classe chamada matematica//

/* Está classe possuirá duas variaves dois numeros inteiros n1 n2;
    além de um metodo chamado somarNumero, responsavel pela soma desses numeros 
    informados pelo usuario.
    o metodo somaNumero deverá realizar o calculo de soma dos numeros, devolver
    a soma ao metodo chamador (metodo principal) onde será exibido está operação.

*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AppMatematica {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matematica mat = new Matematica();
        /*
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite num1: "));
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite num2: "));
        
        int soma = mat.somarNumeros(y, x);
        
        JOptionPane.showMessageDialog(null,"A soma é: "+soma);
        */
        mat.regPess();
        mat.mostrarReg();
        
    }
    
}
