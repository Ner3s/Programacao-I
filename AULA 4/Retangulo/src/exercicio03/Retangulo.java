package exercicio03;
public class Retangulo {
    public int base;
    public int altura;
    
    public void exibeArea(){
        int area = this.base*this.altura;
        System.out.println("Área do Retângulo "+area);
    }
    
    public void exibePerimetro(){
        int perimetro = 2*this.base+2*this.altura;
        System.out.println("Perimetro do Retângulo "+perimetro);
    }
}
