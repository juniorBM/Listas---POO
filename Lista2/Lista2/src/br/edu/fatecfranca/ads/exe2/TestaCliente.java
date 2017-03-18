
package br.edu.fatecfranca.ads.exe2;
import javax.swing.JOptionPane;
public class TestaCliente {
    
    public static void main(String[] args) {

        float novoSaldo;
        JOptionPane.showMessageDialog(null, "Cliente 1");
        Cliente Fulano = retornaCliente();
        Fulano.realizarDeposito(informarDeposito());
        Fulano.realizarSaque(informarSaque());
        JOptionPane.showMessageDialog(null, Fulano.mostraDados());
        
        Cliente Beltrano = retornaCliente();
        Beltrano.realizarDeposito(informarDeposito());
        Beltrano.realizarSaque(informarSaque());
        JOptionPane.showMessageDialog(null, Beltrano.mostraDados());
        //Ultilizando o metodo alteraSaldo
        novoSaldo =  Float.parseFloat(JOptionPane.showInputDialog("Informe o novo saldo"));
        Cliente.alteraSaldo(novoSaldo);
        
        //Utilizando o metodo retornaSaldo
        JOptionPane.showMessageDialog(null, Cliente.retornaSaldo());
        
        Cliente.retornaNovoCliente(Fulano, Beltrano);
        
        Cliente.verificaTamanho(Beltrano.numeroAgencia);
    }
    
    public static Cliente retornaCliente(){
        String numConta, numAgencia, nome;
        float saldo;
        
        numConta = JOptionPane.showInputDialog("Informe o número da conta: ");
        numAgencia = JOptionPane.showInputDialog("Informe o número da agencia: ");
        nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        Cliente.saldo =  saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo"));
        
        Cliente retornoCliente = new Cliente(numConta, numAgencia, nome);
                
        return retornoCliente;
    }
    
    public static float informarDeposito(){
        float deposito;
       deposito = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor a ser depositado: "));
       return deposito;
    }
    
    public static float informarSaque(){
       float saque;
       saque = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor a ser sacado: "));
       return saque;
    }
}
