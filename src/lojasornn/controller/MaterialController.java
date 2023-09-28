package lojasornn.controller;

import lojasornn.model.Material;


public class MaterialController {
    
    public void cadastrarMaterial(String NomeMaterial, String LocalOrigem, String MateriaPrima){
    
      if (LocalOrigem !=null && MateriaPrima !=null && NomeMaterial !=null){
      Material material = new Material (NomeMaterial, LocalOrigem, MateriaPrima);
      material.cadastrarMaterial(material);
    }
    }
    
    public void excluirMaterial (int IdMaterial){
    
        if(IdMaterial>0){
        Material material = new Material();
        material.excluirMaterial(IdMaterial);
        }
    }

    public String[] buscavalores() {
       
    }
    
}
