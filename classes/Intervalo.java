package classes;

public class Intervalo {
    private int tamanho;
    private double[] vetor = new double[tamanho];
    private int contador;

    public Intervalo(int tamanho){
        this.tamanho = tamanho;
        this.vetor = new double[tamanho];
    }

    public double[] getVetor() {
        return vetor;
    }

    public void setVetor(double[] vetor) {
        this.vetor = vetor;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public int contarNumeros(){
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]>=10&&vetor[i]<=150){
                contador += 1;
            }
        }
        return contador;
    }
}
