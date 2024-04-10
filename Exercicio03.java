import classes.Vendedor;

public class Exercicio03 {
    public static void executar(){

        Vendedor novoVendedor = new Vendedor();
        novoVendedor.setNome("Manoel");
        novoVendedor.setSalFix(1000);
        novoVendedor.setTotVendas(5000);

        Prompt.imprimir("Nome: "+novoVendedor.getNome()+" \nSalário fixo: "+novoVendedor.getSalFix()+" \ntotVendas: "+novoVendedor.calcComissao());
    }
}
