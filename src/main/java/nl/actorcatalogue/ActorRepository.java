package nl.actorcatalogue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class ActorRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Actor> getAllActors() {
        Query query = entityManager.createQuery("SELECT a FROM Actor a");
        return (List<Actor>) query.getResultList();
    }

}
