import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void listarClientes() {
        System.out.println("=== Listagem de Clientes ===");
        contas.forEach(conta -> {
            System.out.println(conta.getCliente().getNome());
        });
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
}
