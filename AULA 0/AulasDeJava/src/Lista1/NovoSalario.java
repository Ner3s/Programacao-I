package Lista1;

public class NovoSalario {

    public static void main(String[] args) {
        
        float salario = 2500;
        float NovoSalario, aumento;
        float percentual = 10;
        
        aumento = salario*percentual/100;
        NovoSalario = salario+aumento; 
        
        System.out.println(NovoSalario);
        
       /* 2 opaa chama q é nós */ 
        
       float gratificacao, imposto, sal, salarioReceber;
       float salarioBase = 1500;
       
       gratificacao = salarioBase*5/100;
       imposto = salarioBase*7/100;
       salarioReceber = salarioBase+gratificacao-imposto;
       
        System.out.println(salarioReceber);
       
       /* 3 raquete do guda */
       
       float deposito =500;
       float rendimento, valorTotal;
       float taxaJuros = 3;
       rendimento = deposito*taxaJuros/100;
       valorTotal  = deposito+rendimento;
       
        System.out.println(valorTotal);
       
        /* 4 não consegue né moises */
        
        float valorImposto, precoFinal, lucroDistribuidor;
        float precoFabrica = 35000;
        float percentualDistribuidor = 25;
        float percentualImposto = 15;
        
        lucroDistribuidor = precoFabrica*percentualDistribuidor/100;
        valorImposto = precoFabrica * percentualImposto/100;
        precoFinal = precoFabrica+lucroDistribuidor+valorImposto;
        System.out.println(precoFinal);
        
        /* 5 Certa Resposta */
        
        
    }    
}
