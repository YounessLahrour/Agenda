/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.agenda;

import java.util.Objects;

/**
 *
 * @author Youness
 */
public class Contacto {

    static final String ER_TELEFONO = "[69]([0-9]{8})";
    static final String ER_CORREO = "([0-9a-zA-Z._-]+@)([a-z]+[.])([a-z])+";
    private String nombre;
    private String telefono;
    private String correo;

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        if (nombre == null || nombre.length() <= 0) {
            throw new IllegalArgumentException("El nombre de un contacto no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
       if ( telefono != null || telefono.length()>0 && telefono.matches(ER_TELEFONO)) {
            this.telefono = telefono;
            
        } else {
            throw new IllegalArgumentException("El teléfono de un contacto no puede ser nulo o vacío.");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo.matches(ER_CORREO) && correo != null || correo.length()>0) {
            this.correo = correo;
        } else {
            throw new IllegalArgumentException("El correo de un contacto no puede ser nulo o vacío.");
        }
    }

    public Contacto(String nombre, String telefono, String correo) {
        setNombre(nombre);
        setTelefono(telefono);
        setCorreo(correo);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.telefono);
        hash = 41 * hash + Objects.hashCode(this.correo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.nombre.toLowerCase(), other.nombre.toLowerCase())) {
            return false;
        }
 
        return true;
    }

    private String getIniciales(String nombre) {
        String iniciales = "";
        String iniciales1 = nombre.substring(0);
        String iniciales2 = "";
        for (int i = 0; i <= nombre.length(); i++) {
            if (nombre.substring(i) ==" ") {
                i++;
                iniciales2 +=nombre.substring(i);
                
            }
             iniciales = iniciales1 + iniciales2;
        }
        return iniciales;
    }

    @Override
    public String toString() {

        return  getIniciales(nombre) + "[" + telefono + ", " + correo + "]";
    }

}
