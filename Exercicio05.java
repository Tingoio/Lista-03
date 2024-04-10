import classes.Prestacoes;

public class Exercicio05 {
    public static void executar(){
        
        Prestacoes objPrestacao = new Prestacoes();
        objPrestacao.setVlrCompra(1000);

        Prompt.imprimir("O valor da compra é de : 5x R$"+objPrestacao.getVlrCompra()/5);
    }
}
