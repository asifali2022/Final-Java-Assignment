package q06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class StreamApi {

	public static void main(String[] args) {
		
	  ArrayList<Person> people = new ArrayList<Person>();
	  
	  people .add(new Person("asif",24));
      people.add(new Person("Alice", 25));
      people.add(new Person("Bob", 30));
      people.add(new Person("Charlie", 18));
      people.add(new Person("David", 22));
      people.add(new Person("Eva", 28));
      people.add(new Person("Frank", 17));
      people.add(new Person("Grace", 35));
      people.add(new Person("Hannah", 40));
      people.add(new Person("Ian", 19));
      people.add(new Person("Jasmine", 31));
      people.add(new Person("Kevin", 26));
      people.add(new Person("Linda", 21));
      people.add(new Person("Mike", 29));
      people.add(new Person("Nancy", 23));
      people.add(new Person("Olivia", 27));
      people.add(new Person("Paul", 33));
      people.add(new Person("Quincy", 20));
      people.add(new Person("Rachel", 36));
      people.add(new Person("Sam", 24));
      people.add(new Person("Timan", 32));
		
   // Using Stream API to filter and process data
      List<String> customFilter=people.stream()
    		  .filter(person -> person.getAge()>20) //Filter persons older than 18
    		  .map(Person -> Person.getName())// Extract names of filtered persons
    		  .collect(Collectors.toList());//// Collect names into a list
      //printing names
      System.out.println("Names of adults: " + customFilter);
	}

}
