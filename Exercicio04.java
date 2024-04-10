import classes.Conversao;

public class Exercicio04 {
    public static void executar(){

        Conversao objConversao = new Conversao();
        objConversao.setDolar(10);
        objConversao.setCotacao(5.1);

        Prompt.imprimir("Valor em reais: R$"+objConversao.getDolar()*objConversao.getCotacao());
    }
}
