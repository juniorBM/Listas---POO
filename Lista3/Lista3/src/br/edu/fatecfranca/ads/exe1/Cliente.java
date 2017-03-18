
package br.edu.fatecfranca.ads.exe1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    String erros = "";
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        
        setNumeroConta(numeroConta);
        setNumeroAgencia(numeroAgencia);
        setNome(nome);
        setSaldo(saldo);
        
    }

    public Cliente() {
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public boolean setNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8) {
            for (int i = 0; i < numeroConta.length(); i++) {
                if (i == 6) {
                    if (numeroConta.charAt(i) == '-') {
                        this.numeroConta = numeroConta;
                    }
                }
            }
            
            return true;
        }else{
            erros = "Número da conta está errado. \n";
            return false;
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public boolean setNumeroAgencia(String numeroAgencia) {
        boolean b = false;
        if (numeroAgencia.length() == 6) {
            for (int i = 0; i < numeroAgencia.length(); i++) {
                if (i == 4) {
                    if (numeroAgencia.charAt(i) == '-') {
                    this.numeroAgencia = numeroAgencia;
                    b = true;
                    }
                }
            }
            
        }
        if (!b) {
            erros += "Número da agencia está errado. \n";
        }
        return b;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome.length() > 0 && nome.length() <= 30) {
            this.nome = nome;
            return true;
        }else{
            erros += "Nome não pode ter mais de 30 caracteres";
            return false;
        }
        
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void realizarDeposito(float deposito){
        this.saldo += deposito;
    }
    public boolean realizarSaque(float saque){
        if (saque <= this.saldo) {
            this.saldo -= saque;
            return true;
        }else{
            erros += "O valor do saque é maior que o saldo atual";
            return false;
        }
        
    }
    public String dados(){
        return "Número conta: " + getNumeroConta() + "\n" + "Número agencia: " + getNumeroAgencia() + "\n" + "Nome do cliente: " + getNome() + "\n" + "Saldo R$: " + getSaldo();
    }
    
    public String mostrarErros(){
        return erros;
    }

}
