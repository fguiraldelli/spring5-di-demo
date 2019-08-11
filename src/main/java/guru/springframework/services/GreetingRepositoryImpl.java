package guru.springframework.services;

/**
 * Created by jt on 5/24/17.
 */

import org.springframework.stereotype.Component;

/**
 * This class seems ok, but there is a problem that don't have annotation in this class.
 * So you have to annotate @Component to Spring insert this to its context
 * Actually if you use @Component, @Service,  @Controller or @Repository you will make Spring bring in to its
 * context
 */

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}
