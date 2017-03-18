
package exercicio2;

public class Cliente {
    
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Cliente() {
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = "";
        this.saldo = 0;
    }
    
    
    
    public void realizarDeposito(float deposito){
        this.saldo += deposito;
    }
    
    public void realizarSaque(float saque){
        this.saldo -= saque;
    }
    
    public String dadosCliente(){
       String msg = "";
       return msg = "Número da conta: " + this.numeroConta + ", " + "Nome do Cliente: " + this.nome + ", " + "Saldo atual R$: " + this.saldo; 
    }
    
}
