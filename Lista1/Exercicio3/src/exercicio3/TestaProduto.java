
package exercicio3;
import javax.swing.JOptionPane;

public class TestaProduto {
    public static void main(String[] args) {
        
        //ublic int id;
    //public String descricao;
    //public int qtde;
    //public float preco;
      
        int id, qtde, comprado, vendido;
        String descricao;
        float preco, subirPreco, descerPreco;
        
        int id2, qtde2, comprado2, vendido2;
        String descricao2;
        float preco2, subirPreco2, descerPreco2;
        
        JOptionPane.showMessageDialog(null, "Produto 1");
        id = Integer.parseInt(JOptionPane.showInputDialog("Informe o id: "));
        descricao = JOptionPane.showInputDialog("Informe a descrição: ");
        qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: "));
        preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preco: "));
        
        Produto produto1 = new Produto(id, descricao, qtde,preco);
        
        comprado = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos comprado: "));
        vendido = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos vendido: "));
        subirPreco = Float.parseFloat(JOptionPane.showInputDialog("Informe quanto deseja aumentar o preço do produto: "));
        descerPreco = Float.parseFloat(JOptionPane.showInputDialog("Informe a quanto deseja diminuir o preço do produto: "));
        
        produto1.compra(comprado);
        produto1.vender(vendido);
        produto1.subir(subirPreco);
        produto1.descer(descerPreco);
        JOptionPane.showMessageDialog(null, produto1.mostra());
        
        JOptionPane.showMessageDialog(null, "Produto 2");
        
        id2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o id: "));
        descricao2 = JOptionPane.showInputDialog("Informe a descrição: ");
        qtde2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: "));
        preco2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o preco: "));
        
        Produto produto2 = new Produto();
       
        
        produto2.id = id2;
        produto2.descricao = descricao2;
        produto2.qtde = qtde2;
        produto2.preco = preco2;
        
        comprado2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos comprado: "));
        vendido2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos vendido: "));
        subirPreco2 = Float.parseFloat(JOptionPane.showInputDialog("Informe quanto deseja aumentar o preço do produto: "));
        descerPreco2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a quanto deseja diminuir o preço do produto: "));
        
       
        
        produto2.compra(comprado2);
        produto2.vender(vendido2);
        produto2.subir(subirPreco2);
        produto2.descer(descerPreco2);
        JOptionPane.showMessageDialog(null,produto2.mostra());
    }
}
