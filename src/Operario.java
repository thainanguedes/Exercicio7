
public class Operario extends Empregado{
    
    private double ValorProducao;
    private double Comissao;
    
    public Operario (String n,String e, String t, String cs, double sb, double i, double vp, double c){
        
        super(n,e,t,cs,sb,i);
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
