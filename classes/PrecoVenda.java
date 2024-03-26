package classes;

public class PrecoVenda {
    
    public double precoCusto;
    public double percentual;

    public PrecoVenda(double precoCusto, double percentual){
        this.precoCusto = precoCusto;
        this.percentual = percentual;
    }

    public double calcPrecoVenda(){
        return precoCusto * (1.0 + (percentual / 100));
    }
}
