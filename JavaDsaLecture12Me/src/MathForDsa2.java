import java.util.Arrays;

public class MathForDsa2 {

	public static void main(String[] args) 
	{
//      countDigits(78);
//      countDigitsVialog(12);
//		armstrongNumber(153);
//		PalindromeSimple(1229);
//		printAllDivisors(24);
//		primeNumber(25);
		sieveAlgorithm(40);
	}

	public static void countDigits(int num)
	{
		if(num==0)
		{
			System.out.println("Digits are : 1");
			return;
		}
		int counter=0;
		
		while(num>0)
		{
			num/=10;
			counter++;
		}
		
		System.out.println("Digits are :"+counter);
	}

    public static void countDigitsVialog(int num)

    
    {
    	if(num==0)
		{
			System.out.println("Digits are : 1");
			return;
		}
    	
    	int count = (int)(Math.log(num)/Math.log(10))+1;
    	System.out.println("Digits are :"+count);
    }

    public static void armstrongNumber(int num)
    {
    	int res=0;
    	int copy =num;
    	while(num>0)
    	{
    		int digit =num%10;
    		res=res+(int)Math.pow(digit, 3);
    		num/=10;
    	}
    	
    	if(copy==res)
    	{
    		System.out.println(copy+" Number is Armstrong");
    	}
    	else
    	{
    		System.out.println(copy+" Number is not Armstrong");

    	}
    	
    	
    }
    
    public static void PalindromeSimple(int num)
    {
    	
    	int original=num;
    	int reversed=0;
    	
    	while(num > 0)
    	{
    		int digit = num%10;
    		reversed=reversed*10+digit;
    		num/=10;
    		
    	}
    	
    	if(original==reversed)
    	{
    		System.out.println(original+" Number is Pallindrome");
    	}
    	else
    	{
    		System.out.println(original+" Number is not Pallindrome");
    	}
    	
    }

    public static void printAllDivisors(int num)
    {
    	int counter =1;
    	int sqroot=(int)Math.sqrt(num);
    	
    	while(counter <= sqroot)
    	{
    		if(num%counter==0)
    		{
    			System.out.println(counter + " is a divisor of "+num);
    			int otherNumber = num/counter;
    			if(otherNumber!=counter)
    			{
    				System.out.println(otherNumber +" is a divisor of "+num);
    			}
    		}
    		counter++;
    	}
    }

    public static void primeNumber(int num)
    {
    	int counter=2;
    	int sqroot=(int)Math.sqrt(num);
    	while(counter <= sqroot)
    	{
    		if(num%counter==0)
    		{
    			System.out.println(num+" is not a prime number");
    			return;
    		}
    		
    		counter++;
    	}
    	
    	
    	System.out.println(num+" is a prime number");
    }

    public static void sieveAlgorithm(int num){
        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr, true);
        int counter = 2;
        while (counter<=num){
            if(arr[counter] == true){
                for(int factor = counter+counter; factor<=num; factor+=counter){
                    arr[factor] = false;
                }
            }
            counter++;
        }

        for(int i=2;i<=num;i++){
            System.out.println(i +" : "+ arr[i]);
        }
    }
}





