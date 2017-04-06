package org.arquillian.example.arquillian_tutorial;

import java.io.PrintStream;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.arquillian.example.ejb.IEjemplo1;

@Stateless
public class Greeter implements IGreeter {

	@EJB
    private PhraseBuilder phraseBuilder;
    
//    @EJB
//    private IEjemplo1 ejemplo1;

//    @Inject
//    public Greeter(PhraseBuilder phraseBuilder) {
//        this.phraseBuilder = phraseBuilder;
//    }

    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return phraseBuilder.buildPhrase("hello", name);
    }
    
//    /**
//     * 
//     * @param msg
//     * @return
//     */
//    public String mensaje(String msg) {
//    	return ejemplo1.getMensaje(msg);
//    }
}
