/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Creamos el objeto estructura
         GrupoFacturas grupo = new GrupoFacturas();
        // Creamos una factura y  pasamos los elementos
        Factura fact1 = new Factura( 1 );
        
        fact1.agregarArticulo( new Articulo("Monitores", 40) );
        fact1.agregarArticulo( new Articulo("Mouse", 80) );
        fact1.agregarArticulo( new Articulo("Teclados", 65) );
        // Creamos otra factura y  pasamos los elementos
         Factura fact2 = new Factura( 2 );
         
        fact2.agregarArticulo( new Articulo("Tarjeta Grafica", 30) );
        fact2.agregarArticulo( new Articulo("Flash Memory", 90) );
        // Agregamos las facturas al objeto estructura
        grupo.agregarFactura( fact1 );
        grupo.agregarFactura( fact2 );
        // Pasamos el visitor al objeto de estructura para que recorra
        // todas las facturas y los artículos que contiene
         grupo.accept( new Mostrar() );
    }
    
}
