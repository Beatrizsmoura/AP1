import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		InstitutoPesquisa Nintendo = new InstitutoPesquisa();
		
		ArrayList<Alocacao> alocacoes = Nintendo.getAlocacoes();
		
		System.out.println(alocacoes);
		
		System.out.println("###### ALOCAÇÕES ######");
		System.out.format("%-11s%9s%22s", "PESQUISADOR", "PROJETO", "DATA ENTRADA");
		System.out.println();
		System.out.format("%-12s%17s%13s", "------------", "----------------", "------------");
		System.out.println();
		
		for(Alocacao alocacao: alocacoes) {
		    System.out.format("%-13s%-17s%-9s", 
		    		alocacao.getPesquisador().getNome(), 
		    		alocacao.getProjeto().getNome(),
		    		alocacao.getDataEntrada().getDia() + "/"
		    		+ alocacao.getDataEntrada().getMes() + "/"
		    		+ alocacao.getDataEntrada().getAno());
		    System.out.println();
		}

	}

}
