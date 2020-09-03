
public class Pleno extends Pesquisador {
	
	public Pleno(String _nome, int _matricula, double _salarioBase) {
		super(_nome, _matricula, _salarioBase, "Pleno");
		calcularSalario(_salarioBase);
		
	}
	
	public void calcularSalario(double _salarioBase) {
		this.salarioBruto = _salarioBase * 4.68;
	}
}
