import classes.FuncionarioAbono;

public class Exercicio18 {
    public static void executar(){

        FuncionarioAbono funcionario = new FuncionarioAbono();

        funcionario.setNome(Prompt.lerLinha("Digite o nome do funcionario: "));
        funcionario.setIdade(Prompt.lerInteiro("Digite a idade do funcionario: "));
        funcionario.setSexo(Prompt.lerCaractere("Digite o sexo do funcionario: "));
        funcionario.setSalarioFixo(Prompt.lerDecimal("Digite o salário fixo do funcionário: "));

        Prompt.imprimir("Nome: " + funcionario.getNome());
        Prompt.imprimir("Salário líquido: " + (funcionario.getSalarioFixo() + funcionario.calcularAbono(funcionario.getSexo(), funcionario.getIdade())));
    }
}
