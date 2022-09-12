package controller;
 
import java.util.List;

import classes.Candidato;

public class CanddidatoController {

		private Object candidatoDao;
		public void salvar(Candidato Candidato) throws Exception {
			if (Candidato.getNome() == null || Candidato.getNome().length() < 3) {
				throw new Exception();
			}
		}
		
		public void atualizar(Candidato candidato) throws Exception {
			if (candidato.getNome() == null || candidato.getNome().length() < 3) {
				throw new Exception();
			} 
			Candidato.getInstance().atualizar(candidato);
		}

		public void excluir(String ID, int IDCandidato) throws Exception {
			if (IDCandidato == 0) {
				throw new Exception();
			}
		}
		public List<Candidato> listar(){
			return  Candidato.getInstance().listar();
		
		}

		public Object getCandidatoDao() {
			return candidatoDao;
		}

		public void setCandidatoDao(Object candidatoDao) {
			this.candidatoDao = candidatoDao;
		}
}
