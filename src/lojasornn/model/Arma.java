package lojasornn.model;

import java.util.ArrayList;
import lojasornn.DAO.ArmaDAO;


public class Arma {
    private int IdArma;
    private String TipoArma;
    private String Nome;
    private String Poder;
    private float Custo;
    

    public Arma (String TipoArma, String Nome, String Poder, float Custo){

        this.TipoArma=TipoArma;
        this.Nome=Nome;
        this.Poder=Poder;
        this.Custo=Custo;
    }

    public Arma() {
       
    }

    public void Arma(){}

    public int getIdArma(){
        return IdArma;
    }
    public void setIdArma(int idarma){
        this.IdArma=idarma;
    }
    
    public String getTipoArma(){
        return TipoArma;
    }
    public void setTipoArma(String tipoarma){
        this.TipoArma=tipoarma;
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
    public void setIdArma(float custo){
        this.Custo=custo;
    }
    
    public void cadastrarArma (Arma arma){
        ArmaDAO ADAO = new ArmaDAO();
        ADAO.cadastrarArma(arma);
    }
    public void alterarArma(Arma arma){
        ArmaDAO ADAO = new ArmaDAO();
        ADAO.alterarArma(arma);
    }
    public void excluirArma(int IdArma){
        ArmaDAO ADAO = new ArmaDAO();
        
        ADAO.excluirArma(IdArma);
    }
    public ArrayList<Arma> listarArma(){
        ArmaDAO ADAO = new ArmaDAO();
        return ADAO.listarArma();
    }
    
}