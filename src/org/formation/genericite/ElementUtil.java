package org.formation.genericite;

import java.util.*;

public class ElementUtil {
	
	private ElementUtil(){}
	
	public static <T> T getLast(List<T> l){
		T res = null;
		
		for(T t: l){
			res = t;
		}
		
		return res;
	}
}
