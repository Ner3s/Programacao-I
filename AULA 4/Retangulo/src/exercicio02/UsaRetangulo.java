package exercicio02;
import exercicio03.Retangulo;
public class UsaRetangulo {
    public static void main(String[] args) {
        //Instancia objeto 1
        Retangulo R1 = new Retangulo();    
        R1.base = 7;
        R1.altura = 5;
        
        //Instancia objeto 2
        Retangulo R2 = new Retangulo();
        R2.base = 9;
        R2.altura = 3;
        
        //Instancia objeto 3
        Retangulo R3 = new Retangulo();
        R3.base = 13;
        R3.base = 7;
        
        System.out.println("Retangulo1 "+R1.base+R1.altura);
        System.out.println("Retangulo2 "+R2.base+R2.altura);
        System.out.println("Retangulo3 "+R3.base+R3.altura);
        
        R1.exibeArea();
        R1.exibePerimetro();
        
        R2.exibeArea();
        R2.exibePerimetro();
        
        R3.exibeArea();
        R3.exibePerimetro();
    }    
}
