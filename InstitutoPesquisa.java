import java.util.ArrayList;

public class InstitutoPesquisa {

	private ArrayList<Pesquisador> pesquisadores;
	private ArrayList<Projeto> projetos;
	private ArrayList<Alocacao> alocacoes;
	
	public InstitutoPesquisa() {
		//iniciaInstituto();
	}
	
	private void iniciaInstituto() {
		
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
