import classes.CarangoVelho;

public class Exercicio12 {
    public static void executar(){

        int carros2000 = 0, carrosTot = 0;

        char opcao;
        do{
            int anoCarro = Prompt.lerInteiro("Digite o ano em que o carro foi fabricado: ");
            double valorOriginal = Prompt.lerDecimal("Digite o valor original do a ser pago: ");

            CarangoVelho carro = new CarangoVelho(anoCarro);

            Prompt.imprimir("Desconto: " + (carro.calcDesconto() * 100) + "%");

            Double valorComDesconto = valorOriginal - (valorOriginal * carro.calcDesconto());
            Prompt.imprimir("Valor a ser pago pelo cliente: R$" + valorComDesconto);

            if (anoCarro <= 2000) {
                carros2000++;
            }
            carrosTot++;

            opcao = Prompt.lerCaractere("Digite 'S' para continuar ou 'N' para abortar: ");
        }while(opcao == 'S' || opcao == 's');

        Prompt.imprimir("Carros até 2000: " + carros2000);
        Prompt.imprimir("Geral: " + carrosTot);
    }
}
