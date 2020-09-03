
public class Pleno extends Pesquisador {
	
	public Pleno(String _nome, String _matricula, double _salarioBase) {
		super(_nome, _matricula, _salarioBase, "Pleno");
		this.salarioBruto = _salarioBase * 4.68;
		
	}
}
