import classes.PrecoVenda;

public class Exercicio06 {
    public static void executar(){

        double precoCusto = Prompt.lerDecimal("Digite o preço de custo: ");
        double percentual = Prompt.lerDecimal("Digite o percentual: ");

        PrecoVenda objPrecoVenda = new PrecoVenda(precoCusto, percentual);

        Prompt.imprimir("Preco de venda: R$"+objPrecoVenda.calcPrecoVenda());
    }
}
