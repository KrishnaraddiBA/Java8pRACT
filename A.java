import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {
	public static void main(String[] args) {
		
		List<Integer> lst=Arrays.asList(11,17,23,25,28);
		List<Integer> lst2=Arrays.asList(91,92,93);
		List<Integer> lst3=Arrays.asList(55,56,57,58,59);
		
		List<List<Integer>> lst4=Arrays.asList(lst,lst2,lst3);
		
		List<Integer> collect = lst4.stream().flatMap(x->x.stream()).collect(Collectors.toList());
	
		List<Integer> collect2 = collect.stream().sorted().collect(Collectors.toList());
	
		for (Integer integer : collect2) {
			System.out.println(integer);
		}
	
	}

}
