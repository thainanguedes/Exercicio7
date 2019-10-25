
public class Operario extends Empregado{
    
    private double ValorProducao;
    private double Comissao;
    
    public Operario ( String cs, double sb, double i,String n,String e, String t, double vp, double c){
        
        super(cs,sb,i,n,e,t);
        this.setValorProducao(vp);
        this.setComissao(c);
    }
    
    public double CalcularSalario(){
         return this.getSalarioBase()* this.getImposto() + this.getComissao();
    }

    public double getComissao() {
        return Comissao;
    }

    public double getValorProducao() {
        return ValorProducao;
    }

    public void setComissao(double c) {
        this.Comissao = c;
    }
    
    

    public void setValorProducao(double vp) {
        this.ValorProducao = vp;
    }
    
    
}
