package aula01;

import java.util.Scanner;
import java.util.ArrayList;

public class P1_2 {
	
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		Pessoa [] list = new Pessoa[0];
		int op;
		
		System.out.println("Available Options: \n");
		System.out.println("1: Add person");
		System.out.println("2: Remove person");
		System.out.println("3: List people");
		System.out.println("4: List people by name");
		System.out.println("5:  Exit \n");
		System.out.println("------------------");
		System.out.println(" Your option: ");
	
		op = kb.nextInt();
		
		do{
			switch (op){
		    case 1:
		       list = addperson(list);
		        break;
		    case 2:
		    	list = removeperson(list);
		        break;
		    case 3:
		    	listpeople(list);
		        break;
		    case 4:
		    	list = listbyName(list);
		        break;
		    case 5:
		    	System.err.println("Invalid option!");
		        System.exit(0);
		        break;
		  }
		}while(op != 5);
	}

	private static Pessoa[] addperson(Pessoa[] list) {
		String name;
		String cardNumb;
		int day, month, year;
		
		System.out.print("Introduce your name: "); name = kb.next();
		System.out.print("\nIntroduce your card number: "); cardNumb = kb.next();
		while(!cardNumb.matches("[0-9]+")){
			cardNumb = kb.next();
		}
		if(search(list, cardNumb) != -1){
			System.out.print("There's already a register with that card number!");
			return list;
		}
		System.out.println("Insert your birth year: "); year = kb.nextInt();
		System.out.println("Insert your birth month: "); month = kb.nextInt();
		System.out.println("Insert your birth day: "); day = kb.nextInt();
		
		Data d = new Data(day, month, year);
		if(!d.validDate()){
			System.out.println("The date is not valid! \nPerson was not added!");
		}else{
			Pessoa p = new Pessoa(name, cardNumb, d);
			list = addArray(list, p);
			System.out.println("Person added successfully!");
		}
		
		return list;
	}
	
	
	private static int search(Pessoa[] list, String cardNumb){
		for (int i = 0; i < list.length; i++) {
			if(list[i] != null && ((list[i].getCardNumb().equals(cardNumb))))
				return i;
		}
		return -1;
	}
	
	private static Pessoa[] addArray(Pessoa[] list, Pessoa p){
		Pessoa [] copy = new Pessoa[list.length+1];
		int i;
		for(i = 0; i < list.length; i++){
			copy[i] = list[i];
		}
		copy[list.length] = p;
		return copy;
	}

	private static Pessoa[] removeperson(Pessoa[] list) {
		System.out.println("Introduce the card number of the person you want to remove: ");
		String cardNumb = kb.next();
		int n = search(list, cardNumb);
		if(n == -1){
			System.out.println("The card number introduce does not match any person!");
		}else{
			System.out.println("You wish to erase this person "+list[n].getName()+", with the following card number "+list[n].getCardNumb()+" and with this birth date "+list[n].getBirthday()+" ? (Y/N) ");
			String s = kb.next();
			while(!(s.equalsIgnoreCase("Y") || (s.equalsIgnoreCase("N")))){
				System.out.println("Invalid choice! Wish to erase somebody? ");
				s = kb.next();
			}
			if(s.equalsIgnoreCase("N"))
				System.out.println("Person not erased!");
			else{
				list[n] = null;
				System.out.println("Person erased successfully!");
			}
		}
		return list;
	}

	private static void listpeople(Pessoa[] list) {
		for (int i = 0; i < list.length; i++) {
			if(list[i] != null){
				System.out.println("Name: "+list[i].getName()+" Card Number: "+list[i].getCardNumb()+" BirthDate: "+list[i].getBirthday());
			}
		}
	}

	private static Pessoa[] listbyName(Pessoa[] list) {
		Pessoa tmp;
		boolean swap = false;
			do{
				swap = false;
				for (int i = 0; i < list.length - 1; i++){
					if(list[i] != null && list[i].getName().compareToIgnoreCase(list[i+1].getName()) > 0){
						tmp = list[i];
						list[i] = list[i+1];
						list[i+1] = tmp;
						swap = true;
					}
				}
				int n = list.length - 1;
				n--;
			}while(swap);
		return list;
	}
}
