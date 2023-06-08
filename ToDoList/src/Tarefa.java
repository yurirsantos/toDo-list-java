public class Tarefa {
    private int ID;
    private String Titulo;
    private String Descricao;
    private String DataEntrega;
    private String Prioridade;
    private Boolean Status;
    
    public Tarefa(int ID, String Titulo, String Descricao, String DataEntrega, String Prioridade, Boolean Status){
        this.ID = ID;
        this.Titulo = Titulo;        
        this.Descricao = Descricao;
        this.DataEntrega = DataEntrega;
        this.Prioridade = Prioridade;
        this.Status = Status;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getID() {
        return ID;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getDataEntrega() {
        return DataEntrega;
    }

    public String getPrioridade() {
        return Prioridade;
    }

    public Boolean getStatus() {
        return Status;
    }
   
}
