package nl.actorcatalogue;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorCatalogueController {

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello, world!";
    }

    @RequestMapping("/actor")
    public Actor getAllActors() {
        Actor actor = new Actor();
        actor.setName("Harrison Ford");
        actor.setDescription("Han Solo forever");
        return actor;
    }

}
