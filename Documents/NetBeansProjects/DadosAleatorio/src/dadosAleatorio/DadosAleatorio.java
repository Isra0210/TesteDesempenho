package dadosAleatorio;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Random;
public class DadosAleatorio {

    public static void main(String[] args) throws UnknownHostException {
        int i;

        long tempoInicial = System.currentTimeMillis();

        Numeros n = new Numeros();
        Conexao conexao = new Conexao();

        ArrayList<Integer> lista = new ArrayList<Integer>();;
        
        Random gerador = new Random();
        
        for (i = 1; i <= 10000; i++) {
            lista.add(gerador.nextInt());
        }
        
        for(int valores : lista){
            n.setNumero(valores);
            conexao.valoresAleatorios(n);
        } 
        
        long tempoFinal = System.currentTimeMillis();
        
        long tempoMillisegundos = (tempoFinal - tempoInicial) ;
        
        System.out.println("Tempo de execução: " + tempoMillisegundos + " Millisegundos");
        
        long tempoSegundos = tempoMillisegundos / 1000;
        
        System.out.println("Tempo em segundos: " + tempoSegundos);
        
        long tempoMinutos = tempoSegundos / 60;
        
        System.out.println("Tempo em minutos: " + tempoMinutos);
        
        System.exit(0);
    }
}
