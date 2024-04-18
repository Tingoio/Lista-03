package classes;

public class FolhaPagamento {
    
    private double vlrFolhaPagam;

    public FolhaPagamento(){

    }

    public Double getvlrFolhaPagam() {
        return vlrFolhaPagam;
    }

    public void setVlrFolhaPagam( double vlrFolhaPagam){
        this.vlrFolhaPagam = vlrFolhaPagam;
    }

    public double calcularReajuste(Funcionario funcionario, double salMinimo) {
        double reajuste;
        if (funcionario.getSalario() < 3 * salMinimo) {
            reajuste = funcionario.getSalario() * 0.5;
        } else if (funcionario.getSalario() >= 3 * salMinimo && funcionario.getSalario() < 10 * salMinimo) {
            reajuste = funcionario.getSalario() * 0.2;
        } else if (funcionario.getSalario() >= 10 * salMinimo && funcionario.getSalario() < 20 * salMinimo) {
            reajuste = funcionario.getSalario() * 0.15;
        } else {
            reajuste = funcionario.getSalario() * 0.1;
        }
        vlrFolhaPagam += reajuste;
        return reajuste;
    }

    

}
