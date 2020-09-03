
public class Assistente extends Pesquisador {
	
	public Assistente(String _nome, String _matricula, double _salarioBase) {
		super(_nome, _matricula, _salarioBase, "Assistente");
		this.salarioBruto = _salarioBase * 2.25;
		
	}

}
