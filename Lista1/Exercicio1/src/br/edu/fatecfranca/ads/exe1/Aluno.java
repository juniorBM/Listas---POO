
package br.edu.fatecfranca.ads.exe1;

public class Aluno {
    
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;
    float media;

    public Aluno() {
    }
    
    public float notaFinal(float P1, float P2){
       float media;
       p1 = P1;
       p2 = P2;
       
       this.media = media = (p1 + p2) / 2;
       
       return media;
    }
    
    public String dadosAluno(){
       
       return "Número aluno: " + numeroAluno + "\n " + "Nome aluno: " + nome + "\n " + "Idade do aluno: " + idade;   
       
    }
    
    public String passou(){
        String msgPassou = "";
        if (this.media > 6) {
            return msgPassou = "O aluno passou!";
        }else{
            return msgPassou = "O aluno não passou!";
        }
    }
}
