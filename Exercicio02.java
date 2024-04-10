import classes.Automovel;

public class Exercicio02{
    public static void executar(){

        Automovel objAutomovel = new Automovel();
        objAutomovel.setDistancia(200);
        objAutomovel.setCombustivel(100);

        Prompt.imprimir("Consumo médio: " + objAutomovel.getCombustivel()/objAutomovel.getDistancia()+"km/l");
        
    }
}