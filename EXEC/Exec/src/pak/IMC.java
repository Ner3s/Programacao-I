package pak;

public class IMC {
    double peso;
    double altura;
    
    public double obtemIMC(){
        double imc = this.peso / this.altura*this.altura;
        return imc;
    }
    
    public double comparaIMC(double x){
        return 0;
    }
}
