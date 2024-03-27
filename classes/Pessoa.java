package classes;

public class Pessoa {

    public String nome;
    public char sexo;

    public Pessoa(String nome, char sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public String verificaSexo(char sexo){
        if(sexo=='M'||sexo=='m'){
            return "Homem";
        }
        else if(sexo=='F'||sexo=='f'){
            return "Mulher";
        }
        else{
            return "Digite (M) para masculino ou (F) para feminino!";
        }
    }





}
