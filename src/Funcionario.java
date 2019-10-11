
public class Funcionario {
    
    private String nome;
    private String matricula;

    public Funcionario(String n, String m) {
        this.setNome(n);
        this.setMatricula(m); 
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
    
}
