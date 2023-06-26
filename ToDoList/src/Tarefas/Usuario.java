/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarefas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
        
        Usuario usuarioPadrao2 = new Usuario(1, "Kauane Policena Artini", "kauane@gmail.com", "Normal", "1234", true);
        ListaUsuarios.add(usuarioPadrao2);
    }

    public static List<Usuario> getListaUsuarios(){
        return ListaUsuarios;
    }
    
    public static boolean setUsuarioLista(Usuario newUsuario){
        Boolean userRegister = true;
        
        for(int i = 0; i < ListaUsuarios.size(); i++){
            String loginUserRegister = ListaUsuarios.get(i).login;
            
            if(loginUserRegister.equals(newUsuario.login)){
                userRegister = false;
            }
        }
        
        if(userRegister){
            ListaUsuarios.add(newUsuario);
        }else {
            JOptionPane.showMessageDialog(null, "Usuário já cadastrado(a)!");
        }
        
        return userRegister;
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
    
    public static String getEmailUsuario(int ID){
        return ListaUsuarios.get(ID).login;
    }
    
    public static String getTipoUsuario(int ID){
        return ListaUsuarios.get(ID).tipo;
    }
    
    public static String getStatusUsuario(int ID){
        String status = "";
        
        if(ListaUsuarios.get(ID).status){
            status = "Ativo(a)";
        }else {
            status = "Inativo(a)";
        }
        return status;
    }
        
    public static int getIDUsuario(int ID){
        return ListaUsuarios.get(ID).ID;
    }
    
    public static int getIDUsuarioLogin(String login){
        int IDUsuario = -1;
        
        for(int i = 0; i < ListaUsuarios.size(); i++){
            if(ListaUsuarios.get(i).login.equals(login)){
                IDUsuario = ListaUsuarios.get(i).ID;
            }
        }
        
        return IDUsuario;
    }
    
    public static String getNomeUsuario(int ID){
        return ListaUsuarios.get(ID).nome;
    }
    
    public static void setNewNome(String newNome, int IDUsuario){
        ListaUsuarios.get(IDUsuario).nome = newNome;
    }
    
    public static void setNewEmail(String newEmail, int IDUsuario){
        ListaUsuarios.get(IDUsuario).login = newEmail;
    }
    
    public static void setNewSenha(String newSenha, int IDUsuario){
        ListaUsuarios.get(IDUsuario).senha = newSenha;
    }
}
