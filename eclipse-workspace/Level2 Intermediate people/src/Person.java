
public class Person {

	String Name;
	String JobTitle;
	int Age;
	
public Person(String name, int age, String jobTitle) {
	this.Name = name;
	this.Age = age;
	this.JobTitle = jobTitle;
}

@Override
public String toString() {
	return "Person [Name=" + Name + ", JobTitle=" + JobTitle + ", Age=" + Age + "]";
}
	
	public <person> Person searchperson(String Name) {
		
		for (Person person : Main.myList) {
			if(person.Name==Name) {
				return person;
			}
		}
		return null;
		
	}





}
