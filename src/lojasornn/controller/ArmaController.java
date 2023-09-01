package lojasornn.controller;
import java.util.ArrayList;
import lojasornn.model.Arma;

public class ArmaController {
    
    public void cadastrarArma(String TipoArma, String Nome, String Poder, float Custo){

        if (TipoArma !=null &&  Nome != null &&  Poder != null &&  Custo >0);{
        Arma arma = new Arma(TipoArma, Nome, Poder, Custo);
        arma.cadastrarArma(arma);
        }
        
   }
 
    public void alterarArma(int IdCliente, String TipoArma, String Nome, String Poder, float Custo){

        if (TipoArma !=null && TipoArma.length() > 0 && Nome != null && Nome.length() > 0 && Poder != null && Poder.length() > 0 && Custo >0);{
        Arma arma = new Arma(TipoArma, Nome, Poder, Custo);
        arma.setIdArma(IdCliente);
        arma.alterarArma(arma);
         }
         
    }
    
      public void excluirArma(int IdArma){
        
        if(IdArma>0){
        Arma arma = new Arma();
        arma.excluirArma(IdArma);
        
        }
      }
         public ArrayList<Arma> listarArma(){
         
             Arma arma = new Arma();
             return arma.listarArma();
         
     }
        
    }

  


