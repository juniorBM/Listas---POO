
package br.edu.franca.exe.ads.testejar.exe1;
import javax.swing.JOptionPane;
import br.edu.fatecfranca.ads.exe1.Cliente;

public class TestaCliente {
    
    public static void main(String[] args) {
        
        Cliente Fulano;
        Cliente Beltrano;
    
        
        do {
            JOptionPane.showMessageDialog(null, "Cliente1 ");
            Fulano = preencherObjeto();
            Fulano.realizarDeposito(deposito());
            Fulano.realizarSaque(saque());
            
            if (!"".equals(Fulano.mostrarErros())) {
                JOptionPane.showMessageDialog(null, Fulano.mostrarErros());
            }else{
                JOptionPane.showMessageDialog(null, Fulano.dados());
            }
            
        } while (!"".equals(Fulano.mostrarErros()));
        
        
        do {
            JOptionPane.showMessageDialog(null, "Cliente2 ");
            Beltrano = preencherObjeto();
            Beltrano.realizarDeposito(deposito());
            Beltrano.realizarSaque(saque());
            
            if (!"".equals(Beltrano.mostrarErros())) {
                JOptionPane.showMessageDialog(null, Beltrano.mostrarErros());
            }else{
                JOptionPane.showMessageDialog(null, Beltrano.dados());
            }
            
        } while (!"".equals(Beltrano.mostrarErros()));
        
    }
    
    public static Cliente preencherObjeto(){
        String numeroConta, numeroAgencia, nome;
        float saldo;
        
        numeroConta = JOptionPane.showInputDialog("Informe o número da conta: ");
        numeroAgencia = JOptionPane.showInputDialog("Informe no número da agencia: ");
        nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo do cliente: "));
       
       Cliente retornaObjeto = new Cliente(numeroConta, numeroAgencia, nome, saldo);
       
       return retornaObjeto;
    }
    
    public static Float saque(){
        float saque;
        
        saque = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do saque"));
        return saque;
    }
    
    public static Float deposito(){
        float deposito;
        
        deposito = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do deposito"));
        return deposito;
    }
    
}
