
package br.edu.fatecfranca.ads.exe3;


public class MeuString {
    public String string;

    public MeuString(String string) {
        this.string = string;
    }

    public MeuString() {
    }
    
    public String comprimentoTamanho(){
        char caracter = 0;
        for (int i = 0; i < this.string.length(); i++) {
            if (i == 1) {
                caracter = this.string.charAt(i);
                break;
            }
        }
        return "Palavra: " + this.string + "\n" + "Comprimeto da String: " + this.string.length() + "\n" + "Caracter da posição 2: " + caracter; 
    }
     
   public String retornaStr2(){
        int tamanho;
        
        tamanho = this.string.length();
        
        return "String 2 com o tamanho da string 1: " +  Integer.toString(tamanho);
   }
}


