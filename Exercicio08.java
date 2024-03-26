import classes.AlunoMencao;

public class Exercicio08 {
    public static void executar(){
        
        String nome = Prompt.lerLinha("Digite o nome do aluno: ");
        double nota1 = Prompt.lerDecimal("Digite a nota 1: ");
        double nota2 = Prompt.lerDecimal("Digite a nota 2: ");
        double nota3 = Prompt.lerDecimal("Digite a nota 3: ");

        AlunoMencao aluno = new AlunoMencao(nome, nota1, nota2, nota3);

        Prompt.imprimir("O aluno "+aluno.nome+" está "+aluno.mencaoAluno()+" com uma média total de "+aluno.mediaArit());
    }
    
}
