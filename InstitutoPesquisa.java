import java.util.ArrayList;

public class InstitutoPesquisa {

	private ArrayList<Pesquisador> pesquisadores;
	private ArrayList<Projeto> projetos;
	private ArrayList<Alocacao> alocacoes;
	
	public InstitutoPesquisa() {
		iniciaInstituto();
	}
	
	private void iniciaInstituto() {
		this.projetos = new ArrayList<Projeto>();
		this.pesquisadores = new ArrayList<Pesquisador>();
		this.alocacoes = new ArrayList<Alocacao>();
		
		projetos.add(new Projeto("Robo domestico", 100000.0, 48, new Data(1, 1, 2007)));
		projetos.add(new Projeto("Motor à vento", 200000.0, 15, new Data(2, 2, 2007)));
		projetos.add(new Projeto("Playstation Wii", 300000.0, 24, new Data(3, 3, 2007)));
		projetos.add(new Projeto("Teletransporte", 400000.0, 36, new Data(4, 4, 2007)));
		
		pesquisadores.add(new Pesquisador(11, "Cascão", 1000.0, "Senior"));
	}
	
	public ArrayList<Pesquisador> getPesquisadores(){
		return this.pesquisadores;
	}
	
	public ArrayList<Projeto> getProjetos(){
		return this.projetos;
	}
	
	public ArrayList<Alocacao> getAlocacoes(){
		return this.alocacoes;
	}
}
