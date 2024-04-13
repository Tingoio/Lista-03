import classes.CarroCarango;

public class Exercicio12 {
    public static void executar(){

        int carros2000 = 0, carrosTot = 0;
        
        char opcao;
        do{
            CarroCarango carro  = new CarroCarango();

            carro.setAnoCarro(Prompt.lerInteiro("Digite o ano em que o carro foi fabricado: "));;
            double valorOriginal = Prompt.lerDecimal("Digite o valor original do a ser pago: ");


            Prompt.imprimir("Desconto: " + String.format("%.2f", carro.calcDesconto() * 100) + "%");

            Double valorComDesconto = valorOriginal - (valorOriginal * carro.calcDesconto());
            Prompt.imprimir("Valor a ser pago pelo cliente: R$" + valorComDesconto);

            if (carro.getAnoCarro() <= 2000) {
                carros2000++;
            }
            carrosTot++;

            opcao = Prompt.lerCaractere("Digite 'S' para continuar ou 'N' para abortar: ");
        }while(opcao == 'S' || opcao == 's');

        Prompt.imprimir("Carros até 2000: " + carros2000);
        Prompt.imprimir("Geral: " + carrosTot);
    }
}
