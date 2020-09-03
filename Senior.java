
public class Senior extends Pesquisador {

	public Senior(String _nome, int _matricula, double _salarioBase) {
		super(_nome, _matricula, _salarioBase, "Senior");
		calcularSalario(_salarioBase);
		
	}
	
	public void calcularSalario(double _salarioBase) {
		this.salarioBruto = _salarioBase * 6.11;
	}
}
