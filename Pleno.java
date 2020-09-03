
public class Pleno extends Pesquisador {
	public Assistente(int nomePesquisador, int matriculaPesquisador, double salarioBasePesquisador) {
		super(nomePesquisador, matriculaPesquisador, salarioBasePesquisador);
	}
	public void calculaSalario() {
		salarioBruto= salarioBase*4.68;
	}

}
