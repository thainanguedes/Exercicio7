
public class Administrador extends Empregado{
    
    private double AjudaDeCusto;
    
    public Administrador( String cs, double sb, double i,String n,String e, String t, double ac){
        super(cs,sb,i,n,e,t);
        this.setAjudaDeCusto(ac);
    }
    
    public double CalcularSalario(){
       return this.getSalarioBase()*this.getImposto() + this.getAjudaDeCusto();
    }

    public double getAjudaDeCusto() {
        return AjudaDeCusto;
    }

    public void setAjudaDeCusto(double ac) {
        this.AjudaDeCusto = ac;
    }
    
    
}
  

