  
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
		
		// questao01 
		
		// instanciaçao projetos
		Projeto p1 = new Projeto("Robo domestico", 100000.0, 48, new Data(1, 1, 2007));
		Projeto p2 = new Projeto("Motor à vento", 200000.0, 15, new Data(2, 2, 2007));
		Projeto p3 = new Projeto("Playstation Wii", 300000.0, 24, new Data(3, 3, 2007));
		Projeto p4 = new Projeto("Teletransporte", 400000.0, 36, new Data(4, 4, 2007));
		
		projetos.add(p1);
		projetos.add(p2);
		projetos.add(p3);
		projetos.add(p4);
		
		//instanciaçao pesquisador 
		Senior pesquisador1 = new Senior(11, "Cascão", 1000.0);
		Assistente pesquisador2 = new Assistente(22, "Cebolinha", 1000.0);
		Assistente pesquisador3 = new Assistente(33, "Mônica", 1200.0);
		Pleno pesquisador4 = new Pleno(44, "Magali", 1200.0);
		Senior pesquisador5 = new Senior(55 ,"Chico Bento", 1400.0);
		
		pesquisadores.add(pesquisador1);
		pesquisadores.add(pesquisador2);
		pesquisadores.add(pesquisador3);
		pesquisadores.add(pesquisador4);
		pesquisadores.add(pesquisador5);
		
		// instanciaçao alocacoes
		
		alocacoes.add(new Alocacao(pesquisador1, p1, new Data(4, 8, 2020)));
		alocacoes.add(new Alocacao(pesquisador1, p3, new Data(5, 8, 2020)));
		alocacoes.add(new Alocacao(pesquisador1, p4, new Data(6, 8, 2020)));
		alocacoes.add(new Alocacao(pesquisador2, p1, new Data(7, 8, 2020)));
		alocacoes.add(new Alocacao(pesquisador2, p3, new Data(8, 8, 2020)));
		alocacoes.add(new Alocacao(pesquisador3, p1, new Data(9, 8, 2020)));
		alocacoes.add(new Alocacao(pesquisador3, p2, new Data(10, 8, 2020)));
		alocacoes.add(new Alocacao(pesquisador3, p3, new Data(11, 8, 2020)));
		alocacoes.add(new Alocacao(pesquisador4, p4, new Data(12, 8, 2020)));
		alocacoes.add(new Alocacao(pesquisador5, p3, new Data(13, 8, 2020)));
		alocacoes.add(new Alocacao(pesquisador5, p4, new Data(14, 8, 2020)));
		
		
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
	
	// metodo getprojetosdePesquisa()
	public ArrayList<Projeto> getProjetosDePesquisador(Pesquisador pesquisador) {
		ArrayList<Projeto> _projetos = new ArrayList<Projeto>();
		for (Alocacao alocacao: alocacoes) {
			if (alocacao.getPesquisador() == pesquisador) {
				_projetos.add(alocacao.getProjeto());
			}
		}
		
		return _projetos;
	}
	
	// metodo getPesquisadoresdeProjeto()
	public ArrayList<Pesquisador> getPesquisadoresDeProjeto(Projeto projeto) {
		ArrayList<Pesquisador> _pesquisadores= new ArrayList<Pesquisador>();
		for (Alocacao alocacao: alocacoes) {
			if (alocacao.getProjeto() == projeto) {
				_pesquisadores.add(alocacao.getPesquisador());
			}
		}
		
		return _pesquisadores;
	}
	
}