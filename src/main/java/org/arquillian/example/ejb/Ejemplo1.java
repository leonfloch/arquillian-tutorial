package org.arquillian.example.ejb;


import javax.ejb.Stateless;

/**
 * Session Bean implementation class Ejemplo1
 */
@Stateless
public class Ejemplo1 implements IEjemplo1 {

    

	@Override
	public String getMensaje(String valor) {
		return "Hola " + valor;
	}

}
