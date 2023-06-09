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
    
    public static int IDTarefaEdicao;
    
    public static void selectIdTarefaEdicao(int ID){
        IDTarefaEdicao = ID;
    }
    
    public static int IDTarefaEdicao(){
        return IDTarefaEdicao;
    }
    
    public static List<Tarefa> Tarefas = new ArrayList<> ();
    
    public static List<Tarefa> getListaTarefas(){
        return Tarefas;
    }
    
    public static String getTitleTarefa(int ID){
        return Tarefas.get(ID).Titulo;
    }
    
    public static int getIdTarefa(int ID){
        return Tarefas.get(ID).ID;
    }
    
    public static String getDescricaoTarefa(int ID){
        return Tarefas.get(ID).Descricao;
    }
    
    public static String getDataEntrega(int ID){
        return Tarefas.get(ID).DataEntrega;
    }
    
    public static String getPrioridade(int ID){
        return Tarefas.get(ID).Prioridade;
    }
    
    public static Boolean getStatusTarefa(int ID){
        return Tarefas.get(ID).Status;
    }
    
    public static void setListaTarefas(Tarefa newTarefa){
        Tarefas.add(newTarefa);
    } 
}
