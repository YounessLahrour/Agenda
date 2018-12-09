/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.agenda;

/**
 *
 * @author Youness
 */
public class Contacto 
{
static final String ER_TELEFONO="[69]([0-9]{8})";
static final String ER_CORREO="([0-9a-zA-Z._-]+@)([a-z]+[.])([a-z])+";
private String nombre;
private String telefono;
private String correo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        if(nombre==null || nombre.length()<0)
            throw new IllegalArgumentException("ERROR: no puedes cambiar el nombre y tampoco puede estar vacio");
            this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        if(telefono.matches(ER_TELEFONO))
        this.telefono = telefono;
        else throw new IllegalArgumentException("ERROR: numero no cumple los requisitos");
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) 
    {
        if(correo.matches(ER_CORREO))
        this.correo = correo;
        else throw new IllegalArgumentException("ERROR: correo no cumple los requisitos");
    }

    public Contacto (String nombre, String telefono, String correo)
    {
    setNombre(nombre);
    setTelefono(telefono);
    setCorreo (correo);
    }
}
