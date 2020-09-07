package AppIdade;

import java.util.Scanner;

public class AppIdade {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Idade id = new Idade();
        
        System.out.print("Digite idade: ");
        int idade = sc.nextInt();
        
        id.analisaIdade(idade);
        
    }
    
}
