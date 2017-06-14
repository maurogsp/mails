package com.maven.tp2.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by mauro on 11/06/17.
 */
public class MensajeRequest {

    @JsonProperty("iduf")
    int iduf;
    @JsonProperty("idut")
    int idut;
    @JsonProperty("remitente")
    String remitente;
    @JsonProperty("recipiente")
    String recipiente;
    @JsonProperty("fecha")
    Date fecha;
    @JsonProperty("asunto")
    String asunto;
    @JsonProperty("cuerpo")
    String cuerpo;
    @JsonProperty("trash")
    boolean trash;

    public int getIduf() {
        return iduf;
    }

    public void setIduf(int iduf) {
        this.iduf = iduf;
    }

    public int getIdut() {
        return idut;
    }

    public void setIdut(int idut) {
        this.idut = idut;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getRecipiente() {
        return recipiente;
    }

    public void setRecipiente(String recipiente) {
        this.recipiente = recipiente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public boolean isTrash() {
        return trash;
    }

    public void setTrash(boolean trash) {
        this.trash = trash;
    }
}
