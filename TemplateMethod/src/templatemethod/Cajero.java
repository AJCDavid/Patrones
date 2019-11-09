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
public class Cajero extends CuentaBancaria{
    
    public Cajero(String c, int i, int t){
		procesar(c,i,t);
	}

	@Override
	public void auditoria(){
		super.auditoria();
		System.out.println("Con mucho gusto, vuelva pronto.");
	}

	@Override
	public void saludar(){
		System.out.println("Bienvenido a su banco, en que le puedo ayudar?");
	}
}
