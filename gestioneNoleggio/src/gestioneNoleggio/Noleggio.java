package gestioneNoleggio;

import java.util.ArrayList;

public class Noleggio {
	
	ArrayList <Auto> auton = new ArrayList <Auto> ();
	
	public void registrazione(Auto auto) {
		
		auton.add(auto);
		System.out.println("Auto registrata con successo!");
		
	}
	
	public void noleggio(String codice) {
		
		for (Auto auto : auton) {
			if (auto.disponibilità) {
				auto.cambioDisponibilità(false);
				System.out.println("Noleggio avvenuto con successo!");
			} else if (!(auto.disponibilità)) {
				System.out.println("Auto già noleggiata. Per favore, selezionarne un'altra.");
			}
		}
	}
	
	public void restituzione(String codice) {
		
		for (Auto auto: auton) {
			if (!(auto.disponibilità)) {
				auto.cambioDisponibilità(true);
				System.out.println("Restituzione avvenuta con successo!");
			} else if (auto.disponibilità) {
				System.out.println("Auto già restituita. Grazie e arrivederci.");
			}
		}
		
		
	}
	
	public void visualizza() {
		
		for (Auto auto : auton) {
			if (auto.disponibilità) {
				System.out.println("Auto restituite: ");
				System.out.println(auto);
			}
		}
		for (Auto auto : auton) {
			if (!(auto.disponibilità)) {
				System.out.println("Auto noleggiate: ");
				System.out.println(auto);
			}
		}		
	}

}
