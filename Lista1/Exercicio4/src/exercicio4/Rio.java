
package exercicio4;

public class Rio {
    
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public Rio() {
    }
    
    public void chover(float nivel){
        this.nivel += nivel;
    }
    
    public void ensolarar(float nivel){
        this.nivel -= nivel;
    }
    
    public void limpar(boolean limpou){
        this.poluido = limpou;
    }
    
    public void sujar(boolean sujou){
        this.poluido = sujou;
    }
    
    public String mostrar(){
        return "Nome: " + this.nome + "\n " + "Nível: " + this.nivel + "\n " + "Poluído: " + this.poluido;
        
    }
}
