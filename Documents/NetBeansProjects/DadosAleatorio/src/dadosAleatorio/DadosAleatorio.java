package dadosAleatorio;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
public class DadosAleatorio {

    public static void main(String[] args) throws UnknownHostException {
        int i;
        
        long tempoInicial = System.currentTimeMillis();
        
        Timer timer1 = new Timer();
        Timer timer2 = new Timer();
        Numeros n = new Numeros();
        Conexao conexao = new Conexao();

//        int []vetor = new int[10000];
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        Random gerador = new Random();
        
        for (i = 1; i <= 10000; i++) {
            lista.add(gerador.nextInt());
//            vetor[i] = gerador.nextInt();
        }
        
        for(int valores : lista){
            n.setNumero(valores);
            conexao.valoresAleatorios(n);
            System.out.println(valores);
        } 
        long tempoFinal = System.currentTimeMillis();
        
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + " Millisegundos");
        System.exit(0);
    }
}
