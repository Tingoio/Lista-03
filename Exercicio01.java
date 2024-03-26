import classes.Aluno;

public class Exercicio01 {
    public static void executar(){
        
        String nome = Prompt.lerLinha("Digite o nome do aluno: ");
        double nota1 = Prompt.lerDecimal("Digite a nota 1: ");
        double nota2 = Prompt.lerDecimal("Digite a nota 2: ");
        double nota3 = Prompt.lerDecimal("Digite a nota 3: ");
        
        Aluno objAluno = new Aluno(nome, nota1, nota2, nota3);
        
        Prompt.imprimir("Nome: "+objAluno.nome+" Média: "+objAluno.mediaArit());

    }
}
