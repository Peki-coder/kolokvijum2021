package kolokvijum1.racunarski_centar;

import kolokvijum1.racunarski_centar.status.StatusRacunara;

public class RacunarskiCentar {

	public static final int VELICINA_SALE = 3;
	private Racunar[] racunari;
	
	public RacunarskiCentar(Racunar[] k) {
		if(k.length == 0 || k == null) {
			racunari = new Racunar[45];	
		}
		else {
			racunari = new Racunar[k.length];
			for (int i = 0; i < k.length; i++) {
				if(racunari[i] == null) {
					this.racunari[i] = k[i];
					
				}else System.out.println("GREKSA");
			}
		}
		
	}

	public Racunar[] vratiLoseRacunare() {
		int brojLosih = 0;
		for (int i = 0; i < racunari.length; i++) {
			if(racunari[i] != null && (racunari[i].getStatus() == StatusRacunara.NA_SERVISU || racunari[i].getStatus() == StatusRacunara.U_KVARU)) {
				brojLosih++;
			}
		}
		
		Racunar[] losiRacunari = new Racunar[brojLosih];
		brojLosih = 0;
		for (int i = 0; i < racunari.length; i++) {
			if(racunari[i] != null && (racunari[i].getStatus() == StatusRacunara.NA_SERVISU || racunari[i].getStatus() == StatusRacunara.U_KVARU)) {
				losiRacunari[brojLosih] = racunari[i];
				brojLosih++;
			}
		}
//		System.out.println(brojLosih);
		return losiRacunari;
		
	}
	
	public int brojKorisnika(int k) {
		
		int brojRacunara = 0;		
		if(k > racunari.length) k = racunari.length;
		
		for (int i = 0; i < k; i++) {
			if(racunari[i].getStatus() == StatusRacunara.OPERATIVAN) brojRacunara++;	
		}
		if( brojRacunara % VELICINA_SALE == 0)return brojRacunara / VELICINA_SALE;
		return  brojRacunara / VELICINA_SALE + 1;
	}
	
	
	
	
}
