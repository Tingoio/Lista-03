package classes;

public class AlunoMencao {
    
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public AlunoMencao(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double mediaArit(){
        return (nota1 + nota2 + nota3) / 3;
        
    }

    public String mencaoAluno(){
        double media = mediaArit();
        if(media>=7){
            return "Aprovado";
        }
        else if(media>=5.1&&media<=6.9){
            return "Recuperação";
        }
        else{
            return "Reprovado";
        }
        
    }
    
}
