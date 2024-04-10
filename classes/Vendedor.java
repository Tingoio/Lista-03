package classes;

public class Vendedor {
    
    private String nome;
    private double salFix;
    private double totVendas;

    public Vendedor(){
    }

    public double calcComissao(){
        return salFix + (totVendas * 0.15);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalFix() {
        return salFix;
    }

    public void setSalFix(double salFix) {
        this.salFix = salFix;
    }

    public double getTotVendas() {
        return totVendas;
    }

    public void setTotVendas(double totVendas) {
        this.totVendas = totVendas;
    }

    
}
