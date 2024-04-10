import classes.PrecoVenda;

public class Exercicio06 {
    public static void executar(){

        PrecoVenda objPrecoVenda = new PrecoVenda();
        objPrecoVenda.setPrecoCusto(1000);
        objPrecoVenda.setPercentual(50);

        Prompt.imprimir("Preco de venda: R$"+objPrecoVenda.calcPrecoVenda());
    }
}
