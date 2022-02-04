package SStream;

import java.util.Collections;

import java.util.*;
import java.util.stream.Stream;;;


public class Program {

	public static void main(String[] args) {
		 java.util.ArrayList<String> cities = new ArrayList<String>();
		 Collections.addAll(cities, "Moskow","London","Kiev","Peckin");
		 cities.stream()
		 	.filter(s->s.length()==6)
		 	.forEach(s->System.out.println(s));

	}

}
