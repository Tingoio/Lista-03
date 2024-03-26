import classes.CarroNovo;

public class Exercicio07 {
    public static void executar(){

        double custoFabrica = Prompt.lerDecimal("Digite o custo de fábrica: ");

        CarroNovo objCarroNovo = new CarroNovo(custoFabrica);

        Prompt.imprimir("O custo do consumidor é de: R$"+objCarroNovo.custoCarroNovo());

    }
}
