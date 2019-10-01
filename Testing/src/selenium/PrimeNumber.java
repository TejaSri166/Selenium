package selenium;

public class PrimeNumber {

	public static void main(String[] args) {
		int count=0,i=1,lower=1,upper=100;
		while(lower<=upper){
		i=1;
		count=0;
		while(i<=upper){
		if(upper%i==0){
		count++;
		}
		i++;
		}
		if(count==2){
		System.out.println(upper);
		}
		upper++;
		}
		}
		




	}


