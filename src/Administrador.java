
public class Administrador extends Empregado{
    
    private double AjudaDeCusto;
    
    public Administrador(String n,String e, String t, String cs, double sb, double i, double ac){
        super(n,e,t,cs,sb,i);
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
  

