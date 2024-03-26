package classes;

public class Automovel {
    public double distanciaPerc;
    public double combGasto;

    public Automovel(double distanciaPerc, double combGasto){
        this.distanciaPerc = distanciaPerc;
        this.combGasto = combGasto;
    }
    public double mediaConsumo(){
        return distanciaPerc / combGasto;
    }
}
