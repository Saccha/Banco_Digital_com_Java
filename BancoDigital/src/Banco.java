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
	
	/*No Eclipse, por padr�o, ALT + SHIFT + S, 
	 * abre a caixa de di�logo getter / setter. 
	 * Observe que voc� precisa pressionar todas as 4 teclas. 
	 * Voc� pode deixar de fora a parte SHIFT e fazer ALT + S, tamb�m.
	*/

