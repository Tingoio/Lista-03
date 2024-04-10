package classes;

public class Automovel {
    private double distanciaPerc;
    private double combGasto;

    public Automovel(){
    }
    public double mediaConsumo(){
        return distanciaPerc / combGasto;
    }

    public double getDistancia(){
        return  distanciaPerc;
    }
    public void setDistancia(double distanciaPerc){
        this.distanciaPerc = distanciaPerc;
    }

    public double getCombustivel(){
        return combGasto;
    }

    public void setCombustivel(double combGasto){
        this.combGasto = combGasto;
    }

    
}
