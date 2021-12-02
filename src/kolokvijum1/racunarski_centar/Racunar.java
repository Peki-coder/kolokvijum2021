package kolokvijum1.racunarski_centar;

import java.util.Calendar;
import java.util.GregorianCalendar;

import kolokvijum1.racunarski_centar.status.StatusRacunara;

public class Racunar {

	private String specifikacija;
	private GregorianCalendar datumNabavke;
	private StatusRacunara status;
	
	
	public String getSpecifikacija() {
		return specifikacija;
	}
	public void setSpecifikacija(String specifikacija) {
		String gb = "GB";
		String ram = "RAM";
		if(specifikacija == null || specifikacija.isEmpty() ||
				specifikacija.toLowerCase().indexOf(gb.toLowerCase()) == -1 || specifikacija.toLowerCase().indexOf(ram.toLowerCase()) == -1) {
			System.out.println("GRESKA");
		}else this.specifikacija = specifikacija;
	}
	public GregorianCalendar getDatumNabavke() {
		return datumNabavke;
	}
	public void setDatumNabavke(GregorianCalendar datumNabavke) {
		
//		this.datumNabavke = datumNabavke;
		if(datumNabavke == null || datumNabavke.after(new GregorianCalendar())/*this.datumNabavke.before(datumNabavke)*/) {
			System.out.println("GRESKA");
			this.datumNabavke= new GregorianCalendar();
		}else {
			this.datumNabavke = datumNabavke;
		}
	}
	public StatusRacunara getStatus() {
		return status;
	}
	public void setStatus(StatusRacunara status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "Racunar [specifikacija=" + specifikacija + ", datumNabavke=" + datumNabavke.getTime() + ", status=" + status
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
