import classes.Vendedor;

public class Exercicio03 {
    public static void executar(){

        String nome = Prompt.lerLinha("Digite o nome do vendedor: ");
        double salFix = Prompt.lerDecimal("Digite o salário fixo do vendendor: ");
        double  totVendas = Prompt.lerDecimal("Digite o valor total de vendas mensais do vendedor: ");

        Vendedor novoVendedor = new Vendedor(nome, salFix, totVendas);

        Prompt.imprimir("Nome: "+novoVendedor.nome+" \nSalário fixo: "+novoVendedor.salFix+" \ntotVendas: "+novoVendedor.calcComissao());
    }
}
