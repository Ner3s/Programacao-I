package App;

import java.util.Scanner;

public class Exerc5A9 {

    public static void main(String[] args) {
        
        /*
        ---
        Scanner sc = new Scanner(System.in);
        ---
        */
        
        
        /*  EXEC 5  */
        
        /* -----
        float aumento;
        
        System.out.println("Digite Salário: ");
        float sal = sc.nextFloat();
        
        System.out.println("Digite o Percentual de aumento: ");
        float percentual = sc.nextFloat();
        
        aumento = sal*percentual/100;
        sal=sal+aumento;
        
        System.out.println("O aumento foi: "+sal);
        ----- */
        
        /*   EXEC 6   */
        
        /* -----
        float salBase, grat, imp;
        
        System.out.print("Digite o salario: ");
        salBase = sc.nextFloat();
        
        grat = salBase * 5/100;
        imp = salBase * 7/100;
        
        float novoSal= salBase+grat-imp;
        
        System.out.println("Salário Base: "+novoSal);
        ----- */
        
        /*   EXEC 7   */
        
        /* -----
        
        float dep, juros, rend, valTotal;
        
        System.out.print("Digite o valor do deposito: ");
        dep = sc.nextFloat();
        
        System.out.print("Digite o valor do juros: ");
        juros = sc.nextFloat();
        rend = dep*juros/100;
        valTotal = dep+rend;
        System.out.println("Valor do Rendimento: "+rend);
        System.out.println("Valor Total: "+valTotal);
        
        ----- */
        
        /*   EXEC 8   */
        
        Scanner sc = new Scanner(System.in);
        float precoFab, lucDist, percImp, valorTotal;
        
        System.out.print("Digite o valor do preço de fabrica: ");
        precoFab = sc.nextFloat();
        
        System.out.print("Digite o valor do lucro do distribuidor: ");
        lucDist = sc.nextFloat();
        
        System.out.print("Digite o valor do percentual de imposto: ");
        percImp = sc.nextFloat();
        
        
    }
    
}
