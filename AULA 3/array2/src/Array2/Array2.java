package Array2;

import java.lang.Math;

public class Array2 {

    public static void main(String[] args) {
        int[] dados1 = {1, 4, 9, 16, 25, 36};
        int[] dados2 = new int[6];

        for (int y = 0; y < dados1.length; y++) {
            dados2[y] = (int) (Math.sqrt(dados1[y]));
            System.out.println("A raiz quadradada de " + dados1[y] + " é " + dados2[y]);
        }
    }

}
