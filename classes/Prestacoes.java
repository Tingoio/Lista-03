package classes;

public class Prestacoes{

    public double vlrCompra;

    public Prestacoes(double vlrCompra){
        this.vlrCompra = vlrCompra;
    }

    public double vlrPrestacoes(){
        return vlrCompra / 5;
    }
}