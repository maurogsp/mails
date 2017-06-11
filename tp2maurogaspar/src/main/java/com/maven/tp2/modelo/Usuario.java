package com.maven.tp2.modelo;

/**
 * Created by mauro on 11/06/17.
 */
public class Usuario {

    private int id;
    private String nombre_usuario;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String ciudad;
    private String provincia;
    private String pais;
    private String mail;
    private boolean borrado;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    public Usuario(int id, String nombre_usuario, String contrasenia, String nombre, String apellido, String direccion, String telefono, String ciudad, String provincia, String pais, String mail, boolean borrado) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.mail = mail;
        this.borrado = borrado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre_usuario='" + nombre_usuario + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", pais='" + pais + '\'' +
                ", mail='" + mail + '\'' +
                ", borrado=" + borrado +
                '}';
    }
}
