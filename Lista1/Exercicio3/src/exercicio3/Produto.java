
package exercicio3;

public class Produto {
    
    public int id;
    public String descricao;
    public int qtde;
    public float preco;

    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public Produto() {
    }
    
    public void compra(int qtde){
        this.qtde += qtde;
    }
    
    public void vender(int qtde){
        this.qtde -= qtde;
    }
    
    public void subir(float preco){
        this.preco += preco;
    }
    
    public void descer(float preco){
        this.preco -= preco;
    }
    
    public String mostra(){
        return "Id: " + this.id + "\n " + "Descrição: " + this.descricao + "\n " + "Quantidade: " + this.qtde + "\n " + "Preço R$: " + this.preco;
    }
}
