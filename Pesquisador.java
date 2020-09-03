
public class Pesquisador {
	
	private String nome;
	private String matricula;
	private double salarioBase;
	
	private  String categoria;
	protected double salarioBruto;
	
	public Pesquisador(String _nome, String _matricula, double _salarioBase, String _categoria) {
		setNome(_nome);
		setMatricula(_matricula);
		setSalarioBase(_salarioBase);
		setCategoria(_categoria);
	}
	
	public String getNome() {
		return this.nome;
		
	}
	public void setNome(String nome) {
		this.nome= nome;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public String getCategoria() {
		return this.categoria;
		
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public double getSalarioBruto() {
		return this.salarioBruto;
	}
}
