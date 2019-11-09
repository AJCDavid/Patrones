/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Factura implements IdElemento{
    
       int codigo;
     ArrayList<Articulo> articulos = new ArrayList<Articulo>();

     public Factura( int codigo )
    {
        this.setCodigo( codigo );
    }

    public int getCodigo()
    {
        return this.codigo;
    }
    
    public void setCodigo( int codigo )
    {
        this.codigo = codigo;
    }
     public void agregarArticulo( Articulo art)
    {
        this.articulos.add( art );
    }
    
     
    @Override
     public void accept( IdVisitor visitor )
    {
        // Procesar el visitor para la factura
         visitor.visit(this);
        // Procesar el visitor para cada artículo en la factura
        for( Articulo art : this.articulos )
        {
             art.accept(visitor);
        }
    }
}
