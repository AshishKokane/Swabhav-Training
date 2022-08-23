import java.util.*;                           // importing util package as it conatins scanner package
class Fibonacci{
	public static void main(String[] args) {

		int first, second, temp;
		first = 0;
		second = 1;
		temp =0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Range For Fibonacci Series");

		int range = sc.nextInt();


		if (range == 0){
			System.out.println(first);
		
		}
	
		else {
			System.out.println(first);
			System.out.println(second);
			for (int i = 2; i <= range; i++)
			{
				temp = first + second;
				System.out.println(temp);
				first = second;
				second = temp;
				
			}
	
		}


	}
}