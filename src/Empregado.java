
public class Empregado extends Pessoa {
    
    private String codigoSetor;
    private double salarioBase;
    private double imposto;

    //construtor
    public Empregado(String cs, double sb, double i, String n, String e, String t) {
        super(n, e, t);
        this.setCodigoSetor(cs);
        this.setSalarioBase(sb);
        this.setImposto(i);
    }
    //calculandoSalario
    public double calcularSalario(){
        return this.getSalarioBase() - (this.getSalarioBase() * this.getImposto());
    }

    public String getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(String codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    
}
