package classes;

import java.util.Date;

public class Pesquisa  {

	public int id;
	private String intituto; 
	private Date data;
	private String local;
	public float mediaIdade;
	public String formato;
	
	public Pesquisa(String intituto, String local, Date data) {
		this.intituto = intituto;
		this.data = data;
		this.local = local;
	
	
	
	
	}

	public String getIntituto() {
		return intituto;
	}

	public void setIntituto(String intituto) {
		this.intituto = intituto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	
}	
