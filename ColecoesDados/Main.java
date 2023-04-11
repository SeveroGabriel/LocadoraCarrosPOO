import Basicas.Cliente;
import ColecoesDados.ClienteDAO;

public class Main {
    public static void main(String[] args) {
        ClienteDAO dao = ClienteDAO.getInstance();

        Cliente cliente1 = new Cliente(01, "João", "12345678900", "Rua A, 123");
        Cliente cliente2 = new Cliente(02, "Maria", "98765432100", "Rua B, 456");

        dao.cadastrarCliente(cliente1);
        dao.cadastrarCliente(cliente2);

        System.out.println("Lista de clientes:");
        for (Cliente cliente : dao.listarClientes()) {
            System.out.println(cliente);
        }

        Cliente cliente3 = dao.buscarClientePorId(1);
        if (cliente3 != null) {
            cliente3.setEndereco("Rua C, 789");
            dao.atualizarCliente(cliente3);
            System.out.println("Cliente atualizado: " + cliente3);
        }

        dao.removerCliente(2);
        System.out.println("Lista de clientes atualizada:");
        for (Cliente cliente : dao.listarClientes()) {
            System.out.println(cliente);
        }
    }
}
