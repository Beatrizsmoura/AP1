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
		this.pesquisadores = new ArrayList<>();
		this.alocacoes = new ArrayList<Alocacao>();
		
		Projeto p1 = new Projeto("Robo domestico", 100000.0, 48, new Data(1, 1, 2007));
		Projeto p2 = new Projeto("Motor à vento", 200000.0, 15, new Data(2, 2, 2007));
		Projeto p3 = new Projeto("Playstation Wii", 300000.0, 24, new Data(3, 3, 2007));
		Projeto p4 = new Projeto("Teletransporte", 400000.0, 36, new Data(4, 4, 2007));
		
		projetos.add(p1);
		projetos.add(p2);
		projetos.add(p3);
		projetos.add(p4);
		
		// Precisa instaciar as classes correspodentes - num sei como faz		
		Senior s = new Senior(11, "Cascão", 1000.0);
		pesquisadores.add(s);
		
		alocacoes.add(new Alocacao(s, p1, new Data(4, 8, 2020)));
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
