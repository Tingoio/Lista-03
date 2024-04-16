import classes.Carango;

public class Exercicio15 {
    public static void executar(){

        double vlrCarro = 0;

        do{
            Carango carro = new Carango();

            carro.setVlrCarro(Prompt.lerDecimal("Digite o valor do carro: "));
            carro.setCombustivel(Prompt.lerInteiro("Digite o combustível do carro:\n(1) Álcool (2) Gasolina (3) Diesel\n"));

            Prompt.imprimir("Desconto: " + carro.calcularDesconto(carro.getCombustivel()) * 100 + "%");
            double valorDesconto = carro.getVlrCarro() * carro.calcularDesconto(carro.getCombustivel());
            Prompt.imprimir("Valor a pagar: " + (carro.getVlrCarro() - valorDesconto));

        }while(vlrCarro==0);
    }
}
