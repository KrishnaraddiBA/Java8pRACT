import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Nonterminal Methods:distinct(),filter,map,flatmap,,limit
//terminal methods:min,max,collect,count,reduce,toArray,forEach
public class C {
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(2,8,6,5,3,4,1);
		Optional<Integer> min = li.stream().min((x,y)->{return x.compareTo(y);});
	Integer integer = min.get();
	System.out.println(integer);
	Optional<Integer> max = li.stream().max((x,y)->x.compareTo(y));
	Integer integer2 = max.get();
	
	System.out.println(integer2);
	li=li.stream().distinct().collect(Collectors.toList());
	li=li.stream().limit(2).collect(Collectors.toList());
	li.forEach(System.out::println);
	
	
	}

}
