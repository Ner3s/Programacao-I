package App;

import javax.swing.JOptionPane;

public class JOptionPaneExec3 {    
    
    public static void main(String[] args) {
        int media, md = 0;
        
        for (int x=0; x<4; x++){
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
            md =+ id;    
        }
            media = md/4;
            
            System.out.println(media);
            
        
    }
    
}
