import classes.PessoaApta;

public class Exercicio13 {
    public static void executar(){

        int qtdPessoas = Prompt.lerInteiro("Digite o numero de pessoas que deseja validar: ");
        int aptos = 0, naoAptos = 0;

        for(int i = 0; i < qtdPessoas; i++){
            String nome = Prompt.lerLinha("Digite o nome da pessoa: ");
            char sexo = Prompt.lerCaractere("Digite o sexo da pessoa (M/F): ");
            int idade = Prompt.lerInteiro("Digite a idade da pessoa: ");
            char saude = Prompt.lerCaractere("A pessoa tem aglum problema de saúde crônico (S/N)? ");

            PessoaApta objPessoaApta = new PessoaApta(nome, sexo, idade, saude);

            if(sexo=='m'||sexo=='M'){
                if(idade>=18){
                    if(saude=='s'||saude=='S'){
                        aptos++;
                    }else{
                        naoAptos++;
                    }
                }else{
                    naoAptos++;
                }
            }else{
                naoAptos++;
            }
        }

        Prompt.imprimir("Total de pessoas: "+qtdPessoas+"\nAptos: "+aptos+"\nNão aptos: "+naoAptos);

        
    }
    
}
