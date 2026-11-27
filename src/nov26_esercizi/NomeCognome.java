package nov26_esercizi;

public class NomeCognome {
	
	public String lettera;
	public String spazi = "  ";
	
	public void stampa() {
		
		String piena = lettera+lettera+lettera+lettera+lettera+lettera+lettera+lettera+lettera+lettera;
		String sopra = lettera+lettera+spazi+spazi+spazi+spazi;
		String centrale = lettera+lettera+spazi+spazi+lettera+lettera+lettera+lettera;
		String sotto = lettera+lettera+spazi+spazi+spazi+lettera+lettera;
		
		System.out.println(piena);
		System.out.println(piena);
		System.out.println(sopra);
		System.out.println(sopra);
		System.out.println(centrale);
		System.out.println(centrale);
		System.out.println(sotto);
		System.out.println(sotto);
		System.out.println(piena);
		System.out.println(piena);
		
		System.out.println();
		
		System.out.println(piena+" "+piena);
		System.out.println(piena+" "+piena);
		System.out.println(sopra+" "+sopra);
		System.out.println(sopra+" "+sopra);
		System.out.println(centrale+" "+centrale);
		System.out.println(centrale+" "+centrale);
		System.out.println(sotto+" "+sotto);
		System.out.println(sotto+" "+sotto);
		System.out.println(piena+" "+piena);
		System.out.println(piena+" "+piena);
		
	}
	
}
