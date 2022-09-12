package Dao;
  
import java.util.ArrayList;

import java.util.List;

import classes.Candidato;

public class CandidatoDao {


	private static CandidatoDao instance;
	private List<Candidato> listaCandidato = new ArrayList<>();
	/*
	*
	*/
	public CandidatoDao getInstance() {
		if (instance == null) {
			instance = new CandidatoDao();
		}
		return instance;
	}	
	public void salvar(Candidato candidato) {
		listaCandidato.add(candidato);
	}
	
	public void atualizar(Candidato candidato) {
		listaCandidato setNome(listaCandidato.getNome(),candidato);
	}

	public void excluir(String ID) {
		listaCandidato.remove(IDCandidato);
	}

	public List<Candidato> listar(){
		return listaCandidato;
	}
}
	
	
	
	
	
}
