
public class Assistente extends Pesquisador {
	
	public Assistente(int _matricula, String _nome, double _salarioBase) {
		super( _matricula, _nome, _salarioBase, "Assistente");
		calcularSalario(_salarioBase);
		
	}
	
	public void calcularSalario(double _salarioBase) {
		this.salarioBruto = _salarioBase * 2.25;
	}

}
