
package exercicio4;

import javax.swing.JOptionPane;

public class TestaRio {
    
    public static void main(String[] args) {
       String nome;
       float nivel;
       int poluicao;
       boolean poluido;
       float choveu, ensolarou;
       boolean sujou, limpou;
       int sujar, limpar;
       
       String nome2;
       float nivel2;
       int poluicao2;
       boolean poluido2;
       float choveu2, ensolarou2;
       boolean sujou2, limpou2;
       int sujar2, limpar2;
       
       JOptionPane.showMessageDialog(null, "Rio 1");
       nome = JOptionPane.showInputDialog("Informe o nome: ");
       nivel = Float.parseFloat(JOptionPane.showInputDialog("Informe o nivel: ")); 
       poluicao = Integer.parseInt(JOptionPane.showInputDialog("Infome se está poluído(0=Não e 1=Sim): "));
       
        switch (poluicao) {
            case 0:
                poluido = false;
                break;
            case 1:
                poluido = true;
                break;
            default:
                poluido = false;
                break;
        }
        
        
        
        Rio rio1 = new Rio(nome, nivel, poluido);
        
        
        choveu = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade que choveu: ")); 
        ensolarou = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade que ensolarou: ")); 
        limpar = Integer.parseInt(JOptionPane.showInputDialog("Infome se o rio foi limpo(0=Não e 1=Sim): "));
        sujar = Integer.parseInt(JOptionPane.showInputDialog("Infome se o rio foi sujo(0=Não e 1=Sim): "));
        
        switch (limpar) {
            case 0:
                limpou = false;
                break;
            case 1:
                limpou = true;
                break;
            default:
                limpou = false;
                break;
        }
        switch (sujar) {
            case 0:
                sujou = false;
                break;
            case 1:
                sujou = true;
                break;
            default:
                sujou = false;
                break;
        }
        
        
        rio1.chover(choveu);
        rio1.ensolarar(ensolarou);
        rio1.limpar(limpou);
        rio1.sujar(sujou);
        JOptionPane.showMessageDialog(null, rio1.mostrar());
        
        JOptionPane.showMessageDialog(null, "Rio 2");
        nome2 = JOptionPane.showInputDialog("Informe o nome: ");
        nivel2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o nivel: ")); 
        poluicao2 = Integer.parseInt(JOptionPane.showInputDialog("Infome se está poluído(0=Não e 1=Sim): "));
       
        switch (poluicao2) {
            case 0:
                poluido2 = false;
                break;
            case 1:
                poluido2 = true;
                break;
            default:
                poluido2 = false;
                break;
        }
        
        
        
        
        Rio rio2 = new Rio();
        rio2.nome = nome2;
        rio2.nivel = nivel2;
        rio2.poluido  = poluido2;
        
        
        choveu2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade que choveu: ")); 
        ensolarou2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade que ensolarou: ")); 
        limpar2 = Integer.parseInt(JOptionPane.showInputDialog("Infome se o rio foi limpo(0=Não e 1=Sim): "));
        sujar2 = Integer.parseInt(JOptionPane.showInputDialog("Infome se o rio foi sujo(0=Não e 1=Sim): "));
        
        switch (limpar2) {
            case 0:
                limpou2 = false;
                break;
            case 1:
                limpou2 = true;
                break;
            default:
                limpou2 = false;
                break;
        }
        switch (sujar2) {
            case 0:
                sujou2 = false;
                break;
            case 1:
                sujou2 = true;
                break;
            default:
                sujou2 = false;
                break;
        }
        
        
        rio2.chover(choveu);
        rio1.ensolarar(ensolarou);
        rio1.limpar(limpou);
        rio1.sujar(sujou);
        JOptionPane.showMessageDialog(null, rio2.mostrar());
       
    }
    
}
