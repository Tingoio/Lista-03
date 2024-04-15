import classes.PessoaApta;

public class Exercicio13 {
    public static void executar(){

        int qtdPessoas = Prompt.lerInteiro("Digite o numero de pessoas que deseja validar: ");
        int aptos = 0, naoAptos = 0;

        for(int i = 0; i < qtdPessoas; i++){
            PessoaApta pessoa = new PessoaApta();

            pessoa.setNome(Prompt.lerLinha("Digite o nome da pessoa: "));
            pessoa.setSexo(Prompt.lerCaractere("Digite o sexo da pessoa (M/F): "));;
            pessoa.setIdade(Prompt.lerInteiro("Digite a idade da pessoa: "));
            pessoa.setSaude(Prompt.lerCaractere("A pessoa tem aglum problema de saúde crônico (S/N)? "));;

            if(pessoa.validarPessoa(pessoa.getSexo(), pessoa.getIdade(), pessoa.getSaude())==1){
                aptos++;
            }else{
                naoAptos++;
            }
        }

        Prompt.imprimir("Total de pessoas: "+qtdPessoas+"\nAptos: "+aptos+"\nNão aptos: "+naoAptos);

        
    }
    
}
