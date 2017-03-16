package nl.actorcatalogue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorCatalogueController {

    private AppConfig appConfig;

    @Autowired
    public ActorCatalogueController(final AppConfig appConfig, final ActorRepository actorRepository) {
        this.appConfig = appConfig;
        this.actorRepository = actorRepository;
    }

    private ActorRepository actorRepository;

    @RequestMapping("/greeting")
    public String greeting() {
        return appConfig.getGreeting();
    }

    @RequestMapping("/actor")
    public List<Actor> getAllActors() {
        return actorRepository.getAllActors();
    }

}
