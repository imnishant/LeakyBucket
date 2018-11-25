import java.util.Scanner;
public class LeakyBucket {
	
	static void LB(int I, int L, int Ta[])
	{
		int LCT = 1, X=0;
		int Y;
		//int rate = 2;
		for(int i=0 ; i<Ta.length ; i++)
		{
			//Y = X - (rate*(Ta[i] - LCT));
			Y = X - (Ta[i] - LCT);
			if(Y > L)
				System.out.println("At " + Ta[i] + "s Non Conforming Packet");
			else
			{
				X = Y + I;
				LCT = Ta[i];
				System.out.println("At " + Ta[i] + "s Conforming Packet");
				System.out.println("Bucket size is " + X);
			}
		}
	}
	
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter value of n");
		n = sc.nextInt();
		int Ta[] = new int[n];
		System.out.println("Enter the values of Ta");
		for (int i = 0; i < n; i++) 
			Ta[i] = sc.nextInt();
			
		System.out.println("Enter I and L");
		int I = sc.nextInt();
		int L = sc.nextInt();
		
		LB(I, L, Ta);
	}
}
