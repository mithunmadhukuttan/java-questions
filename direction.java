package college;
import java.util.Scanner;
public class direction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		int a4 = 4;
		System.out.println("EAST=1");
		System.out.println("NORTH=2");
		System.out.println("WEST=3");
		System.out.println("SOUTH=4");
		System.out.println("1 is for right");
		System.out.println("-1 is for left");
		for (int i = 1;i<5;)
		{
			
			System.out.println("enter the direction:");
			int c=sc.nextInt();
			i=i+c;
			if (i>4)
			{
				i=1;
			}
			else if(i==0)
			{
				i=4;
			}
			System.out.println(i);
			if (i==a1)
			{
				System.out.println("EAST DIRECTION");
			}
			else if (i==a2)
			{
				System.out.println("NORTH DIRECTION");
			}
			else if (i==a3)
			{
				System.out.println("WEST DIRECTION");
			}
			else if (i==a4)
			{
				System.out.println("SOUTH DIRECTION");
			}
		}
		{
			System.out.println("Enter the value:");
			
		}
		
		

	}

}
