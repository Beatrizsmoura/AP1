

public class Alocacao {

	private Pesquisador pesquisador;
	private Projeto projeto;
	private Data dataEntrada;
	
	public Alocacao(Pesquisador _pesquisador, Projeto _projeto, Data _dataEntrada) {
		setPesquisador(_pesquisador);
		setProjeto(_projeto);
		setDataEntrada(_dataEntrada);
	}

	public Pesquisador getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
}
