package controle;
public class Cliente extends Pessoa{
    private Projeto projeto;
    private char status;

    public Cliente(String nome, String idade, String cpf, String telefone, double conta, Projeto projeto, char status) {
        super(nome, idade, cpf, telefone);
        this.projeto = projeto;
        this.status = status;
    }
    public Cliente(){
        
    }
    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public String getStatus() {
        if(this.status=='a'){
            return "Ativo";
        }else if(this.status=='i'){
            return "Desativado";
        }  
        return null;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    public void adicionar_projeto(Projeto projeto){
        this.setProjeto(projeto);
    }
    public void excluir_projeto(){
        this.setProjeto(null);
    }
    
}
