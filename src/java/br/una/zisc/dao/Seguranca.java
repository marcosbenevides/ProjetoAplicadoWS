package br.una.zisc.dao;
// Generated 29/10/2016 15:56:44 by Hibernate Tools 4.3.1



/**
 * Seguranca generated by hbm2java
 */
public class Seguranca  implements java.io.Serializable {


     private int idseguranca;
     private Usuario usuario;
     private String hash;
     private String password;
     private String copare;

    public Seguranca() {
    }

    public Seguranca(int idseguranca, Usuario usuario, String hash, String password, String copare) {
       this.idseguranca = idseguranca;
       this.usuario = usuario;
       this.hash = hash;
       this.password = password;
       this.copare = copare;
    }
   
    public int getIdseguranca() {
        return this.idseguranca;
    }
    
    public void setIdseguranca(int idseguranca) {
        this.idseguranca = idseguranca;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getHash() {
        return this.hash;
    }
    
    public void setHash(String hash) {
        this.hash = hash;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCopare() {
        return this.copare;
    }
    
    public void setCopare(String copare) {
        this.copare = copare;
    }




}


