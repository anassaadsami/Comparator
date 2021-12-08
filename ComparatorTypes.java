package comparator;

import java.util.Comparator;

public class ComparatorTypes implements Comparator<Person> {   // we must make external class

	@Override
	public int compare(Person o1, Person o2) {     // use it if we want to compare preson.name
		return o1.name.compareTo(o2.name);
	}
}
	class PersonAge implements Comparator<Person> {  // use it if we want to compare preson.age
		@Override
		public int compare(Person o1, Person o2) {
			return o1.age - o2.age ;
		}

	}

	class FatherName implements Comparator<Person> {  // use it if we want to compare preson.fahter.name

		@Override
		public int compare(Person o1, Person o2) {
			return o1.father.name.compareTo(o2.father.name); // compareTo() cause it's String variable
		}

	}

	class FatherAge implements Comparator<Person> { // use it if we want to compare preson.father.age
	
	@Override
	public int compare(Person o1, Person o2) {
		return o1.father.age - o2.father.age ;           // minus cause it's int variable
	}
	
}

