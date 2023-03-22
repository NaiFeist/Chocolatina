package Chocolatina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Chocolatina {

	public static void main(String[] args) {
		
		String chocolates = "Mars-1,05#Twix-0,99#Bounty-1,20#Lion-1,25";
		String[] chocolateDato;
		
		List<String[]> chocolateList = new ArrayList<String[]> ();
		
		StringTokenizer st = new StringTokenizer(chocolates, "#");
		
		while (st.hasMoreTokens()) {
			chocolateDato = st.nextToken().split("-");
			chocolateList.add(chocolateDato);		
		}
			for (String[] chocolate : chocolateList) {
			System.out.println(chocolate[0] + " ---> " + chocolate[1]);
			}
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Qué chocolatina quieres? ");
			String selectedChocolate = sc.nextLine();
			
			boolean chocolateHay = false;
			for (String[] chocolate : chocolateList) {
				if (chocolate[0].equalsIgnoreCase(selectedChocolate)) {
					System.out.println("El precio de la chocolatina " + selectedChocolate + " es " + chocolate[1] + " euros.");
					chocolateHay = true;
					break;
				}
			}
			if(!chocolateHay) {
				System.out.println("No hay :(");
			}
			sc.close();
	
	}


}
