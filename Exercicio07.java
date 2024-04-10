import classes.CarroNovo;

public class Exercicio07 {
    public static void executar(){

        CarroNovo objCarroNovo = new CarroNovo();
        objCarroNovo.setCustoFabrica(10000);

        Prompt.imprimir("O custo do consumidor é de: R$"+objCarroNovo.custoCarroNovo());
    }
}
