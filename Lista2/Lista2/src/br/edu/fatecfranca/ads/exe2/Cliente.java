
package br.edu.fatecfranca.ads.exe2;


public class Cliente {
    public String numeroConta;
    public String numeroAgencia;
    public String nome;
    public static float saldo;

    public Cliente(String numeroConta, String numeroAgencia, String nome) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
    }

    public Cliente() {
    }
    
    public void realizarDeposito(float deposito){
        Cliente.saldo += deposito;
    }
    public void realizarSaque(float saque){
        Cliente.saldo -= saque;
    }
    
    public String mostraDados(){
        return "Numero da conta: " + this.numeroConta + "\n" + "Nome do cliente: " + this.nome + "\n" + "Saldo atual: " + Cliente.saldo;
    }
    
    public static void alteraSaldo(float novoSaldo){
        Cliente.saldo = novoSaldo;
    }
    
    public static String retornaSaldo(){
        return "Novo saldo: " + Cliente.saldo;
    }
    
    public void alteraNumAgencia(String novoNumAgencia){
        this.numeroAgencia = novoNumAgencia;
    }
    
    public String retornaNumAgencia(){
        return "Novo número agencia: " + this.numeroAgencia;
    }
    
    public static Cliente retornaNovoCliente(Cliente beltrano, Cliente fulano){
        Cliente retornoCliente = new Cliente();
        
        retornoCliente.saldo = beltrano.saldo + fulano.saldo;
        retornoCliente.numeroAgencia = beltrano.numeroAgencia;
        retornoCliente.numeroConta = fulano.numeroConta;
        retornoCliente.nome = "Fulano";
        
        return retornoCliente;
    }
    
    public static String verificaTamanho(String numAgencia){
        if (numAgencia.length() == 6) {
            return "Este número tem 6 digitos";
        }else{
            return "Este número não tem 6 digitos";
        }
    }
    
    
    
}
