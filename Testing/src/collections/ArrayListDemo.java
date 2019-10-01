package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ArrayListDemo {

	public static void main(String[] args) {
		Stack <String> al=new Stack <String>();
		al.add("10");
		al.add("teja");
		al.add("sri");
		al.add("ponnuru");
		al.add("jagan");
		al.add("janaki");
		al.add("venkata");
		al.add("krishna");
		al.add("murthy");
		al.add("ssss");
		System.out.println("List:"+al);
		System.out.println("List:"+al.size());
		System.out.println("***************");
		al.add(2,"chitti");
		System.out.println("List:"+al);
		System.out.println("List:"+al.size());
		System.out.println("**************");
		al.set(2,"dull");
		System.out.println("List:"+al);
		System.out.println("List:"+al.size());
		System.out.println("***********");
		System.out.println("List:"+al.contains("xys"));
		System.out.println("******");
		al.clear();
		System.out.println(al);
		
		}
	


	}


