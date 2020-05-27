/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;


import ec.edu.ups.ventana.Ventana;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
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
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        Panel panelPrincipal = new Panel();
        BorderLayout ubicacion = new BorderLayout();
        FlowLayout orden = new FlowLayout();
        GridLayout Matriz = new GridLayout(7, 2);
        ventana1.setLocation(new Point(150, 100));
        Button boton1 = new Button("Añadir Teléfono");
        Button boton2 = new Button("Editar Teléfono");
        Button boton3 = new Button("Eliminar Teléfono");
        Button boton4 = new Button("Buscar Teléfono");
        Button boton5 = new Button("Listar Teléfono");
        Button boton6 = new Button("Mostrar Datos");
        Button boton7 = new Button("Editar Datos");
        Button boton8 = new Button("Eliminar Datos");
        Button boton9 = new Button("Regresar");
        Label  mensaje = new Label("Hola:'nombre del Usuario'");
        panelPrincipal.setLayout(ubicacion);
        panel1.setLayout(orden);
        panel2.setLayout(orden);
        panel2.setLayout(Matriz);
        ventana1.add(panelPrincipal);
        panelPrincipal.add(panel1,BorderLayout.NORTH);   
        panel1.add(mensaje);      
        panelPrincipal.add(panel2,BorderLayout.LINE_START);
        panel2.add(boton1);
        panel2.add(boton5);
        panel2.add(boton2);
        panel2.add(boton3);
        panel2.add(boton4);
        panel2.add(boton6);
        panel2.add(boton7);
        panel2.add(boton8);
        panelPrincipal.add(panel3,BorderLayout.SOUTH);
        panel3.add(boton9);
    }
}
