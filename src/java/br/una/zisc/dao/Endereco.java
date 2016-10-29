package br.una.zisc.dao;
// Generated 29/10/2016 15:56:44 by Hibernate Tools 4.3.1

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * Endereco generated by hbm2java
 */
public class Endereco implements java.io.Serializable {

    private int idendereco;
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;
    private String longitude;
    private String latitude;
    private String tiporesidencia;

    public Endereco() {
    }

    @Override
    public String toString() {
        return "Endereco{" + "idendereco=" + idendereco + ", usuario=" + usuario +  ", longitude=" + longitude + ", latitude=" + latitude + ", tiporesidencia=" + tiporesidencia + '}';
    }

    public Endereco(int idendereco, Usuario usuario, String longitude, String latitude, String tiporesidencia) {
        this.idendereco = idendereco;
        this.usuario = usuario;
        this.longitude = longitude;
        this.latitude = latitude;
        this.tiporesidencia = tiporesidencia;
    }

    public int getIdendereco() {
        return this.idendereco;
    }

    public void setIdendereco(int idendereco) {
        this.idendereco = idendereco;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getTiporesidencia() {
        return this.tiporesidencia;
    }

    public void setTiporesidencia(String tiporesidencia) {
        this.tiporesidencia = tiporesidencia;
    }

}
