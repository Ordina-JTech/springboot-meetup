package nl.actorcatalogue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorCatalogueController {

    @Value("${app.greeting}")
    private String greeting;

    @RequestMapping("/greeting")
    public String greeting() {
        return greeting;
    }

    @RequestMapping("/actor")
    public Actor getAllActors() {
        Actor actor = new Actor();
        actor.setName("Harrison Ford");
        actor.setDescription("Han Solo forever");
        return actor;
    }

}
