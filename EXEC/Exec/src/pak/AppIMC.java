package pak;

public class AppIMC {

    public static void main(String[] args) {
        IMC imc = new IMC();

        imc.peso = 53;
        imc.altura = 1.88;
        imc.obtemIMC();

        double imcCalculado = imc.obtemIMC();
        imc.comparaIMC(imcCalculado);
    }

}
