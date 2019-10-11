
public class Fornecedor extends Pessoa {
    
    private double valorCredito;
    private double valorDivida;
    
    public Fornecedor(double vc, double vd, String n, String e, String t){
        super(n,e,t);
        this.setValorCredito(vc);
        this.setValorDivida(vd);
    }
     public double obterSaldo(){
       return this.getValorCredito()- this.getValorDivida();
    }
    
    public double getValorCredito(){
        return valorCredito;
    }
    public void setValorCredito(double valorCredito){
        this.valorCredito = valorCredito;
    }
    private double getValorDivida(){
        return valorDivida;
    }
    private void setValorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }
    
}
