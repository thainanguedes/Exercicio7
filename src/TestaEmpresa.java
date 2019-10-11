
public class TestaEmpresa {
    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente("BD","Amadeu","004585");
        Gerente g2 = new Gerente("Redes","Malcon","005854");
        
        AssistenteAdministrativo ad1 = new AssistenteAdministrativo(0.1, g1, "Thainan", "0201");
        
        AssistenteTecnico at1 = new AssistenteTecnico(850, g2,"Tadeu","0450");
        
     
    }
    
}
