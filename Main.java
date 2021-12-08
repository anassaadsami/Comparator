package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Person dad1 = new Person("saad",75);
		Person dad2 = new Person("sami",80);
		Person dad3 = new Person("nadir",85);
		
//		we can create dad directly without reference variable to dad
//		Person p1= new Person ("anas", 40 , new Person("saad", 75));
//		Person p2= new Person ("hiba", 35 , new Person("sami", 80));
//		Person p3= new Person ("teim", 18 , new Person("sami", 85));

		Person p2= new Person ("hiba", 35 , dad2);
		Person p3= new Person ("teim", 18 , dad3);
		Person p1 = new Person ("anas", 40 , dad1);
		ArrayList<Person> sons = new ArrayList<Person>(Arrays.asList(p3, p2 , p1));
		ArrayList<Person> dady = new ArrayList<Person>();
		dady.add(dad1); 
		dady.add(dad2); 
		dady.add(dad3); 
		
//		System.out.println(dady.get(0).toString());  // i dont know why i can not display dady items ??
		System.out.println(sons.get(0));
		System.out.println(p3);    // the same sons.get(0)
//		System.out.println(dady.get(0));       // error ???
//		System.out.println(dad1);       // error ???
		
		System.out.println("display sons items before sorting:");
		display(sons);   // display item depends on their order in array
		
		Collections.sort(sons  ,new ComparatorTypes());    
		System.out.println("display by person's name sorting:");
		display(sons);
		
		
		Collections.sort(sons , new PersonAge());
		System.out.println("display by person's age sorting:");
		display(sons);
		
		Collections.sort(sons , new FatherAge());
		System.out.println("display by father's age sorting:");
		display(sons);
		
		Collections.sort(sons , new FatherName());
		System.out.println("display by father'name sorting:");
		display(sons);
		
		System.out.println("display dady items before sorting:");
//		dady.get(0).toString2();
		
//		display2(dady);   // display item depends on their order in array
//		
		
//		Collections.sort(dady , new FatherAge());
//		System.out.println("display by just(father'name )sorting:");
//		display(dady);
//		
////		Collections.sort(dady);
//		System.out.println("display just dady items without sorting:");
//		display2(dady);
		
	}
	public static ArrayList<Person> display(ArrayList<Person> x){
		for (Person item : x) {
			System.out.println(item.toString());
		}
		System.out.println();
		return x;
		
	}
	public static ArrayList<Person> display2(ArrayList<Person> x){
		for (int i = 0 ; i< x.size()  ; i++){
			System.out.println(x.get(i));
		}
		System.out.println();
		return x;
		
	}

}
