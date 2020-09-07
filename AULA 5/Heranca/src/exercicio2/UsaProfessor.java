package exercicio2;
import exercicio1.Professor;
import java.util.Scanner;
public class UsaProfessor {

    public static void main(String[] args) {
       Professor prof = new Professor();
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Informe seu nome: ");
       //String nome = sc.next();
       prof.setNome(sc.next());
       
       
    }
    
}
