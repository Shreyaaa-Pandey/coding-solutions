class Student{
	String name;
	int age;
	Student(String Name , int age){
		this.name = Name;
		this.age = age;
		
	}
}
public class Main{
	public static void main(String[] args){
		Student s = new Student("Unknown",20);
		System.out.println(s.name);
		System.out.println(s.age);
	}
}