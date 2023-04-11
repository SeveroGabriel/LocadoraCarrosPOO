package ColecoesDados;

import Basicas.Carro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CarroDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public CarroDAO() {
        emf = Persistence.createEntityManagerFactory("locadoraCarros");
        em = emf.createEntityManager();
    }

    public void salvar(Carro carro) {
        try {
            em.getTransaction().begin();
            em.persist(carro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public void atualizar(Carro carro) {
        try {
            em.getTransaction().begin();
            em.merge(carro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public void remover(Carro carro) {
        try {
            em.getTransaction().begin();
            em.remove(carro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public Carro buscarPorId(Long id) {
        return em.find(Carro.class, id);
    }

    public List<Carro> buscarTodos() {
        return em.createQuery("FROM Carro", Carro.class).getResultList();
    }

    public List<Carro> buscarPorModelo(String modelo) {
        return em.createQuery("FROM Carro WHERE modelo = :modelo", Carro.class)
                .setParameter("modelo", modelo)
                .getResultList();
    }

    public List<Carro> buscarPorCategoria(String categoria) {
        return em.createQuery("FROM Carro WHERE categoria = :categoria", Carro.class)
                .setParameter("categoria", categoria)
                .getResultList();
    }

    public void fecharConexao() {
        em.close();
        emf.close();
    }
}
