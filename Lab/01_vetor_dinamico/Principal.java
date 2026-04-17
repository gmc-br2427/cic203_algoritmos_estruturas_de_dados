import java.util.Random;
public class Principal {
    public static void main(String[] args) throws Exception{
        var Vetor = new Vetor();
        var gerador = new Random();
        while(true){
            // //sortear um booleano chamado ehParaAdicionar
            // var ehParaAdicionar = gerador.nextBoolean();
            // // se for pra add
            // if(ehParaAdicionar) {
            //     // sortear um número de 1 a 10
            //     var numero = gerador.nextInt(1, 11);
            //     // adicionar no Vetor
            //     Vetor.adiciona(numero);
            // } else {
            //     // remover do Vetor
            //     Vetor.remove();
            // }
            
            //pega um numero entre 0 e 1
            double escolha = gerador.nextDouble(0, 1); 
            //se for menor q 60%
            if (escolha <= 0.6) {
                //sortear um número de 1 a 10 e add
                int numero = gerador.nextInt(1, 11);
                Vetor.adiciona(numero);
            //se for menor q 90%
            } else if (escolha < 0.9) {
                //remover
                Vetor.remove();
            }

            // exibir o vetor
            System.out.println(Vetor);
            System.out.println("-----------------");
            Thread.sleep(3000);
        }
    }
}
