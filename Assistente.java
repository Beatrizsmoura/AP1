
public class Assistente extends Pesquisador {
	
	public Assistente(String _nome, int _matricula, double _salarioBase) {
		super( _matricula, _nome, _salarioBase, "Assistente");
		calcularSalario(_salarioBase);
		
	}
	
	public void calcularSalario(double _salarioBase) {
		this.salarioBruto = _salarioBase * 2.25;
	}

}
