package wetic.calcmanager.gui;

import java.util.Scanner;

import wetic.calcmanager.commun.MyService;

public class App {

	public static void main(String[] args) {
		//Encodage CA
		double ca;
		ca = MyService.encodeData("Entrez votre CA: ");	
		
		//Charges
		double charges;
		charges = MyService.encodeData("Entrez vos charges: ");	
		double revenuProfBrute = ca - charges;
		//Cotisations Sociales
		double cotizSoc;
		cotizSoc = MyService.encodeData("Entrez vos cotisations sociales: ");	
		double beneficeImposable = revenuProfBrute - cotizSoc;
		//Impot
		double impots;
		impots = MyService.encodeData("Entrez vos impots: ");	
		// Affichage Net
		double beneficeNet;
		beneficeNet = beneficeImposable - impots;
		System.out.println("Votre net est: " + beneficeNet);
	}



}
