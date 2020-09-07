
public class Projeto {

	private String nome;
	private int duracao;
	private Data dataInicio;
	private double custo;
	
	public Projeto(String _nome, double _custo, int _duracao, Data _dataInicio) {
		setNome(_nome);
		setCusto(_custo);
		setDuracao(_duracao);
		setDataInicio(_dataInicio);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Data getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Data dataInicio) {
		this.dataInicio = dataInicio;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
}
