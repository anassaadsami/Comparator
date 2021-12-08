package comparator;

public class Person {
	String name ;
	int age  ;
	Person father ;
	
	public Person(String name, int age) {   // constructor for father when we need to create it
		this.name = name;     
		this.age = age;
	}
	public Person(String name, int age, Person father) {// constructor for Person when we need to create it
		this.name = name;
		this.age = age;
		this.father = father;
	}
	@Override
	public String toString() {
		return "Person [name=" + this.name + ", age=" + this.age + ", fatherAGe=" + this.father.age + ", fatherName= "+this.father.name+ "]";
	}
	
	public Person getFather() {
		return father;
	}
	
//	public void toString2() {
//		System.out.println( "Father [name= " + this.father.name + ", age= " + this.father.age +  " ]");
//	}
	public void setFather(Person father) {
		this.father = father;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
