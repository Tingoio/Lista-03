import classes.Funcionario;

public class Exercicio16 {
    public static void executar(){
        
        Funcionario[] funcionarios = new Funcionario[584];

        for (int i = 0; i < funcionarios.length; i++) {
            
            funcionarios[i] = new Funcionario();

            funcionarios[i].setNome(Prompt.lerLinha("Nome do funcionário: "));
            funcionarios[i].setSalario(Prompt.lerDecimal("Salário do funcionário: "));

            
            double valorReajuste = funcionarios[i].getSalario() * funcionarios[i].calcularReajuste(funcionarios[i].getSalario() * 100);
            Prompt.imprimir("Reajuste do funcionário " + funcionarios[i].getNome() + ": " + (valorReajuste + funcionarios[i].getSalario()));

        }
    }
}
