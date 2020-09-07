import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		InstitutoPesquisa Nintendo = new InstitutoPesquisa();
		
		ArrayList<Pesquisador> pesquisadores = Nintendo.getPesquisadores();
		ArrayList<Projeto> projetos = Nintendo.getProjetos();
		ArrayList<Alocacao> alocacoes = Nintendo.getAlocacoes();
		
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
		
		System.out.println(Nintendo.getProjetosDePesquisador(pesquisadores.get(0)));
		System.out.println(Nintendo.getPesquisadoresDeProjeto(projetos.get(0)));

	}

}
