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
    
    public static boolean selectIdTarefaEdicao(int ID){  
        try {
            getListaTarefas().get(ID);
            IDTarefaEdicao = ID;
            return true;
        } catch (Exception e) {
            IDTarefaEdicao = -1;
            return false;
        }
    }
    
    public static int IDTarefaEdicao(){
        return IDTarefaEdicao;
    }
    
    public static List<Tarefa> Tarefas = new ArrayList<> ();
    
    public static List<Tarefa> getListaTarefas(){
        return Tarefas;
    }
    
    public static void setListaTarefas(Tarefa newTarefa){
        Tarefas.add(newTarefa);
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
    
    public static String getDataEntregaTarefa(int ID){
        return Tarefas.get(ID).DataEntrega;
    }
    
    public static String getPrioridadeTarefa(int ID){
        return Tarefas.get(ID).Prioridade;
    }
    
    public static String getStatusTarefa(int ID){
        String status;
        
        if(Tarefas.get(ID).Status){
            status = "Finalizado";
        }else {
            status = "Pendente";
        }
            
        return status;
    }
    
    public static void setNewTitleTarefa(String newTitulo){
        Tarefa tarefaEditando = getListaTarefas().get(IDTarefaEdicao);
        tarefaEditando.Titulo = newTitulo;  
    }
    
    public static void setNewDescricaoTarefa(String newDescricao){
        Tarefa tarefaEditando = getListaTarefas().get(IDTarefaEdicao);
        tarefaEditando.Descricao = newDescricao;  
    }
    
    public static void setNewDataEntregaTarefa(String newDataEntrega){
        Tarefa tarefaEditando = getListaTarefas().get(IDTarefaEdicao);
        tarefaEditando.DataEntrega = newDataEntrega;  
    }
    
    public static void setNewPrioridade(String newPrioridade){
        Tarefa tarefaEditando = getListaTarefas().get(IDTarefaEdicao);
        tarefaEditando.Prioridade = newPrioridade;  
    }
    
    public static void setNewStatus(boolean newStatus){
        Tarefa tarefaEditando = getListaTarefas().get(IDTarefaEdicao);
        tarefaEditando.Status = newStatus;  
    }
}

