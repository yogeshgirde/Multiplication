package com.app;

public class PrimeNumbers {
	public static void main(String[] args) {

		System.out.println("Prime number 1 to 100");
		for(int i=1;i<=100;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.print(i+" ");

		}
		}	
		}		
		
		
		
		
		
		///define limit
     /*   int limit = 100;

        System.out.println("Prime numbers between 1 and " + limit);

        //loop through the numbers one by one
        for(int i=1; i < 100; i++){

                boolean isPrime = true;

                //check to see if the number is prime
                for(int j=2; j < i ; j++){

                        if(i % j == 0){
                                isPrime = false;
                                break;
                        }
                }
                // print the number
                if(isPrime)
                        System.out.print(i + " ");
        }
	}
}*/
	/*
		//public class Prime {
		//   public static void main(String arg[])
		// {
		int count=0;

		for(int i=2;i<100;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j!=0)
				{
					count++;
					if(count==i-2)
					{
						System.out.print(i+" ");
					}
				}
			}
			count = 0;
		}
	}
	//}*/

//}
