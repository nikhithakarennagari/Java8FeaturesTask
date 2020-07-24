package com.vnrvjiet.java8Task;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringTask {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("amul");
		list.add("app");
		list.add("amcat");
		list.add("ali");
		List<String> b=list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
		System.out.print(b);

	}

}
