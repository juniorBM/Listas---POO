
package br.edu.fatecfranca.ads.exe1;
import javax.swing.JOptionPane;
public class TestaAluno {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        
        float nota1, nota2;
        int numAluno, idade;
        String nome = "";
        
        aluno.p1 = Float.parseFloat(JOptionPane.showInputDialog("Infome a nota1: "));
        aluno.p2 = Float.parseFloat(JOptionPane.showInputDialog("Infome a nota2: "));
        System.out.println(aluno.notaFinal(aluno.p1, aluno.p2));
        
        aluno.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do aluno: "));
        aluno.nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
        aluno.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno: "));
        aluno.numeroAluno = 19;
        
        JOptionPane.showMessageDialog(null, aluno.dadosAluno());
        
        JOptionPane.showMessageDialog(null, aluno.passou());
    }
    
}
