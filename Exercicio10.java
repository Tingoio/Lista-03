import classes.MaiorIdade;

public class Exercicio10 {
    public static void executar(){

        int qtdPessoas = Prompt.lerInteiro("Digite a quantidade de pessoas: ");
        for (int i = 0; i < qtdPessoas; i++) {
            MaiorIdade pessoa = new MaiorIdade();
            Prompt.imprimir("Digite a idade da pessoa: ");
            pessoa.setIdade(Prompt.lerInteiro());
            Prompt.imprimir("A pessoa é "+pessoa.defineIdade());
        }
    }
}
