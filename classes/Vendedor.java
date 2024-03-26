package classes;

public class Vendedor {
    
    public String nome;
    public double salFix;
    public double totVendas;

    public Vendedor(String nome, double salFix, double totVendas){
        this.nome = nome;
        this.salFix = salFix;
        this.totVendas = totVendas;
    }

    public double calcComissao(){
        return salFix + (totVendas * 0.15);
    }
}
