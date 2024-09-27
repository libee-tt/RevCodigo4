package com.generation;
import java.util.Scanner;

public class RevCodigo4 {
	
	public static void main(String [] args) {

    Scanner scanner = new Scanner(System.in); //se agrego system.in
    
    System.out.print("Turno del jugador 1 -- (Introduzca piedra, papel o tijeras): ");
    String jugador1 = scanner.nextLine().toLowerCase(); //se conviritó a minusculas
    
    System.out.print("Turno del jugador 2 -- (Introduzca piedra, papel o tijeras): ");
    String jugador2 = scanner.nextLine().toLowerCase();
    
    if (jugador1.equals(jugador2)) {
      System.out.println("Empate");
    } else {
    	int ganador = 2; //default?
    	
    	switch(jugador1) {
    		case "piedra":
    			if (jugador2.equals("tijeras")) { //equals en vez de  ==     
    				ganador = 1;
    			} //if
    			break;
    		case "papel":
    			if (jugador2.equals("piedra")) {//equals en vez de  ==
    				ganador = 1;
    			}//if
    			break;
    		case "tijeras":
    			if (jugador2.equals("papel")) {//equals en vez de  ==
    				ganador = 1;
    			}//if
    			break;
        default:
        	System.out.println("Entrada no válida");
    	}//switch
    	System.out.println("Gana el jugador " + ganador);
    }//else
    scanner.close(); // se cierra el scanner
	}//main
}//class Rev codigo