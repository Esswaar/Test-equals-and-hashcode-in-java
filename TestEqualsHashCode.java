import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestEqualsHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("A1234");
		Student student2 = new Student("A1234");
		//Before implementation the two types will give false value 
		//after implementation of equals method, equlas method will give true and "==" give false statements 
		System.out.println(student1.equals(student2));
		System.out.println(student1 == student2);
		
		Map<Student, ReportCard> object = new HashMap<Student,ReportCard>();
		object.put(student1, new ReportCard());
		object.put(student2, new ReportCard());
		System.out.println(object.size());
		System.out.println("hashcode of student1:"+student1.hashCode());
		System.out.println("Hashcode of student2:"+student2.hashCode());
		
		Set<Student> studentSet = new HashSet<Student>();
		for (int i = 0; i < 100; i++) {
			studentSet.add(new Student("ABC"+i));
						
		}
		System.out.println(studentSet.size());
		long startTime = System.nanoTime();
		System.out.println(studentSet.contains(new Student("ABC60")));
		System.out.println("Elapsed time :"+(System.nanoTime()-startTime));
		Student student3 = new Student("A123");		
		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student2)+"----------"+student2.equals(student1));
		System.out.println(student1.equals(student2)+"-------"+student2.equals(student3)+"-------------"+student1.equals(student3));
		System.out.println(student1.equals(null));
	
	}

	
}
