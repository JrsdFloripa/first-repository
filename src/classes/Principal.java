package classes;

public class Principal {


	public static void main(String[] args) {
		Candidato c1 = new Candidato("22 ","bolsonaro ","PL ",true);
		Candidato c2 = new Candidato("13 ","Lula ","PT ", false);
		Candidato c3 = new Candidato("12 ","Ciro ","PDT ", true);
		Candidato c4 = new Candidato("15 ","simone ","MDB ", true);
		
		Pesquisa P08 = new Pesquisa("brasmarket ","20/08", null);
		
		CanXPesq cxp1 = new CanXPesq(P08, null, c1,39.9f);
		CanXPesq cxp2 = new CanXPesq(P08, null, c1,40.3f);
		CanXPesq cxp3 = new CanXPesq(P08, null, c1,8.3f);
		CanXPesq cxp4 = new CanXPesq(P08, null, c1,7.9f);
		
		System.out.println("CanXPesq " +c1.getNome() + c1.getID() + P08.getIntituto() + cxp1.getVotos()); 
		System.out.println("CanXPesq " +c2.getNome() + c2.getID() + P08.getIntituto() + cxp2.getVotos()); 
		System.out.println("CanXPesq " +c3.getNome() + c3.getID() + P08.getIntituto() + cxp3.getVotos()); 
		System.out.println("CanXPesq " +c4.getNome() + c4.getID() + P08.getIntituto() + cxp4.getVotos()); 
		}
	 
}
	
