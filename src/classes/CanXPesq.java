package classes;

import javax.xml.crypto.Data;

import controller.CanXPesqController;

public class CanXPesq {
	
	private Data data;
	private Pesquisa pesquisa;
	private Candidato candidato;
	private float votos;
	public Object get;
	public Object String;
	
	
	
	public CanXPesq(Pesquisa pesquisa, Data data, Candidato candidato, float votos) {
		this.data = data;
		this.pesquisa = pesquisa;
		this.candidato = candidato;
		this.votos = votos;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Pesquisa getPesquisa() {
		return pesquisa;
	}
	public void setPesquisa(Pesquisa pesquisa) {
		this.pesquisa = pesquisa;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public float getVotos() {
		return votos;
	}
	public void setVotos(float votos) {
		this.votos = votos;
	}
	public static Object getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	public static CanXPesqController getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
}