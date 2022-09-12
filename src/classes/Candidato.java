package classes;

import controller.CanddidatoController;

public class Candidato {

	private String ID;
	private String nome;
	private String partido;
	private boolean fLimpa;
	
	
	public Candidato(String iD,String nome, String partido, boolean fLimpa) {
		this.ID = iD;
		this.nome = nome;
		this.partido = partido;
		this.fLimpa = fLimpa;
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		this.ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public boolean isfLimpa() {
		return fLimpa;
    }		
	public void setfLimpa(boolean fLimpa) {
		this.fLimpa = fLimpa;
	}

	public static CanddidatoController getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
