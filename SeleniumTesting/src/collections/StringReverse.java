package collections;

public class StringReverse {

	public static void main(String[] args) {
		String str ="TejaSri";
		for(int i=str.length()-1;i>=0;i--) {
		
			char revstr=str.charAt(i);
			//revstr=revstr.append(revstr);
			
			System.out.print(revstr);
			
		}
		
	}

}
