import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cliente {
    private String nome;
    private Endereco endereco;

    public void atualizarDadosCliente(String nome, Endereco novoEndereco) {
        this.nome = nome;
        this.endereco = novoEndereco;
    }
}
