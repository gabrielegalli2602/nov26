package nov26_esercizi;

public class NomeCognomeAlt {
	
	public String coppiaN = "GG";
	public String spazi = "  ";
	public String coppiaC = "AA";
	
	public String primeUltimeRigheN = coppiaN+coppiaN+coppiaN+coppiaN+coppiaN;
	public String terzaQuartaRigaN = coppiaN+spazi+spazi+spazi+spazi;
	public String quintaSestaRigaN = coppiaN+spazi+spazi+coppiaN+coppiaN;
	public String settimaOttavaRigaN = coppiaN+spazi+spazi+spazi+coppiaN;
	
	public String primaRigaC = spazi+spazi+coppiaC+spazi+spazi;
	public String secondaRigaC = spazi+coppiaC+coppiaC+coppiaC+spazi;
	public String terzaSestaRigaC = coppiaC+coppiaC+coppiaC+coppiaC+coppiaC;
	public String righeRestantiC = coppiaC+spazi+spazi+spazi+coppiaC;
	
	public void stampa() {
		System.out.println(primeUltimeRigheN+" "+primaRigaC);
		System.out.println(primeUltimeRigheN+" "+secondaRigaC);
		System.out.println(terzaQuartaRigaN+" "+terzaSestaRigaC);
		System.out.println(terzaQuartaRigaN+" "+righeRestantiC);
		System.out.println(quintaSestaRigaN+" "+righeRestantiC);
		System.out.println(quintaSestaRigaN+" "+terzaSestaRigaC);
		System.out.println(settimaOttavaRigaN+" "+righeRestantiC);
		System.out.println(settimaOttavaRigaN+" "+righeRestantiC);
		System.out.println(primeUltimeRigheN+" "+righeRestantiC);
		System.out.println(primeUltimeRigheN+" "+righeRestantiC);
		
	}
	
}
