package nov26_esercizi;

public class Nome {
	
	public String coppiaN = "GG";
	public String spazi = "  ";
	
	public String primeUltimeRighe = coppiaN+coppiaN+coppiaN+coppiaN+coppiaN;
	public String terzaQuartaRiga = coppiaN;
	public String quintaSestaRiga = coppiaN+spazi+spazi+coppiaN+coppiaN;
	public String settimaOttavaRiga = coppiaN+spazi+spazi+spazi+coppiaN;
	
	public void stampa() {
		System.out.println(primeUltimeRighe);
		System.out.println(primeUltimeRighe);
		System.out.println(terzaQuartaRiga);
		System.out.println(terzaQuartaRiga);
		System.out.println(quintaSestaRiga);
		System.out.println(quintaSestaRiga);
		System.out.println(settimaOttavaRiga);
		System.out.println(settimaOttavaRiga);
		System.out.println(primeUltimeRighe);
		System.out.println(primeUltimeRighe);
		
	}

}
