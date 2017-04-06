package org.arquillian.example.arquillian_tutorial;

import javax.ejb.EJB;
import javax.inject.Inject;

import org.arquillian.example.ejb.Ejemplo1;
import org.arquillian.example.ejb.EjemploDemo1;
import org.arquillian.example.ejb.IEjemplo1;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class EjemploDemo1Test {
		
	@EJB
	IEjemplo1 ejemplo1;
	
	@Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
        	.addClasses(IEjemplo1.class, Ejemplo1.class)
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
	
	@Test
	public void mensajeTest() {
		Assert.assertEquals("Hola Leo",
				ejemplo1.getMensaje("Leo"));
	        //greeter.greet(System.out, "Earthling");
		
	}

}
