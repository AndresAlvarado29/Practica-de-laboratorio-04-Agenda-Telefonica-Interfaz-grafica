/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;


import ec.edu.ups.ventana.Ventana;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Point;

/**
 *
 * @author HI andres
 */
public class Principal {

    public static void main(String[] args) {
        Ventana ventana1 = new Ventana();
        Panel panel1 = new Panel();
        ventana1.setLocation(new Point(150, 100));
        Button boton1 = new Button("Registar Teléfono");
        Button boton2 = new Button("Modificar Teléfono");
        Button boton3 = new Button("Eliminar Teléfono");
        Button boton4 = new Button("Buscar Teléfono");
        Button boton5 = new Button("Listar Teléfono");
        ventana1.add(panel1);
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);
        panel1.add(boton4);
        panel1.add(boton5);
    }
}
