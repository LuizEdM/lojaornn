package lojasornn.DAO;
import java.sql.ResultSet;
import java.util.ArrayList;
import lojasornn.model.Armadura;

public class ArmaduraDAO {
        public void cadastrarArmadura(Armadura armadura){
        String sql = "INSERT INTO armadura (TipoArmadura, Nome, Poder, Custo) VALUES ( "
                + " '" + armadura.getTipoArmadura()+  "' , "
                + " '" + armadura.getNome() +  " ' , "
                + " '" + armadura.getPoder() +  " ' , "
                + " '" + armadura.getCusto() + "  ') ";
        System.out.println(sql);
            
        Conexaoornn.executar(sql);
}
     public void alterarArmadura(Armadura armadura){
         String sql = "UPDATE armadura SET "
                + "TipoArmadura  = '" + armadura.getTipoArmadura() + " ' ,"
                + "Nome  = '" + armadura.getNome() + " ' ,"
                + "Poder  = '" + armadura.getPoder() + " ' ,"
                + "Custo  = '" + armadura.getCusto() + " '  "
                + "WHERE IdArmadura = " + armadura.getIdArmadura();
        Conexaoornn.executar(sql);
     }
     public static void excluirArmadura(int IdArmadura){
         String sql = "DELETE FROM Armadura WHERE IdArmadura = " + IdArmadura;
         
         Conexaoornn.executar(sql);
         
     }
    public ArrayList<Armadura> listarArmadura(){
         
        ArrayList<Armadura> arrayarmadura = new ArrayList<>();
        String sql = "SELECT IdArmadura, TipoArmadura, Nome, Poder, Custo FROM Armadura ORDER BY nome";
        ResultSet result = Conexaoornn.consultar(sql);
        
         if(result != null){
            try{
                while(result.next()){
                    String tipoarmadura = result.getString("TipoArmadura");
                    String nome = result.getString("Nome");
                    String poder = result.getString("Poder");
                    float custo = result.getFloat("Custo");
                    Armadura armadura = new Armadura(tipoarmadura, nome, poder, custo);
                    armadura.setIdArmadura(result.getInt("IdArmadura"));
                    arrayarmadura.add(armadura);
                }
                return arrayarmadura;
            }catch(Exception e){
                
            }
        
        

     }
         return null;
}
}
