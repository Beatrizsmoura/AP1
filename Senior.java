
public class Senior extends Pesquisador {

	public Senior(String _nome, String _matricula, double _salarioBase) {
		super(_nome, _matricula, _salarioBase, "Senior");
		this.salarioBruto = _salarioBase * 6.11;
		
	}
}
