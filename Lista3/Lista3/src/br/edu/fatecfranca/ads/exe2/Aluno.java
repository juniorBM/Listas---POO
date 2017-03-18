
package br.edu.fatecfranca.ads.exe2;

public class Aluno {
    private int numeroAluno;
    private String nomeAluno;
    private int idade;
    private float p1;
    private float p2;
    String erros = "";
    float notaFinal;
    public Aluno(int numeroAluno, String nomeAluno, int idade, float p1, float p2) {
        setNumeroAluno(numeroAluno);
        setNomeAluno(nomeAluno);
        setIdade(idade);
        setP1(p1);
        setP2(p2);
        
    }

    public Aluno() {
        this.numeroAluno = 0;
        this.nomeAluno = "";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        String tamanho;
        tamanho =  Integer.toString(numeroAluno);
        if (tamanho.length() == 6) {
            this.numeroAluno = numeroAluno;
        }else{
            erros += "O número do aluno deve ter 6 números \n";
        }
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        if (nomeAluno.length() > 0 && nomeAluno.length() <= 30) {
            this.nomeAluno = nomeAluno;
        }else{
            erros += "O nome do aluno deve ter no maximo 30 caracteres \n";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }else{
            erros += "Idade não pode ser negativa";
        }
        
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 > 0) {
            this.p1 = p1;
        }else{
            erros += "Nota não pode ser negativa";
        }
        
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 > 0) {
            this.p2 = p2;
        }else{
            erros += "Nota não pode ser negativa";
        }
    }
    
    public String mostrarErros(){
        return erros;
    }
    
    public float notaFinal(){
        notaFinal = this.p1 + this.p2;
        
        return notaFinal;
    }
    
    public String dadosAluno(){
        return "Número do aluno: " + getNumeroAluno() + "\n" + "Nome do aluno: " + getNomeAluno() + "\n" + "Idade do aluno: " + getIdade();
    }
    
    public String passou(){
        if (notaFinal >= 6) {
            return "O aluno passou";
        }else{
            return "O aluno não passou";
        }
    }
}
