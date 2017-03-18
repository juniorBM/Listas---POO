
package br.edu.fatecfranca.ads.exe4;


public class Computador {
   public String processador;
   public static int ram;

    public Computador(String processador) {
        this.processador = processador;
    }

    public Computador() {
    }
   
   public void alterarProcessador(String novoProcessador){
       this.processador = novoProcessador;
   }
   public static void alterarRam(int novaRam){
       ram = novaRam;
   }
   
   public static void upgradeRam(){
       ram += 256;
   }
}
