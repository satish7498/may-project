package loops;

public class ConshtructorWhileLoop {
	int a =1;
	public ConshtructorWhileLoop() {
		
		while(a<=30) {
			if(a%2==0) {
				System.out.println("Even number :" +a);
				
			}
			
			else {
				System.out.println("odd number :" +a);
				
			}
			a++;
		}
		
	}
	
	
	public static void main(String[] args) {
		ConshtructorWhileLoop obj = new ConshtructorWhileLoop();
		
		
	}

}
