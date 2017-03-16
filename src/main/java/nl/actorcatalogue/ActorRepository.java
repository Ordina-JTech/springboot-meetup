package nl.actorcatalogue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ActorRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Actor> getAllActors() {
        Query query = entityManager.createQuery("SELECT a FROM Actor a");
        return (List<Actor>) query.getResultList();
    }

    @Transactional
    public void storeReceipe(final Actor actor) {
        entityManager.persist(actor);
    }
}
