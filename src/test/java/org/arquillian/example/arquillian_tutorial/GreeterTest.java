//package org.arquillian.example.arquillian_tutorial;
//
//import javax.ejb.EJB;
//import javax.inject.Inject;
//
//import org.arquillian.example.ejb.IEjemplo1;
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.asset.EmptyAsset;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//
//@RunWith(Arquillian.class)
//public class GreeterTest {
//	
//	@EJB
//	IGreeter greeter;
//	
////	@EJB
////	IEjemplo1 ejemplo1;
//
//    @Deployment
//    public static JavaArchive createDeployment() {
//        return ShrinkWrap.create(JavaArchive.class)
//        	.addClasses(IGreeter.class, Greeter.class, PhraseBuilder.class)
//            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }
//
//    
//    @Test
//    public void should_create_greeting() {
//        Assert.assertEquals("Hello, Earthling!",
//            greeter.createGreeting("Earthling"));
//        greeter.greet(System.out, "Earthling");
//    }
//    
////    @Test
////    public void mensaje() {
////        Assert.assertEquals("Hola leo", 
////        		greeter.mensaje("leo"));
////        //greeter.greet(System.out, "Earthling");
////    }
//    
//    
//}
