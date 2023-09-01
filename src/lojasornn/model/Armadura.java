package lojasornn.model;

import java.util.ArrayList;
import lojasornn.DAO.ArmaduraDAO;


public class Armadura {
    private int IdArmadura;
    private String TipoArmadura;
    private String Nome;
    private String Poder;
    private float Custo;

public Armadura (String TipoArmadura, String Nome, String Poder, float Custo){

        this.TipoArmadura=TipoArmadura;
        this.Nome=Nome;
        this.Poder=Poder;
        this.Custo=Custo;
}
public Armadura(){
}

    public void Armadura(){}

    public int getIdArmadura(){
        return IdArmadura;
    }
    public void setIdArmadura(int idarmadura){
        this.IdArmadura=idarmadura;
    }
    
    public String getTipoArmadura(){
        return TipoArmadura;
    }
    public void setTipoArmadura(String tipoarmadura){
        this.TipoArmadura=tipoarmadura;
    }
    
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        this.Nome=nome;
    }
    
    public String getPoder(){
        return Poder;
    }
    public void setPoder(String poder){
        this.Poder=poder;
    }
    
    public float getCusto(){
        return Custo;
    }
    public void setIdArmadura(float custo){
        this.Custo=custo;
    }
    
    public void cadastrarArmadura (Armadura armadura){
        ArmaduraDAO AdDAO = new ArmaduraDAO();
        AdDAO.cadastrarArmadura(armadura);
    }
    public void alterarArmadura(Armadura armadura){
        ArmaduraDAO AdDAO = new ArmaduraDAO();
        AdDAO.alterarArmadura(armadura);
    }
    public void excluirArmadura(int IdArma){
        ArmaduraDAO AdDAO = new ArmaduraDAO();
        
        AdDAO.excluirArmadura(IdArmadura);
    }
    public ArrayList<Armadura> listarArmadura(){
        ArmaduraDAO AdDAO = new ArmaduraDAO();
        return AdDAO.listarArmadura();
    }

}
