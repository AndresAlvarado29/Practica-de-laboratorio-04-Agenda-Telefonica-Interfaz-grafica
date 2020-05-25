/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventana;

import java.awt.Frame;


/**
 *
 * @author HI andres
 */
public class Ventana extends Frame {

    public Ventana(String titulo) {
        this.setTitle(titulo);
        this.setVisible(true);
    }

    public Ventana(String titulo, int ancho, int alto) {
        this(titulo);
        this.setSize(ancho, alto);
    }

    public Ventana() {
        this("Agenda Telefónica", 600, 400);
    }

}
