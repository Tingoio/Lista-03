package classes;

public class Produto {
    private double precoCusto;
    private double precoVenda;

    public Produto(){
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String calcularResultado(double precoVenda, double precoCusto){
        if(precoVenda-precoCusto<0){
            return "Prejuízo";
        }
        else if(precoVenda-precoCusto>0){
            return "Lucro";
        }else{
            return "Empate";
        }
        
    }
}
