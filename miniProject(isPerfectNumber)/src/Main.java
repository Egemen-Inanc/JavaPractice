
public class Main {

	static void isPerfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
			if(num%i==0)
				sum+=i;
		if(sum==num)
		 System.out.println(num+" is a perfect number.");
		else
		 System.out.println(num+" is not a perfect number.");
	}
	public static void main(String[] args) {
		for(int i=0;i<29;i++)
			isPerfect(i);

	}

}
