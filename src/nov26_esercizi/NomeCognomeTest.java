package nov26_esercizi;

public class NomeCognomeTest {

	public static void main(String[] args) {
		
		Nome soloNome = new Nome();
		soloNome.stampa();
		
		System.out.println();
		
		NomeCognome nomeCognome = new NomeCognome();
		nomeCognome.stampa();
		
		System.out.println();
		
		NomeCognomeAlt nomeCognomeAlt = new NomeCognomeAlt();
		nomeCognomeAlt.stampa();
		
	}

}
