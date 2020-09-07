
package exercicio1;

public class Professor {
    private String nome;
    private String matricula;
    private int idade;
    private int desconto;
    private double salarioBruto;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    
    public double calculaSalario(){
        double novoSal;
        novoSal = this.salarioBruto-(this.salarioBruto*this.desconto/100);
        return novoSal;
    }
}
