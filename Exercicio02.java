import classes.Automovel;

public class Exercicio02{
    public static void executar(){

        double distanciaPerc = Prompt.lerDecimal("Digite a distância percorrida: ");
        double combGasto = Prompt.lerDecimal("Digite o combustível gasto: ");

        Automovel objAutomovel = new Automovel(distanciaPerc, combGasto);

        Prompt.imprimir("Consumo médio: " + objAutomovel.mediaConsumo());
        
        
    }
}