import java.util.List;
import java.util.ArrayList;
import lombok.data;

public @Data class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}

}
