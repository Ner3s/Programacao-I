package exercicio8;
import exercicio7.ProfDedicado;
import java.util.Scanner;
public class TestaProfDedicado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProfDedicado pD = new ProfDedicado();
        System.out.println("Informe o nome: ");
        
        pD.setNome(sc.next());
        pD.calculaSalario();
    }
    
}
