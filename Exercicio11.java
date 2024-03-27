import classes.Pessoa;

public class Exercicio11{
    public static void executar(){

        
        for (int i = 0; i < 56; i++) {
            String nome = Prompt.lerLinha("Digite o nome da pessoa: ");
            char sexo = Prompt.lerCaractere("Digite o sexo (M) para masculino ou (F) para feminino: ");
            Pessoa objPessoa = new Pessoa(nome, sexo);
            Prompt.imprimir("A pessoa "+objPessoa.nome+" é do sexo: "+objPessoa.verificaSexo(sexo));
            Prompt.imprimir("");
        }
    }
}