package classes;

public class Carango {
    private double vlrCarro;
    private int combustivel;

    public Carango(){

    }

    public double getVlrCarro() {
        return vlrCarro;
    }

    public void setVlrCarro(double vlrCarro) {
        this.vlrCarro = vlrCarro;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public double calcularDesconto(int combustivel){
        switch (combustivel) {
            case 1: {
                return 0.25;
            }
            case 2: {
                return 0.21;
            }
            case 3: {
                return 0.14;
            }
            default:{
                return 0;
            }
        }
    }

}
