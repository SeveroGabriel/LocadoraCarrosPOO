package ColecoesDados;

import Basicas.Agencia;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class AgenciaDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("locadoraCarros");
    private static final EntityManager em = emf.createEntityManager();

    public static Agencia buscarPorId(Long id) {
        return em.find(Agencia.class, id);
    }

    public static List<Agencia> buscarTodas() {
        TypedQuery<Agencia> query = em.createQuery("SELECT a FROM Agencia a", Agencia.class);
        return query.getResultList();
    }

    public static void salvar(Agencia agencia) {
        try {
            em.getTransaction().begin();
            em.persist(agencia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

    public static void atualizar(Agencia agencia) {
        try {
            em.getTransaction().begin();
            em.merge(agencia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

    public static void remover(Long id) {
        try {
            em.getTransaction().begin();
            Agencia agencia = em.find(Agencia.class, id);
            em.remove(agencia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw ex;
        }
    }

    public static void close() {
        em.close();
        emf.close();
    }
}
