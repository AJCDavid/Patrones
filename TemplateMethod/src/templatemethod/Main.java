/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

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
        
        CajeroAutomatico ca = new CajeroAutomatico("F678AB", 30, 1);
		ca.procesar("F678AB",10,2);

		System.out.println();

		Cajero c = new Cajero("1234AB", 50, 1);
		c.procesar("1234AB",10,2);
    }
    
}
