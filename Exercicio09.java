import classes.Intervalo;

public class Exercicio09 {
    public static void executar(){

        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor: ");
        Intervalo objIntervalo = new Intervalo(tamanho);

        for (int i = 0; i < objIntervalo.getTamanho(); i++) {
            objIntervalo.getVetor()[i] = Prompt.lerInteiro("Preencha o vetor:");
        }
        
        Prompt.imprimir("Números dentro do intervalo de 10 a 150: "+objIntervalo.contarNumeros());
    }
}
