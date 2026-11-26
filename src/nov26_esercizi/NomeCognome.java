package nov26_esercizi;

public class NomeCognome {
	
	public String coppiaN = "GG";
	public String spazi = "  ";
	public String coppiaC = "gg";
	
	public String primeUltimeRigheN = coppiaN+coppiaN+coppiaN+coppiaN+coppiaN;
	public String terzaQuartaRigaN = coppiaN+spazi+spazi+spazi+spazi;
	public String quintaSestaRigaN = coppiaN+spazi+spazi+coppiaN+coppiaN;
	public String settimaOttavaRigaN = coppiaN+spazi+spazi+spazi+coppiaN;
	
	public String primeUltimeRigheC = coppiaC+coppiaC+coppiaC+coppiaC+coppiaC;
	public String terzaQuartaRigaC = coppiaC+spazi+spazi+spazi+spazi;
	public String quintaSestaRigaC = coppiaC+spazi+spazi+coppiaC+coppiaC;
	public String settimaOttavaRigaC = coppiaC+spazi+spazi+spazi+coppiaC;
	
	public void stampa() {
		System.out.println(primeUltimeRigheN+" "+primeUltimeRigheC);
		System.out.println(primeUltimeRigheN+" "+primeUltimeRigheC);
		System.out.println(terzaQuartaRigaN+" "+terzaQuartaRigaC);
		System.out.println(terzaQuartaRigaN+" "+terzaQuartaRigaC);
		System.out.println(quintaSestaRigaN+" "+quintaSestaRigaC);
		System.out.println(quintaSestaRigaN+" "+quintaSestaRigaC);
		System.out.println(settimaOttavaRigaN+" "+settimaOttavaRigaC);
		System.out.println(settimaOttavaRigaN+" "+settimaOttavaRigaC);
		System.out.println(primeUltimeRigheN+" "+primeUltimeRigheC);
		System.out.println(primeUltimeRigheN+" "+primeUltimeRigheC);
		
	}
	
}
