package classes;

public class CarroNovo {
    
    private double custoFabrica;

    public CarroNovo(){

    }

    public double getCustoFabrica(){
        return this.custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica){
        this.custoFabrica = custoFabrica;
    }

    public double custoCarroNovo(){
        double imposto = custoFabrica * 0.45;
        double custoImposto = custoFabrica + imposto;
        double distribuidor = custoImposto * 0.28;
        return custoImposto + distribuidor;

    }
}
