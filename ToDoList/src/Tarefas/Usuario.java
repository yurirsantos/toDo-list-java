/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarefas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yuri
 */
public class Usuario {
    private int ID;
    private String nome;
    private String login;
    private String tipo;
    private String senha;
    private boolean status;
    
    
    public Usuario(int ID, String nome, String login, String tipo, String senha, Boolean status){
        this.ID = ID;
        this.nome = nome;
        this.login = login;
        this.tipo = tipo;
        this.senha = senha;
        this.status = status;
    }
    
    public static Usuario loginSelect = new Usuario(0, "", "", "", "", false);
    
    private static List<Usuario> ListaUsuarios = new ArrayList<> ();
    
    public static void registerUsuarioPadrao(){
        Usuario usuarioPadrao = new Usuario(0, "Yuri Rhuan dos Santos", "yuri@gmail.com", "Administrador", "1234", true);
        ListaUsuarios.add(usuarioPadrao);
    }

    public static List<Usuario> getListaUsuarios(){
        return ListaUsuarios;
    }
    
    public static void setUsuarioLista(Usuario newUsuario){
        ListaUsuarios.add(newUsuario);
    }
    
    public static Boolean login(String login, String senha){        
        for(int i = 0; i < getListaUsuarios().size(); i++){
            if(getListaUsuarios().get(i).login.equals(login)){
                loginSelect = getListaUsuarios().get(i);
            }
        }
        
        if(loginSelect.nome.length() > 0){
             if (loginSelect.senha.equals(senha)){
                return true;
            }      
        }

        return false;
    }
    
    public static String getTipoUsuario(){
        return ListaUsuarios.get(loginSelect.ID).tipo;
    }
    
    public static int getLoginUsuarioId (){
        return loginSelect.ID;
    }
    
}
