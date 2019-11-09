/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesEquipos;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Principal {

    public static Equipo ganador(Equipo eqA,Equipo eqB){
         
        while(eqA.getGoles()==eqB.getGoles()){
              eqA.generarGoles();
              eqB.generarGoles();
        }
        if(eqA.getGoles()>eqB.getGoles())
            return new Equipo(eqA.getNombre());
        else
            return new Equipo(eqB.getNombre());
    
    }
    
    public static String leerString(String mensaje){
        
        Scanner ingreso=new Scanner(System.in);
        String dato;
        
        System.out.println(mensaje+" : ");
        dato=ingreso.nextLine();
            
        return dato;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arbol eq1=new Arbol(new Equipo("Ecuador"));
        Arbol eq2=new Arbol(new Equipo("Chile"));
        
        Arbol eq3=new Arbol(new Equipo("Colombia"));
        Arbol eq4=new Arbol(new Equipo("Venezuela"));
        
        Arbol eq5=new Arbol(new Equipo("Peru"));
        Arbol eq6=new Arbol(new Equipo("Bolivia"));
        
        Arbol eq7=new Arbol(new Equipo("Uruguay"));
        Arbol eq8=new Arbol(new Equipo("Paraguay"));
        
        
        Arbol ganador1 = new Arbol();
        ganador1.unir(ganador(eq1.getRaiz().getDatos(), eq2.getRaiz().getDatos()), eq1.getRaiz(), eq2.getRaiz());
        
        Arbol ganador2 = new Arbol();
        ganador2.unir(ganador(eq3.getRaiz().getDatos(), eq4.getRaiz().getDatos()), eq3.getRaiz(), eq4.getRaiz());
        
        Arbol ganador3 = new Arbol();
        ganador3.unir(ganador(eq5.getRaiz().getDatos(), eq6.getRaiz().getDatos()), eq5.getRaiz(), eq6.getRaiz());
        
        Arbol ganador4 = new Arbol();
        ganador4.unir(ganador(eq7.getRaiz().getDatos(), eq8.getRaiz().getDatos()), eq7.getRaiz(), eq8.getRaiz());
        
        Arbol finalista1 = new Arbol();
        ganador1.getRaiz().getDatos().generarGoles();
        ganador2.getRaiz().getDatos().generarGoles();
        finalista1.unir(ganador(ganador1.getRaiz().getDatos(), ganador2.getRaiz().getDatos()), ganador1.getRaiz(), ganador2.getRaiz());
        
        Arbol finalista2 = new Arbol();
        ganador3.getRaiz().getDatos().generarGoles();
        ganador4.getRaiz().getDatos().generarGoles();
        finalista2.unir(ganador(ganador3.getRaiz().getDatos(), ganador4.getRaiz().getDatos()), ganador3.getRaiz(), ganador4.getRaiz());
        
        Arbol campeon = new Arbol();
        finalista1.getRaiz().getDatos().generarGoles();
        finalista2.getRaiz().getDatos().generarGoles();
        campeon.unir(ganador(finalista1.getRaiz().getDatos(), finalista2.getRaiz().getDatos()), finalista1.getRaiz(), finalista2.getRaiz());
        
        System.out.println("Torneo completo: ");
        campeon.recorridoAnchura();
        System.out.println("goles: "+campeon.goles(leerString("Ingrese un pais")));

        
        
    }
}
