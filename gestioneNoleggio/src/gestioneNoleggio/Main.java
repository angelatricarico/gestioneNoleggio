package gestioneNoleggio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Noleggio noleggio = new Noleggio();
		
		int inizioCiclo=0;
		while (inizioCiclo == 0) {
			System.out.println("Benvenuto nell'autonoleggio WINCHESTER. Per favore, scegli un'opzione:\n"
					+ "1) Noleggia un'auto\n2) Restituisci un'auto\n3) Registra una nuova auto\n4) Visualizza elenco auto noleggiate e restituite");
			int inputUtente = scanner.nextInt();
			scanner.nextLine();
			
			switch (inputUtente) {
			
			case 1: 
				System.out.println("Inserisci il codice identificativo dell'auto che vorresti noleggiare: ");
				String codiceId = scanner.nextLine();
				noleggio.noleggio(codiceId);
				break;
				
			case 2:
				System.out.print("Inserisci il codice identificativo dell'auto che vorresti noleggiare: ");
				String codiceIde = scanner.nextLine();
				noleggio.restituzione(codiceIde);
				break;
				
			case 3:
				System.out.println("Inserisci il codice identificativo della nuova auto: ");
				String codice = scanner.nextLine();
				System.out.println("Inserisci la marca della nuova auto: ");
				String marca = scanner.nextLine();
				System.out.println("Inserisci il modello della nuova auto: ");
				String modello = scanner.nextLine();
				System.out.println("Inserisci la categoria della nuova auto: ");
				String categoria = scanner.nextLine();
				
				Auto auto = new Auto(codice, marca, modello, categoria);
				noleggio.registrazione(auto);
				break;
				
			case 4:
				noleggio.visualizza();
				break;
				
			default:
				System.out.println("Input invalido. Si prega di riprovare.");
			}
			
		}
		scanner.close();
	}

}
