package Sample;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
	

List<Integer> li = new ArrayList<>();
//li.add(10);
//li.add(30);
//li.add(50);
//System.out.println(li.get(0));
//li.add(0,60);
//System.out.println(li.get(0));
//li.set(0, 90);
//System.out.println(li.get(0));
//System.out.println(li.size());
//li.clear();
//System.out.println(li.size());
//li.subList(0, 20);
//System.out.println(li.size());
//List<Integer> l = new ArrayList<>();
//l.add(50);
//boolean l1 =li.retainAll(l);
//System.out.println(l1);

String name = "Samuel Ebinezer";
//char[] nam = name.toCharArray();
//for(int i=0;i<nam.length;i++) {
//	System.out.println(nam[i]);
//	}
//String na = name.substring(0,5);
//System.out.println(na);
String[] nam = name.split(" ");
for(int i=0;i<nam.length;i++) {
System.out.println(nam[i]);
}
}
}