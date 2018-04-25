import java.util.ArrayList;

public class Main {
public static ArrayList<Person> myList = new ArrayList<Person>();
	public static void main(String[] args) {

		
		Person P1 = new Person("Ben", 25, "Software Consultant");
		Person P2 = new Person("Ewan", 25, "Arborist");
		Person P3 = new Person("Matt", 25, "Bar Manager");
		
//		ArrayList<Person> myList = new ArrayList<Person>();
		
		myList.add(P1);
		myList.add(P2);
		myList.add(P3);
		
		for(Person person :myList ) {
			System.out.println(person.toString());
		}
		
		System.out.println(P1.searchperson("Ben"));
	}

}
