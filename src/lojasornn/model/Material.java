package lojasornn.model;

import lojasornn.DAO.MaterialDAO;

public class Material {
    private int IdMaterial;
    private String NomeMaterial;
    private String LocalOrigem;
    private String MateriaPrima;
    
    
    public Material(String NomeMaterial, String LocalOrigem, String MateriaPrima){
    
        this.NomeMaterial=NomeMaterial;
        this.LocalOrigem=LocalOrigem;
        this.MateriaPrima=MateriaPrima;
        
    }
    
    public Material(){}
    
    
    public int getIdMaterial(){
        return IdMaterial;
    }
    public void setIdMaterial(int idmaterial){
        this.IdMaterial=idmaterial;
    }
    
    public String getNomeMaterial(){
        return NomeMaterial;
    }
    public void setNomeMaterial(String nomematerial){
        this.NomeMaterial=nomematerial;
    }
    
    public String getLocalOrigem(){
        return LocalOrigem;
    }
    public void setLocalOrigem(String localorigem){
        this.LocalOrigem=localorigem;
    }
    
    public String getMateriaPrima(){
        return MateriaPrima;
    }
    public void setMateriaPrima(String materiaprima){
        this.MateriaPrima=materiaprima;
    }
    
    public void cadastrarMaterial (Material material){
       MaterialDAO MDAO = new MaterialDAO();
       MDAO.cadastrarMaterial(material);
    }
    
    public void excluirMaterial (int IdMaterial){
       MaterialDAO MDAO = new MaterialDAO();
       MDAO.excluirMaterial(IdMaterial);
    }
 }
