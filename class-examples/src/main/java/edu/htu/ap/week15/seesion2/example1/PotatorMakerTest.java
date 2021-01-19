package edu.htu.ap.week15.seesion2.example1;

public class PotatorMakerTest {
	public static void main(String[] args) {
		PotatoMaker pm=new PotatoMaker();
		pm.setOil(250);
		pm.setPotato(4);
		
//		pm.peel();
//		pm.slice();
//		pm.fry();
//		pm.serve();
		pm.makePotato();
		
		CirclePotatoMaker pm2=new CirclePotatoMaker();
		pm2.setOil(100);
		pm2.setPotato(2);
		
		pm2.makePotato();
		
		StarsPotatoMaker spm=new StarsPotatoMaker();
		spm.setOil(300);
		spm.setPotato(2);
		spm.makePotato();
	}
}
