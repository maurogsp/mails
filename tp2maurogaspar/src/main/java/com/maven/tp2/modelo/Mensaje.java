package com.maven.tp2.modelo;

import java.util.Date;

/**
 * Created by mauro on 11/06/17.
 */
public class Mensaje {
        private int id;
        private int user_id_from;
        private int user_id_to;
        private String remitente;
        private String recipiente;
        private Date fecha;
        private String asunto;
        private String cuerpo;// adentro puedo poner html
        private boolean trash;

        public Mensaje(int id, int user_id_from, int user_id_to, String remitente, String recipiente, Date fecha, String asunto, String cuerpo, boolean trash) {
            this.setId(id);
            this.setUser_id_from(user_id_from);
            this.setUser_id_to(user_id_to);
            this.setRemitente(remitente);
            this.setRecipiente(recipiente);
            this.setFecha(fecha);
            this.setAsunto(asunto);
            this.setCuerpo(cuerpo);
            this.setTrash(trash);
        }

    @Override
    public String toString() {
        return "Mensaje{" +
                "id=" + getId() +
                ", user_id_from=" + getUser_id_from() +
                ", user_id_to=" + getUser_id_to() +
                ", remitente='" + getRemitente() + '\'' +
                ", recipiente='" + getRecipiente() + '\'' +
                ", fecha=" + getFecha() +
                ", asunto='" + getAsunto() + '\'' +
                ", cuerpo='" + getCuerpo() + '\'' +
                ", trash=" + isTrash() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id_from() {
        return user_id_from;
    }

    public void setUser_id_from(int user_id_from) {
        this.user_id_from = user_id_from;
    }

    public int getUser_id_to() {
        return user_id_to;
    }

    public void setUser_id_to(int user_id_to) {
        this.user_id_to = user_id_to;
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
