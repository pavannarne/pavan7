package pavan7;

public class Addition

{
    
	public static void main(String[] args)

	{
      
		int i = 2;
		int j = 3;

		int sum = sum(i, j);
		System.out.println("The value of i is :" + i);
		System.out.println("The value of j is :" + j);

		System.out.println("The sum of i and j is:" + sum);

	}

	public static int sum(int i, int j) {

		return i + j;
	}

}
