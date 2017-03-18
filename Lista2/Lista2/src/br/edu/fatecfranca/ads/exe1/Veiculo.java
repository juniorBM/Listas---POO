
package br.edu.fatecfranca.ads.exe1;

public class Veiculo {
    public String tipo;
    public int nroRodas;
    public String cor;
    public int ano;
    public static String nomeDono;

    public Veiculo(String tipo, int nroRodas, String cor, int ano) {
        this.tipo = tipo;
        this.nroRodas = nroRodas;
        this.cor = cor;
        this.ano = ano;
    }

    public Veiculo() {
    }
    
    public void alteraTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String mostra(){
        return "Tipo: " + this.tipo + "\n" + "Número de Rodas: " + this.nroRodas + "\n" + "Cor: " + this.cor + "\n" + "Ano: " + this.ano + "\n" + "Nome do dono: " + Veiculo.nomeDono;
    }
    
    public static void alteraNome(String nome){
        Veiculo.nomeDono = nome;
    }
    public static String retornaNome(){
        return Veiculo.nomeDono;
    }
    public static String nroRodas(int numRodas){
        if (numRodas % 2 == 0) {
            return "O número de rodas é Par";
        }else{
            return "O número de rodas é Impar";
        }
    }
    public static Veiculo retornaNovoVeiculo(Veiculo veiculo1, Veiculo veiculo2){
        Veiculo novoVeiculo = new Veiculo();
        novoVeiculo.tipo = veiculo1.tipo;
        novoVeiculo.nroRodas = veiculo1.nroRodas + veiculo2.nroRodas;
        novoVeiculo.cor = veiculo2.cor;
        
        if (veiculo1.ano >= veiculo2.ano) {
            novoVeiculo.ano = veiculo1.ano;
        }else{
            novoVeiculo.ano = veiculo2.ano;
        }
        return novoVeiculo;
    }
}
