
package br.edu.franca.exe.ads.testejar.exe2;

import br.edu.fatecfranca.ads.exe2.Aluno;
import javax.swing.JOptionPane;

public class TestaAluno {

    public static void main(String[] args) {
        
        Aluno Fulano;
    
        
        do {
            JOptionPane.showMessageDialog(null, "Cliente1 ");
            Fulano = preencherObjeto();
            
            if (!"".equals(Fulano.mostrarErros())) {
                JOptionPane.showMessageDialog(null, Fulano.mostrarErros());
            }else{
                JOptionPane.showMessageDialog(null, "Nota final: " + Fulano.notaFinal());
                JOptionPane.showMessageDialog(null, Fulano.dadosAluno());
                JOptionPane.showMessageDialog(null, Fulano.passou());
            }
            
        } while (!"".equals(Fulano.mostrarErros()));
    }
    
    public static Aluno preencherObjeto(){
        String nome;
        int numeroAluno, idade;
        float p1, p2;
        
        numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do aluno: "));
        nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno: "));
        p1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota1 do aluno: "));
        p2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota2 do aluno: "));
        
       
        Aluno retornaObjeto = new Aluno(numeroAluno, nome, idade, p1, p2);
       
       return retornaObjeto;
    }
    
}
