package classes;

public class Pessoa {

    private String nome;
    private char sexo;

    public Pessoa(){
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    





}
