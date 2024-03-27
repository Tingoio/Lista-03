package classes;

public class AlunoMencao {
    
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public AlunoMencao(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
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
