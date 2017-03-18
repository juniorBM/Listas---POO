
package exercicio2;
import javax.swing.JOptionPane;
public class TestaCliente {
    public static void main(String[] args) {
    
        int numConta, numAgencia;
        String nome;
        float saldo, deposito, saque;
        
        int numConta2, numAgencia2;
        String nome2;
        float saldo2, deposito2, saque2;
        
        
        JOptionPane.showMessageDialog(null, "Cliente 1");
        numConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta: "));
        numAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da agencia: "));
        nome = JOptionPane.showInputDialog("Informe o nome: ");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo: "));
        
        Cliente Fulano = new Cliente(numConta, numAgencia, nome, saldo);
        
        deposito = Float.parseFloat(JOptionPane.showInputDialog("Informe o deposito: "));
        saque = Float.parseFloat(JOptionPane.showInputDialog("Informe o saque: "));
        Fulano.realizarDeposito(deposito);
        Fulano.realizarSaque(saque);
        
        JOptionPane.showMessageDialog(null, Fulano.dadosCliente());
        
        
        JOptionPane.showMessageDialog(null, "Cliente 2");
        Cliente Beltrano = new Cliente();
        
        numConta2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta: "));
        numAgencia2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da agencia: "));
        nome2 = JOptionPane.showInputDialog("Informe o nome: ");
        saldo2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo: "));
        
        Beltrano.numeroAgencia = numAgencia2;
        Beltrano.numeroConta = numConta2;
        Beltrano.nome = nome2;
        Beltrano.saldo = saldo2;
        
        deposito2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o deposito: "));
        saque2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o saque: "));
        
        Beltrano.realizarDeposito(deposito2);
        Beltrano.realizarSaque(saque2);
        JOptionPane.showMessageDialog(null, Beltrano.dadosCliente());
        
    }
}
