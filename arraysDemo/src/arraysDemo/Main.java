package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] students = new String[3];
		students[0]="Egemen Inanc";
		students[1]="Deniz Derin";
		students[2]="Inek Saban";
		for(int i=0;i<students.length;i++)
			System.out.println(students[i]);
		for(String student:students)
			System.out.println(student);
	}
	
}
