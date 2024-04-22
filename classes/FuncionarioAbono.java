package classes;

public class FuncionarioAbono{
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public FuncionarioAbono(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularAbono(char sexo, int idade){
        if(sexo == 'M' || sexo  == 'm'){
            if(idade >= 30){
                return 100;
            }else{
                return 50;
            }
        }
        else if(sexo == 'F' || sexo == 'f'){
            if(idade >= 30){
                return 200;
            }else{
                return 80;
            }
        }
        else{
            return 0;
        }
    }
}