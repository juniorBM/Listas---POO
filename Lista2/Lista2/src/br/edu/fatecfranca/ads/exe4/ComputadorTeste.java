
package br.edu.fatecfranca.ads.exe4;
import javax.swing.JOptionPane;

public class ComputadorTeste {

    public static void main(String[] args) {
        
        Computador comp1 = preencherObjeto();
        
        comp1.alterarProcessador(novoProcessador());
        Computador.alterarRam(novaRam());
        Computador.upgradeRam();
        
        JOptionPane.showMessageDialog(null, "Processador: " + comp1.processador + "\n" + "Memoria Ram(MB): " + Computador.ram);
    }
    
    public static Computador preencherObjeto(){
        String processador;
        int memoria;
        
        processador = JOptionPane.showInputDialog("Informe o processador: ");
        memoria = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de memoria ram: "));
        
        Computador retornoComputador = new Computador(processador);
        Computador.ram = memoria;
        return retornoComputador;
    }
    
    public static String novoProcessador(){
        String novoProcessador;
        novoProcessador = JOptionPane.showInputDialog("Informe o novo processador: ");
        return novoProcessador;
    }
    
    public static int novaRam(){
        int novaRam;
        novaRam = Integer.parseInt(JOptionPane.showInputDialog("Informe a nova quantidade de memoria ram: "));
        return novaRam;
    }
    
}
