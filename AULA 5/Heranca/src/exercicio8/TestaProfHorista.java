package exercicio8;
import exercicio7.ProfHorista;
import java.util.Scanner;
public class TestaProfHorista {

    public static void main(String[] args) {
        ProfHorista pH = new ProfHorista();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        pH.setNome(sc.next());
        
        System.out.println("Horas trabalhadas: ");
        pH.setHorastrabalhadas(sc.nextInt());
    }
    
}
