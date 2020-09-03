
public class Assistente extends Pesquisador {
	public Assistente(int nomePesquisador, int matriculaPesquisador, double salarioBasePesquisador) {
		super(nomePesquisador, matriculaPesquisador, salarioBasePesquisador);
	}
	public void calculaSalario() {
		salarioBruto= salarioBase*2.25;
	}

}
