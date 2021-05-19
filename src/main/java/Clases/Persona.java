package Clases;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idpersona;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    public Persona() {
    }

    public Persona(int idpersona, String nombre, String apellido, String correo, String telefono) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idpersona=" + idpersona + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono=" + telefono + '}';
    }

}
