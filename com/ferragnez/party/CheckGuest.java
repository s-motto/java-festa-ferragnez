package com.ferragnez.party;
import java.util.Scanner;
public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //array invitati
		String[] invitati= {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		//scanner
		Scanner input = new Scanner(System.in);
		
		//richiesta nome
		System.out.println("Come ti chiami?");
		String nomeUtente= input.nextLine();
		boolean seiInvitato=false;
	    input.close();
	
		//if
		for(int i=0;i<invitati.length;i++) {
			if(nomeUtente.equals(invitati[i])){
				seiInvitato=true;
				System.out.println("Ciao "+nomeUtente+", sei in lista, entra pure!");
				break;
			}else {
				System.out.println("Spiancente "+nomeUtente+", non sei tra gli invitati.");
				
			};
		}
		
	}	
	
	}

