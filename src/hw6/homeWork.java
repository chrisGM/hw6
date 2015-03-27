package hw6;
import java.util.*;
public class homeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		/*int x = 2;
		int y = 2;
		int s = 0;
		if (x>0)
			s++;
		else if (y>0)
			s++;
		System.out.println(s);

		if ( 1 + x > Math.pow(x, Math.sqrt(2)))
		{ y = y + x; }
		System.out.println(y);
		System.out.println(x);
		
		if ( x == 1 ) { y++; }
		*/
		int sum = 0;
		System.out.println("Please enter X: ");
		if (scan.hasNextInt())
		{
			int x = scan.nextInt();
			sum = sum + x;
			System.out.println(sum);
		}
		else
		{
			System.out.println("Bad input for x");
		}
		
		System.out.println("Enter Grade");
			int grade = scan.nextInt();
		String letterGrade = "F";
		if (grade >= 90)
			{letterGrade = "A";
			System.out.println(letterGrade);}
		else if (grade >= 80)
			{letterGrade = "B";
			System.out.println(letterGrade);}
		else if (grade >= 70)
			{letterGrade = "C";
			System.out.println(letterGrade);}
		else if (grade >= 60)
			{letterGrade = "D";
			System.out.println(letterGrade);}
		else
			System.out.println(letterGrade);
		
		double z = Math.sqrt(2);
		double z1 = 2;
		if (z*z == z1)
			System.out.println("z "+z);
		else 
			System.out.println("z1 "+z1);
		
		
	}

}
