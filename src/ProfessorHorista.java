
public class ProfessorHorista extends Professores {
    
    private double ValorHora;
    
    public ProfessorHorista(double vh, String n, int i, int m){
        super(n,i,m);
        this.setValorHora(vh);
    }
    
    public double getValorHora(){
        return ValorHora;
    }
    public void setValorHora(double vh){
        this.ValorHora = vh;
    }
}
