
public class MathForDsa2 {

	public static void main(String[] args) 
	{
//         countDigits(78);
//         countDigitsVialog(12);
//		   armstrongNumber(153);
		PalindromeSimple(1229);
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
}




