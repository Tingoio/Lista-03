package classes;

public class Conversao {
    
    public double dolar;
    public double cotacao;

    public Conversao(double dolar, double cotacao){
        this.dolar = dolar;
        this.cotacao = cotacao;
    }

    public double calcConversao(){
        return dolar * cotacao;
    }
}
