import classes.Funcionario;
import classes.FolhaPagamento;


public class Exercicio17 {
    public static void executar(){

        Funcionario funcionario = new Funcionario();
        FolhaPagamento aumento = new FolhaPagamento();

        funcionario.setNome(Prompt.lerLinha("Digite o nome do funcionário: "));
        funcionario.setSalario(Prompt.lerDecimal("Digite o valor do salario do funcionário: "));
        double salMinimo = Prompt.lerDecimal("Digite o valor do salario mínimo: ");

        Prompt.imprimir("Nome: " + funcionario.getNome());
        Prompt.imprimir("Salario " + (funcionario.getSalario() + (aumento.calcularReajuste(funcionario, salMinimo))));
        Prompt.imprimir("Aumento da folha de pagamento: " + aumento.getvlrFolhaPagam());

    }
}
