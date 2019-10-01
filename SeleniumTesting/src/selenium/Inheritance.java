package selenium;
class Parent {
	int a=20;
	int b=50;
	int c=a+b;
	void addition() {
	System.out.println(c);
}
}
class SubClass extends Parent{
	int d=60;
	int e=70;
	int f=d-e;
	void subtraction() {
	System.out.println("The subtraction of d and e values "+f);
}
}

public class Inheritance{
	public static void main(String[] args) {
		SubClass sc=new SubClass();
		System.out.println(sc.f);
		sc.subtraction();
		System.out.println(sc.c);
		sc.addition();
		


	}

}
