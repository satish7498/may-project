package loops;

public class DoWhileLoopsEvenNumber {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		do {
			if(a%2==0) {
				System.out.println("Even number :"+a);
				a++;
				
			}
			else {
				System.out.println("Odd number :"+a);
				a++;
			}
		}
		while(a<=100);
		
	}

}
