package org.arquillian.example.ejb;

import javax.ejb.Local;

@Local
public interface IEjemplo1 {
	
	String getMensaje(String valor);

}
