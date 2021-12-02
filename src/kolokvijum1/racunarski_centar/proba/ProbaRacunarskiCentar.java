package kolokvijum1.racunarski_centar.proba;

import java.util.GregorianCalendar;

import kolokvijum1.racunarski_centar.Racunar;
import kolokvijum1.racunarski_centar.RacunarskiCentar;
import kolokvijum1.racunarski_centar.status.StatusRacunara;

public class ProbaRacunarskiCentar {

	public static void main(String[] args) {

		Racunar r1 = new Racunar();
		Racunar r2 = new Racunar();
		
		r1.setSpecifikacija("Intel i7, 8GB RAM, 256GB SSD");
		r1.setStatus(StatusRacunara.OPERATIVAN);
		GregorianCalendar datum1 = new GregorianCalendar();
		datum1.set(2012, 11, 23);
		r1.setDatumNabavke(datum1);
		
		r2.setSpecifikacija("Intel i3, 4GB RAM, 500GB HDD");
		r2.setStatus(StatusRacunara.OPERATIVAN);
		GregorianCalendar datum2 = new GregorianCalendar();
		datum2.set(2013, 12, 3);
		r2.setDatumNabavke(datum2);
		
		Racunar r3 = new Racunar();
		
		r3.setSpecifikacija("Intel i7, 8GB RAM, 256GB SSD");
		r3.setStatus(StatusRacunara.OPERATIVAN);
		GregorianCalendar datum3 = new GregorianCalendar();
		datum3.set(2012, 11, 23);
		r3.setDatumNabavke(datum3);
		
		Racunar r4 = new Racunar();
		
		r4.setSpecifikacija("Intel i7, 8GB RAM, 256GB SSD");
		r4.setStatus(StatusRacunara.OPERATIVAN);
		GregorianCalendar datum4 = new GregorianCalendar();
		datum4.set(2012, 11, 23);
		r4.setDatumNabavke(datum4);
		
		Racunar r5 = new Racunar();
		
		r5.setSpecifikacija("Intel i7, 8GB RAM, 256GB SSD");
		r5.setStatus(StatusRacunara.OPERATIVAN);
		GregorianCalendar datum5 = new GregorianCalendar();
		datum5.set(2012, 11, 23);
		r5.setDatumNabavke(datum5);
		
		Racunar r6 = new Racunar();
		
		r6.setSpecifikacija("Intel i7, 8GB RAM, 256GB SSD");
		r6.setStatus(StatusRacunara.OPERATIVAN);
		GregorianCalendar datum6 = new GregorianCalendar();
		datum6.set(2012, 11, 23);
		r6.setDatumNabavke(datum6);
		Racunar r7 = new Racunar();
		
		r7.setSpecifikacija("Intel i7, 8GB RAM, 256GB SSD");
		r7.setStatus(StatusRacunara.OPERATIVAN);
		GregorianCalendar datum7 = new GregorianCalendar();
		datum5.set(2012, 11, 23);
		r7.setDatumNabavke(datum7);
		
		Racunar r8 = new Racunar();
		
		r8.setSpecifikacija("Intel i7, 8GB RAM, 256GB SSD");
		r8.setStatus(StatusRacunara.NA_SERVISU);
		GregorianCalendar datum8 = new GregorianCalendar();
		datum8.set(2012, 11, 23);
		r8.setDatumNabavke(datum5);
		Racunar r9 = new Racunar();
		
		r9.setSpecifikacija("Intel i7, 8GB RAM, 256GB SSD");
		r9.setStatus(StatusRacunara.U_KVARU);
		GregorianCalendar datum9 = new GregorianCalendar();
		datum9.set(2012, 11, 23);
		r9.setDatumNabavke(datum9);
		Racunar r10 = new Racunar();
		
		r10.setSpecifikacija("Intel i7, 8GB RAM, 256GB SSD");
		r10.setStatus(StatusRacunara.NA_SERVISU);
		GregorianCalendar datum10 = new GregorianCalendar();
		datum10.set(2012, 11, 23);
		r10.setDatumNabavke(datum10);

		
		
		Racunar[] k = new Racunar[] {r1, r2, r3, r4, r5, r6 ,r7, r8 ,r9, r10 };
		
		
		
		RacunarskiCentar rc = new RacunarskiCentar(k);
		
		
		int broj = rc.brojKorisnika(13);
	
		rc.vratiLoseRacunare();
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(broj);
		
	}

}
