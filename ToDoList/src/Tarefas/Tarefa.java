package Tarefas;

import java.util.ArrayList;
import java.util.List;
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
    
    public static List<Tarefa> Tarefas = new ArrayList<> ();
    
    public static List<Tarefa> getListaTarefas(){
        return Tarefas;
    }
    
    public static void setListaTarefas(Tarefa newTarefa){
        Tarefas.add(newTarefa);
    }
   
}
