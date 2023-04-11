package ColecoesDados;

import Basicas.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ClienteDAO {33
    private static EntityManagerFactory emf;
    private static ClienteDAO instance;

    private ClienteDAO() {
        emf = Persistence.createEntityManagerFactory("locadoraCarros");
    }

    public static ClienteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteDAO();
        }
        return instance;
    }

    public void cadastrarCliente(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public List<Cliente> listarClientes() {
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT c FROM Cliente c");
        List<Cliente> clientes = q.getResultList();
        em.close();
        return clientes;
    }

    public Cliente buscarClientePorId(int id) {
        EntityManager em = emf.createEntityManager();
        Cliente cliente = em.find(Cliente.class, id);
        em.close();
        return cliente;
    }

    public void atualizarCliente(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public void removerCliente(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Cliente cliente = em.find(Cliente.class, id);
        em.remove(cliente);
        em.getTransaction().commit();
        em.close();
    }
}
