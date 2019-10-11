
public class AssistenteAdministrativo extends Assistente {
    
    private double adicionalNoturno;

    public AssistenteAdministrativo(double an, Gerente s, String n, String m) {
        super(s,n,m);
        this.setAdicionalNoturno(an);
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double an) {
        this.adicionalNoturno = an;
    }
    
    
}
