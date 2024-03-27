package classes;

public class Intervalo {
    public double[] vetor = new double[80];
    public int contador;

    public int contarNumeros(){
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]>=10&&vetor[i]<=150){
                contador += 1;
            }
        }
        return contador;
    }
}
