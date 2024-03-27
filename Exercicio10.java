import classes.MaiorIdade;

public class Exercicio10 {
    public static void executar(){

        int qtdPessoas = Prompt.lerInteiro("Digite a quantidade de pessoas: ");
        for (int i = 0; i < qtdPessoas; i++) {
            int idade = Prompt.lerInteiro("Digite a idade: ");
            MaiorIdade pessoa = new MaiorIdade(idade);
            Prompt.imprimir("A pessoa é "+pessoa.defineIdade());
        }
    }
}
