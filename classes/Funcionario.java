package classes;

public class Funcionario{
    private String nome;
    private double salario;

    public Funcionario(){

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularReajuste(double salario){
        if(salario<4236){
            return 0.50;
        }
        else if (salario>=4236 || salario<=14120){
            return 0.20;
        }
        else if(salario>14120 && salario<28240){
            return 0.15;
        }
        else{
            return 0.10;
        }
    }

    
}