
public class Pesquisador {
	
	private String nome;
	private int matricula;
	private double salarioBase;
	private  String categoria;
	
	public Pesquisador(String nome, int matricula, double salarioBase, String categoria) {
		this.nome=nome;
		this.matricula=matricula;
		this.salarioBase=salarioBase;
		this.categoria= categoria;
	}
	
	public String getNome() {
		return nome;
		
	}
	public void setNome(String nome) {
		this.nome= nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula=matricula;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase=salarioBase;
	}
	public String getCategoria() {
		return categoria;
		
	}
	public void getCategoria(String categoria) {
		this.categoria=categoria;
	}
}
