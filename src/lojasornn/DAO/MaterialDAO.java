package lojasornn.DAO;

import lojasornn.model.Material;


public class MaterialDAO {
    
    public void cadastrarMaterial(Material material){
        String sql = "INSERT INTO material (NomeMaterial, LocalOrigem, MateriaPrima) VALUES ( "
                + " '" + material.getNomeMaterial() +  "' , "
                + " '" + material.getLocalOrigem() +  " ' , "
                + " '" + material.getMateriaPrima() +  " ' ) ";
           
        Conexaoornn.executar(sql);
        
        }
    
    public static void excluirMaterial(int IdMaterial){
         String sql = "DELETE FROM material WHERE IdMaterial = " + IdMaterial;
         
         Conexaoornn.executar(sql);
         
     }
}
