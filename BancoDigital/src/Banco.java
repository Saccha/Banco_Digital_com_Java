import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
	
	/*No Eclipse, por padrão, ALT + SHIFT + S, 
	 * abre a caixa de diálogo getter / setter. 
	 * Observe que você precisa pressionar todas as 4 teclas. 
	 * Você pode deixar de fora a parte SHIFT e fazer ALT + S, também.
	*/

