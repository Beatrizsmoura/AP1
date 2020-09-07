
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int _dia, int _mes, int _ano) {
		setDia(_dia);
		setMes(_mes);
		setAno(_ano);
	}
	
	public int getDia() {
		return dia;
		
	}
	public void setDia(int dia) {
		this.dia=dia;
	}
	public int getMes() {
		return mes;
		
	}
	public void setMes(int mes) {
		this.mes=mes;
	}
	public int getAno() {
		return ano;
		
	}
	public void setAno(int ano) {
		this.ano=ano;
	}
}
