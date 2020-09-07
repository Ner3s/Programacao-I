package AppMatematica;

import javax.swing.JOptionPane;

public class Matematica {
    int num1 = 0;
    int num2 = 0;
                   //assinatura do metodo//
    public int somarNumeros(int n1,int n2){
        /* ou
            int a = n1;
            int b = n2;
            int c = a+b;
            return c;
        
            ou
            int a = n1+n2;
        */
        return n1+n2;
    }
    
    String nome;
    int anoNasc;
    int sal;
    int novoSal;
    int aumento;
    int anoAtu;
    
    public void regPess(){
        anoAtu = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
        sal = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário: "));
        aumento = Integer.parseInt(JOptionPane.showInputDialog("Digite a porcentagem de aumento: "));
        
        calculaSal();
    }
    
    public int calculaSal(){
        int aum = sal*aumento/100;
        novoSal = aum+sal;
        
        int idade = anoAtu - anoNasc; 
        anoNasc = idade;
        
        return 0;
    }
    
    public void mostrarReg(){
        JOptionPane.showMessageDialog(null,"Olá, "+nome+", sua idade é "+anoNasc+"anos");
        JOptionPane.showMessageDialog(null,"Seu salário era: "+sal+", com o aumento passou a ser: "+novoSal);
    }
    
}
