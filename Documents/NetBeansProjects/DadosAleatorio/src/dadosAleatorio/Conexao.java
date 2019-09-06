package dadosAleatorio;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import java.net.UnknownHostException;

public class Conexao {

    private Mongo conexao;
    private DB db;
    
    public void valoresAleatorios(Numeros num) throws UnknownHostException, MongoException{
        this.conexao = new Mongo("localhost", 27017);
        this.db = conexao.getDB("ValoresAleatorio");

        try{
            BasicDBObject valores = new BasicDBObject();
            valores.put("valores", num.getNumero());

            DBCollection col = db.getCollection("dados");
            col.insert(valores);
            
        }catch(Exception e){
            System.out.println(e.getClass().getName()+ ", " + e.getMessage());
        }
    }
}

