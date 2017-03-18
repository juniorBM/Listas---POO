
package br.edu.fatecfranca.ads.exe3;
import javax.swing.JOptionPane;

public class TestaMeuString {

 
    public static void main(String[] args) {
        String string = JOptionPane.showInputDialog("Informe uma palavra: ");
        MeuString str1 = new MeuString(string);
        JOptionPane.showMessageDialog(null, str1.comprimentoTamanho());
        
        
        MeuString string2 = new MeuString(string);
        
        JOptionPane.showMessageDialog(null, string2.retornaStr2());
    }
    
}
