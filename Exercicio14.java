import classes.Produto;

public class Exercicio14 {
    public static void executar(){
        
        double somaCusto = 0, somaVenda = 0;

        Produto[] produtos = new Produto[5];

        for(int i = 0; i < 5; i++){

            produtos[i] = new Produto();

            produtos[i].setPrecoCusto(Prompt.lerDecimal("Digite o preco de custo do " + (i+1) + "º produto: "));
            produtos[i].setPrecoVenda(Prompt.lerDecimal("Digite o preco de venda do " + (i+1) + "º produto: "));

            Prompt.imprimir(produtos[i].calcularResultado(produtos[i].getPrecoVenda(), produtos[i].getPrecoCusto()));

            somaCusto += produtos[i].getPrecoCusto();
            somaVenda += produtos[i].getPrecoVenda();
            
        }

        Prompt.imprimir("A média de custo é de: " + somaCusto / 5);
        Prompt.imprimir("A média de venda é de: " + somaVenda / 5);
    }
}
