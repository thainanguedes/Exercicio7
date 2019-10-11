
public class ProfessorIntegral extends Professores {
    
    private double salarioFixo;
    
    public ProfessorIntegral(double sf, String n, int i, int m){
        super(n,i,m);
        this.setSalarioFixo(sf);
        
    }
    public double getSalarioFixo(){
        return salarioFixo;
    }
    public void setSalarioFixo(double sf){
        this.salarioFixo = sf;
}
    
}