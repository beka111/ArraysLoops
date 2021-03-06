import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice3 {
	public static void main(String[] args) {
		Set<Integer>set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
		System.out.println("before using remove method"+set);
		set.remove(20);
		System.out.println("after remove method "+set);
		set.remove(50);//it will not throw an exception if the value is  not present in the set
		
		Set set2=new HashSet<Integer>();
		set2.add(60);
		set2.addAll(set);
		System.out.println("Set2 elements "+set2);
		set2.removeAll(set);//it takes one parameter as a Collection
		System.out.println("Set2 elements after removeAll method "+set2);
		System.out.println(set2.size());//1
		System.out.println(set.size());//3
		
		ArrayList<Integer> number=new ArrayList<Integer>(set);//with pass by value
		System.out.println(number.get(0));												
		System.out.println(number.get(1));
		
		
		List car=new ArrayList();
		car.add("Toyota");
		car.add("Mercedes");
		car.add("Audi");
		car.add("Mercedes");
		System.out.println(car);
		//to convert from List to set
		Set carName=new HashSet(car);
		
		System.out.println(carName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
