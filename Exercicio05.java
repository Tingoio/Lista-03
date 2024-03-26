import classes.Prestacoes;

public class Exercicio05 {
    public static void executar(){
        
        double vlrCompra = Prompt.lerDecimal("Digite o valor da compra: ");

        Prestacoes objPrestacao = new Prestacoes(vlrCompra);

        Prompt.imprimir("O valor da compra é de : 5x R$"+objPrestacao.vlrPrestacoes());
    }
}
