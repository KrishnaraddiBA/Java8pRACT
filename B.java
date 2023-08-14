import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
	public static void main(String[] args) {
		List<String> lst= Arrays.asList("krishna","vinayak","sony","vishnu");
		List<String> lst2=Arrays.asList("suhan","shivanand","praveen");
		
		List<List<String>> lst3=Arrays.asList(lst,lst2);
		
		List<String> collect = lst3.stream().flatMap(s->s.stream()).collect(Collectors.toList());
	
		for (String string : collect) {
			System.out.println(string);
			
		}
		
		List<Student> lst5=new ArrayList<>();
		lst5.add(new Student(1, "krishna", "TOCE"));
		lst5.add(new Student(2, "keshav", "Rec"));
		lst5.add(new Student(3, "deepika", "trends"));
		
		List<Student> lst6=new ArrayList<>();
		lst6.add(new Student(4, "suhasini","tce"));
		lst6.add(new Student(7, "Manushree", "TOCE"));

		
		List<List<Student>> lst8=Arrays.asList(lst5,lst6);
		List<Student> collect2 = lst8.stream().flatMap(s->s.stream()).collect(Collectors.toList());
	for (Student student : collect2) {
		System.out.println(student);
	}
	
	}

}
class Student{
	int id;
	String name;
	String college;
	public Student(int id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}
	
	
}
