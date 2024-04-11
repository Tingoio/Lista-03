package classes;
public class MaiorIdade {
    
    private int idade;

    public MaiorIdade(){
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }  

    public String defineIdade(){
        if(idade>=18){
            return "Maior de idade.";
        }
        else{
            return "Menor de idade.";
        }
    }

}
