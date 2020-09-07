
public class Senior extends Pesquisador {

	public Senior(int _matricula, String _nome, double _salarioBase) {
		super(_matricula, _nome,_salarioBase, "Senior");
		calcularSalario(_salarioBase);
		
	}
	
	public void calcularSalario(double _salarioBase) {
		this.salarioBruto = _salarioBase * 6.11;
	}
}
