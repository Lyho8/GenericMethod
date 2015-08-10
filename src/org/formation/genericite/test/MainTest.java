package org.formation.genericite.test;

import java.util.*;

import org.formation.genericite.*;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = Arrays.asList("De Gaulle", "Pompidou", "Giscard d'Estain", "Mitterand", "Chirac");
		List<Number> l2 = Arrays.asList(1, 10.0, 20.1, 5000, 33);
		List<MyType> l3 = Arrays.asList(new MyType("joe"), new MyType("Averell"));
		
		System.out.println(ElementUtil.getLast(l1));
		System.out.println(ElementUtil.getLast(l2));
		System.out.println(ElementUtil.getLast(l3));
		

	}

}
