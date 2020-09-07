import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		InstitutoPesquisa Nintendo = new InstitutoPesquisa();
		
		ArrayList<Pesquisador> pesquisadores = Nintendo.getPesquisadores();
		ArrayList<Projeto> projetos = Nintendo.getProjetos();
		ArrayList<Alocacao> alocacoes = Nintendo.getAlocacoes();
		
		// TABELA PESQUISADORES
		System.out.println("###### PESQUISADORES ######");
		System.out.format("%-8s%-13s%-12s%-12s%-10s", "MATRIC.", "NOME", "SAL. BASE", "SAL. BRUTO", "CATEGORIA");
		System.out.println();
		System.out.format("%-8s%-13s%-12s%-12s%-10s", "-------", "------------", "-----------", "-----------", "---------");
		System.out.println();
		
		for(Pesquisador pesquisador: pesquisadores) {
		    System.out.format("%-8s%-13s%-12s%-12s%-10s",
		    		pesquisador.getMatricula(),
		    		pesquisador.getNome(),
		    		pesquisador.getSalarioBase(),
		    		pesquisador.getSalarioBruto(),
		    		pesquisador.getCategoria()
		    		);
		    System.out.println();
		}
		System.out.println();
		
		//TABELA ALOCAÇÕES
		System.out.println("###### ALOCAÇÕES ######");
		System.out.format("%-13s%-17s%-12s", "PESQUISADOR", "PROJETO", "DATA ENTRADA");
		System.out.println();
		System.out.format("%-13s%-17s%-12s", "------------", "----------------", "------------");
		System.out.println();
		
		for(Alocacao alocacao: alocacoes) {
		    System.out.format("%-13s%-17s%-12s", 
		    		alocacao.getPesquisador().getNome(), 
		    		alocacao.getProjeto().getNome(),
		    		alocacao.getDataEntrada().getDia() + "/"
		    		+ alocacao.getDataEntrada().getMes() + "/"
		    		+ alocacao.getDataEntrada().getAno());
		    System.out.println();
		}
		System.out.println();
		
		//TESTE DA QUESTAO 4
		Pesquisador pesquisador1 = pesquisadores.get(0);
		ArrayList<Projeto> projetosDePesquisador = Nintendo.getProjetosDePesquisador(pesquisador1);
		
		System.out.println("Projetos do pesquisador: " + pesquisador1.getNome());
		for (Projeto projeto: projetosDePesquisador) {
			System.out.println("-"+projeto.getNome());
		}
		System.out.println();
		
		//TESTE DA QUESTAO 4
		Projeto projeto1 = projetos.get(0);
		ArrayList<Pesquisador> pesquisadoresDeProjeto = Nintendo.getPesquisadoresDeProjeto(projeto1);
		
		System.out.println("Pesquisadores do projeto: " + projeto1.getNome());
		for (Pesquisador pesquisador: pesquisadoresDeProjeto) {
			System.out.println("-"+pesquisador.getNome());
		}

	}

}
