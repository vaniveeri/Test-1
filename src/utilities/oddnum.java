package utilities;

import java.util.Scanner;

public class oddnum implements Printable{
	int sumOdd = 0;
	int odd_count = 0;
	int Size;
	int [] a;
	@Override
	public int getSum() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		a = new int[Size];
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (int i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
        for(int i = 0; i < Size; i++)
        {
            if(a[i] % 2 != 0)
            {
                sumOdd = sumOdd + a[i];
            }
           
        }
		return 0;
	}

	@Override
	public int getcount() {
		// TODO Auto-generated method stub
		System.out.print("\n List of Odd Numbers in this Array are :"); 
		for(int i = 0; i < Size; i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.print(a[i] +" ");
				odd_count++;
			}
		}		
		
		return 0;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("\n Total Number of Odd Numbers in this Array = " + odd_count);
		System.out.println("Sum of even numbers="+sumOdd);
		
	}

}
