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
public class Articulo implements IdElemento {
     private String nombre = "";
    private int unidades;

    public Articulo( String nombre, int unidades )
    {
        this.setNombre( nombre );
        this.setUnidades( unidades );
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getUnidades()
    {
        return this.unidades;
    }

    public void setUnidades(int unidades)
    {
        this.unidades = unidades;
    }

@Override
    public void accept( IdVisitor visitor )
    {
         visitor.visit(this);
    }
}
