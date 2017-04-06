package org.arquillian.example.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class EjemploDemo1 {
	
	@EJB
	private IEjemplo1 ejemplo1;
	
	@PostConstruct
	public void init() {
		
	}
	
	public String mensaje(String msg) {
		return ejemplo1.getMensaje(msg);
	}

}
