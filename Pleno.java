
public class Pleno extends Pesquisador {
	
	public Pleno(int _matricula, String _nome, double _salarioBase) {
		super(_matricula, _nome,_salarioBase, "Pleno");
		calcularSalario(_salarioBase);
		
	}
	
	public void calcularSalario(double _salarioBase) {
		this.salarioBruto = _salarioBase * 4.68;
	}
}
