import classes.Conversao;

public class Exercicio04 {
    public static void executar(){

        double dolar = Prompt.lerDecimal("Digite a quantia em dólares: ");
        double cotacao = Prompt.lerDecimal("Digite a cotação do dólar: ");

        Conversao objConversao = new Conversao(dolar, cotacao);

        Prompt.imprimir("Valor em reais: R$"+objConversao.calcConversao());
    }
}
