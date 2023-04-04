package Sample;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetSample {
public static void main(String[] args) {

	Set<Object> st = new LinkedHashSet<>();
	st.add("asa");
	st.add("SAM");
	st.add(10);
	st.add(10.2f);
	
	for(Object sa : st) {
		System.out.println(sa);
	}
	
//	Object[] a =st.toArray();
//	String ab =a.toString();
//	System.out.println(ab);
//	System.out.println(a[1]);
//	for(Object b : a) {
//		System.out.println(b);
//	} 
}
}
