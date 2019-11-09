/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesEquipos;

/**
 *
 * @author user
 */
public class Arbol {
      private NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    public Arbol(Equipo equipo) {
        raiz = new NodoArbol(equipo);
    }

    public NodoArbol getRaiz() {
        return raiz;
    }
  
    
    public void unir(Equipo dato, NodoArbol iz, NodoArbol der) {
        if (iz == der) {
            System.out.println("NO se puede unir");
            return;
        }
        raiz = new NodoArbol(dato, iz, der);
    }

    public void recorridoAnchura() {
        
        
        Cola c1=new Cola();
        c1.encolar(raiz);
        Cola c2=new Cola();
        while(!c1.esVacia()){
            NodoArbol aux=c1.desencolar();
            if(aux.getIz()!=null){
                
                c1.encolar(aux.getIz());
            }
            if(aux.getDer()!=null){
                
                c1.encolar(aux.getDer());
            }
            c2.encolar(aux);
        }
        c2.imprimirR();        

    }
    

    private int goles(NodoArbol actual, String nombre1){   //envia el nodo actual que es la raiz y el nombre del equipo a contar
        
        if(actual==null){  //si el nodo no tiene hijos retorna 0
            
            return 0;
        }else{
            
            if(actual.getDatos().getNombre().compareTo(nombre1)==0){  //compara el nombre que busco con el dato del nodo que estoy actualmente
                
                return actual.getDatos().getGoles()+goles(actual.getIz(), nombre1)+goles(actual.getDer(), nombre1); //retorna los goles del nodoarbol actual y a la vez le suma e invoca recursivamente el metodo principal
            }
            return goles(actual.getIz(), nombre1)+goles(actual.getDer(), nombre1);// en caso de que el if sea falso ejecuta y llama al principal y envia el nodo izquierdo y el derecho a la vez le suma.
        }
        
    }
    
    public int goles(String nombre){ //este metodo sobrecarga el metodo
        
        return goles(raiz, nombre);//primera invocacion la metodo recursivo
    }
    
   
    
    public void buscarEncuentro (String e1, String e2, NodoArbol actual){
        if(actual.getDatos().getNombre().compareTo(e1)==0 || actual.getDatos().getNombre().compareTo(e1)==0){
            if(actual.getIz().getDatos().getNombre().compareTo(e1)==0 || actual.getIz().getDatos().getNombre().compareTo(e2)==0 && 
               actual.getDer().getDatos().getNombre().compareTo(e1)==0 || actual.getDer().getDatos().getNombre().compareTo(e2)==0){
                System.out.println("El equipo ganador es: " +actual.getDatos());
            }else{
                System.out.println("No se dio el encuentro");
            }
        }
        
    }
}
