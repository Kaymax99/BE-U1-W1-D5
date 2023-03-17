package player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runnable {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Video v1 = new Video("Java for dummies", 5, 6, 3);
//		v1.play();
//		
//		Audio a1 = new Audio("Stofacennu nu maronn e cacio e maccarun", 5, 3);
//		a1.play();
//		
//		Image i1 = new Image("Sitting doge", 3);
//		i1.show();
		
		MediaElement[] arrayMedia = new MediaElement[5];
		for (int i = 0; i < arrayMedia.length; i++) {
		int temp;
		
		do {
			System.out.println("Elemento " + (i + 1) + " - Che tipo di media vuoi creare?");
			System.out.println("Immagine: 1 | File Audio: 2 | Video: 3");
			temp = scanner.nextInt();
			
			if (temp > 0 && temp < 4) {
			// Se viene inserito uno spazio durante la digitazione del titolo esplode TUTTO. 
			// Non ho trovato modo di risolvere questo problema neanche online, ho provato metodi che sostituiscono e 
			// rimuovono gli spazi, ma nulla.
			System.out.println("Qual è il titolo? (No spazi, vedi commento su Runnable linea 31-33)");
			String tempTitle = scanner.next();	
			int tempB;
			int tempVol;
			int tempDur;
			
			switch (temp) {
			
				case 1: {
					System.out.println("Quanto alta vuoi che sia la luminosità? (Consigliato: 1-5)");
					tempB = scanner.nextInt();
					arrayMedia[i] = new Image(tempTitle, tempB);
					break;
				}
				case 2: {
					System.out.println("Quanto alto vuoi sia il volume? (Consigliato: 1-5)");
					tempVol = scanner.nextInt();
					System.out.println("Quanto dura (Consigliato: 1-10)");
					tempDur = scanner.nextInt();
					arrayMedia[i] = new Audio(tempTitle, tempVol, tempDur);
					break;
				}
				case 3: {	
					System.out.println("Quanto alta vuoi che sia la luminosità? (Consigliato: 1-5)");
					tempB = scanner.nextInt();
					System.out.println("Quanto alto vuoi sia il volume? (Consigliato: 1-5)");
					tempVol = scanner.nextInt();
					System.out.println("Quanto dura (Consigliato: 1-10)");
					tempDur = scanner.nextInt();
					arrayMedia[i] = new Video(tempTitle, tempVol, tempDur, tempB);
					break;
				}
				default: {
					System.out.println("Non è stato inserito un valore valido. Riprova.");
					i--;
					break;
				}
			}
			} else {
				System.out.println("Non è stato inserito un valore valido. Riprova.");
				i--;
			}
		} while (temp < 0 && temp > 3);
	}
		
		
		
		int input;
		do {		
			System.out.println("Seleziona un elemento da riprodurre (1-5) o scrivi 0 per terminare il programma.");
			input = scanner.nextInt();
			
			switch (input){
			case 0: {
				System.out.println("Grazie per avermi utilizzato!");
				break;
			}
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: {
				if (arrayMedia[input-1] instanceof Image) {
					((Image) arrayMedia[input-1]).show();	
				} else if (arrayMedia[input-1] instanceof Audio) {
					((Audio) arrayMedia[input-1]).play();	
				} else if (arrayMedia[input-1] instanceof Video) {
					((Video) arrayMedia[input-1]).play();	
				}
				break;
			}
			default: System.out.println("Inserisci un valore valido!");
			break;
			}
		} while (input != 0);
}
}
