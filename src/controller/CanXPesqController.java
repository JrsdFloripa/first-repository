package controller;

import java.util.List;

import javax.xml.crypto.Data;

import classes.CanXPesq;
import classes.Candidato;


public class CanXPesqController {
		
		private Object CanXPesqDao;
		public void salvar(CanXPesq CanXPesq) throws Exception {
			if (classes.CanXPesq.getNome() == null ||  (CanXPesq.getNome()).lenght() < 2) {
				throw new Exception();
			} 
		}
				
		public void atualizar(CanXPesq canxpesq) throws Exception  {
			try {
				if (CanXPesq.getNome() == null || CanXPesq.getNome().length() < 3) {
					throw new Exception();
					
					
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		public void excluir(String ID, int IDCandidato) throws Exception {
			if (IDCandidato == 0) {
				throw new Exception();
			}
		
		
		public List<CanXPesq> listar(){
			return  CanXPesq.getInstance().listar();
			
		}
}
