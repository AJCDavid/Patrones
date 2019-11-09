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
public class CajeroAutomatico extends CuentaBancaria{
    public CajeroAutomatico(String c, int i, int t){
		procesar(c,i,t);
	}

	@Override
	public void saludar(){
		System.out.println("Por favor ingrese los datos...");
	}
}
