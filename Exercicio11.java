import classes.Pessoa;

public class Exercicio11{
    public static void executar(){

        int totHomem = 0, totGeral = 0;
        for (int i = 0; i < 56; i++) {
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(Prompt.lerLinha("Digite o nome da pessoa: "));
            pessoa.setSexo(Prompt.lerCaractere("Digite o sexo da pessoa: "));
            Prompt.imprimir("A pessoa "+pessoa.getNome()+" é do sexo: "+pessoa.verificaSexo(pessoa.getSexo()));
            if(pessoa.getSexo()=='m'||pessoa.getSexo()=='M'){
                totHomem ++;
            }
            totGeral++;
        }
        Prompt.imprimir("Total de homens: " + totHomem + "\nTotal de mulheres: " + (totGeral - totHomem) + "\nTotal geral: "+ totGeral);
    }
}