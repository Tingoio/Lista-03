package classes;

public class PessoaApta {
    private String nome;
    private char sexo;
    private int idade;
    private char saude;

    public PessoaApta(){
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSaude() {
        return saude;
    }

    public void setSaude(char saude) {
        this.saude = saude;
    }

    public int validarPessoa(char sexo,  int idade, char saude){
        if(sexo == 'M' || sexo == 'm'){
            if(idade>=18){
               if(saude == 'N' || saude == 'n'){
                    Prompt.imprimir(nome + " Está apto");
                    return 1;
                }else{
                    Prompt.imprimir(nome + " Não está apto");
                    return 0;
                }   
            }else{
                Prompt.imprimir(nome + " Não está apto");
                return 0;
            }
        }else{
            Prompt.imprimir(nome + " Não está apto");
            return 0;
        }
    }

    
}
