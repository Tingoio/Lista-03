import classes.Intervalo;

public class Exercicio09 {
    public static void executar(){

        Intervalo objIntervalo = new Intervalo();

        for (int i = 0; i < 80; i++) {
            objIntervalo.vetor[i] = Prompt.lerDecimal("Preencha o vetor: ");
        }

        Prompt.imprimir("Número dentro do intervalo de 10 a 150: "+objIntervalo.contador);
    }
}
