package br.edu.fatecfranca.ads.exe1;
import javax.swing.JOptionPane;
public class TestaVeiculo {
    public static void main(String[] args) {
        String nomeDono;
        
        JOptionPane.showMessageDialog(null, "Preencher Carro!");
        
        
        Veiculo carro = preencherObjeto();
        
        JOptionPane.showMessageDialog(null, "Preencher Moto!");
        Veiculo moto = preencherObjeto();
        JOptionPane.showMessageDialog(null, "Carro: " + "\n" + carro.mostra());
        JOptionPane.showMessageDialog(null, "Moto: " + "\n" + moto.mostra());
        
        //Preencher novamente o objMoto
        JOptionPane.showMessageDialog(null, "Preencher Moto 2!");
        moto = preencherObjeto();
        Veiculo.alteraNome(Veiculo.nomeDono);
        JOptionPane.showMessageDialog(null, "Carro : " + "\n" + carro.mostra());
        JOptionPane.showMessageDialog(null, "Moto 2: " + "\n" + moto.mostra());
        
        //Utilizando o objCarro
        JOptionPane.showMessageDialog(null, Veiculo.nroRodas(carro.nroRodas));
        
        //Utilizando o objMoro
        JOptionPane.showMessageDialog(null, Veiculo.nroRodas(moto.nroRodas));
        
        //Utilizando o metodo alteraNome
         nomeDono = JOptionPane.showInputDialog("Informe o nome do dono: ");
         Veiculo.alteraNome(nomeDono);
        
         //Utilizando o metodo RetornaNome
         JOptionPane.showMessageDialog(null, Veiculo.retornaNome());

        

        Veiculo novoVeiculo = Veiculo.retornaNovoVeiculo(carro, moto);
        JOptionPane.showMessageDialog(null, "Novo Veiculo: " + "\n" + "Tipo: " + novoVeiculo.tipo + "\n" + "Número de Rodas: " + novoVeiculo.nroRodas + "\n" + "Cor: " + novoVeiculo.cor + "\n" + "Ano: " + novoVeiculo.ano + "\n" + "Nome do dono: " + Veiculo.nomeDono);
        
        
    }
    
    //Metodo que preenche objVeiculo
    public static Veiculo preencherObjeto(){
        String tipo, cor, nome;
        int numRodas, ano;
        
        tipo = JOptionPane.showInputDialog("Informe o tipo do veiculo: ");
        numRodas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de rodas do veiculo"));
        cor = JOptionPane.showInputDialog("Informe a cor do veiculo: ");
        ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veiculo: "));
        nome = JOptionPane.showInputDialog("Informe o nome do dono: ");
        
        Veiculo objRetorno =  new Veiculo(tipo, numRodas, cor, ano);
        
        return objRetorno;
    }
}
