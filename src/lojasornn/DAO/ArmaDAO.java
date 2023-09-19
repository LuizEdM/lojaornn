package lojasornn.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import lojasornn.model.Arma;

public class ArmaDAO {
    
    public void cadastrarArma(Arma arma){
        String sql = "INSERT INTO arma (TipoArma, Nome, Poder, Custo) VALUES ( "
                + " '" + arma.getTipoArma() +  "' , "
                + " '" + arma.getNome() +  " ' , "
                + " '" + arma.getPoder() +  " ' , "
                + " '" + arma.getCusto() + "  ') ";
        
            
        Conexaoornn.executar(sql);
}
     public void alterarArma(Arma arma){
         String sql = "UPDATE arma SET "
                + "TipoArma  = '" + arma.getTipoArma() + " ' ,"
                + "Nome  = '" + arma.getNome() + " ' ,"
                + "Poder  = '" + arma.getPoder() + " ' ,"
                + "Custo  = '" + arma.getCusto() + " '  "
                + "WHERE IdArma = " + arma.getIdArma();
        Conexaoornn.executar(sql);
     }
     public static void excluirArma(int IdArma){
         String sql = "DELETE FROM Arma WHERE IdArma = " + IdArma;
         
         Conexaoornn.executar(sql);
         
     }
    public ArrayList<Arma> listarArma(){
         
        ArrayList<Arma> arrayarma = new ArrayList<>();
        String sql = "SELECT IdArma, TipoArma, Nome, Poder, Custo FROM Arma ORDER BY nome";
        ResultSet result = Conexaoornn.consultar(sql);
        
         if(result != null){
            try{
                while(result.next()){
                    String tipoarma = result.getString("TipoArma");
                    String nome = result.getString("Nome");
                    String poder = result.getString("Poder");
                    float custo = result.getFloat("Custo");
                    Arma arma = new Arma(tipoarma, nome, poder, custo);
                    arma.setIdArma(result.getInt("IdArma"));
                    arrayarma.add(arma);
                }
                return arrayarma;
            }catch(Exception e){
                
            }
        
        

     }
         return null;
}
   
}
