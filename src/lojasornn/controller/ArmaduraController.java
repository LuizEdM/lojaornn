package lojasornn.controller;
import java.util.ArrayList;
import lojasornn.model.Armadura;

public class ArmaduraController {
    public void cadastrarArmadura(String TipoArmadura, String Nome, String Poder, float Custo){

        if (TipoArmadura !=null &&  Nome != null &&  Poder != null &&  Custo >0);{
        Armadura armadura = new Armadura(TipoArmadura, Nome, Poder, Custo);
        armadura.cadastrarArmadura(armadura);
        }
        
   }
 
    public void alterarArmadura(int IdCliente, String TipoArmadura, String Nome, String Poder, float Custo){

        if (TipoArmadura !=null && TipoArmadura.length() > 0 && Nome != null && Nome.length() > 0 && Poder != null && Poder.length() > 0 && Custo >0);{
        Armadura armadura = new Armadura(TipoArmadura, Nome, Poder, Custo);
        armadura.setIdArmadura(IdCliente);
        armadura.alterarArmadura(armadura);
         }
         
    }
    
      public void excluirArmadura(int IdArmadura){
        
        if(IdArmadura>0){
        Armadura armadura = new Armadura();
        armadura.excluirArmadura(IdArmadura);
        
        }
      }
         public ArrayList<Armadura> listarArmadura(){
         
             Armadura armadura = new Armadura();
             return armadura.listarArmadura();
         
     }
}
