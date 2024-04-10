import classes.Aluno;

public class Exercicio01 {
    public static void executar(){
 
        Aluno objAluno = new Aluno();
        objAluno.setAluno("João", 10, 9, 8);
        
        Prompt.imprimir("Nome: "+objAluno.getNome()+"\nMédia: "+objAluno.mediaArit());

    }
}
