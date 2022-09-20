package controle;
 public class Projeto {
    private String Nome;
    private String Descricao;
    private double valor;
    
    public Projeto(String Nome, String Descricao, double valor) {
        this.Nome = Nome;
        this.Descricao = Descricao;
        this.valor = valor;
    }
    public Projeto(){
        
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
}
