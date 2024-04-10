import classes.AlunoMencao;

public class Exercicio08 {
    public static void executar(){

        AlunoMencao aluno = new AlunoMencao();
        aluno.setNome("Rafael");
        aluno.setNota1(10);
        aluno.setNota2(8);
        aluno.setNota3(9);

        Prompt.imprimir("O aluno "+aluno.getNome()+" está "+aluno.mencaoAluno()+" com uma média total de "+aluno.mediaArit());
    }
    
}
