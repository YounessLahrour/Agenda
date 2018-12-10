/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.agenda.modelo;

import org.iesalandalus.programacion.agenda.Contacto;

/**
 *
 * @author Youness
 */
public class Agenda {

    private static final int MAX_CONTACTOS = 100;
    private int numContactos;

    public Agenda() {

        this.numContactos = numContactos;
    }

    public Contacto[] getContactos() {

        Contacto arrayContactos[] = new Contacto[getNumContactos()];
        Contacto[] contactos = new Contacto[getNumContactos()];

        System.arraycopy(arrayContactos, 0, contactos, 0, getNumContactos());
        return contactos;

    }

    public int getNumContactos() {
        return numContactos;
    }

}
