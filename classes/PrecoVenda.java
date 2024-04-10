package classes;

public class PrecoVenda {
    
    private double precoCusto;
    private double percentual;

    public PrecoVenda(){

    }

    public double calcPrecoVenda(){
        return precoCusto * (1.0 + (percentual / 100));
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    
}
