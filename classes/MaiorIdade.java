package classes;
public class MaiorIdade {
    
    public int idade;

    public MaiorIdade(int idade){
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
