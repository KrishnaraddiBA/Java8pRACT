import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class D {
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,5,4,3,2,7,8,9);
		Stream<Integer> stream2 = li.stream();
		List<Integer> collect = li.stream().sorted().collect(Collectors.toList());
		List<Integer> collect2 = li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
		Optional<Integer> min = collect.stream().min((x,y)->{return x.compareTo(y);});
		List<String> li2=Arrays.asList("One","One-Two");
		Stream<String> stream = li2.stream();
		boolean anyMatch = li2.stream().anyMatch(s->s.startsWith("One"));
		System.out.println(anyMatch);
		boolean allMatch = li2.stream().allMatch(s->s.startsWith("One"));
		System.out.println(allMatch);
		boolean noneMatch = li2.stream().noneMatch(s->s.startsWith("One"));
		System.out.println(noneMatch);
		
		
		Stream<Object> concat = Stream.concat(stream, stream2);
		long count = concat.count();
		System.out.println(count);
		Optional<String> findAny = li2.stream().findAny();
		String string = findAny.get();
		System.out.println(string);
		Optional<String> findFirst = li2.stream().findFirst();
		System.out.println(findFirst.get());
		System.out.println(min.get());
		System.out.println(collect);
	System.out.println(collect2);
	
	List<Integer> collect4 = li.parallelStream().filter(s->s%2==0).collect(Collectors.toList());
	
	System.out.println(collect4);
	}

}
