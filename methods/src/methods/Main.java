package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9};
        findNumber(numbers,5);
        findNumber(numbers,51);

	}
	public static void findNumber(int[] numberArr,int target)
	{
      boolean isPresent = false;
	  for(int number:numberArr)
	  { 
		  if(number==target)
			  isPresent = true;
	  }
	  if(isPresent==true)
	  {
		  System.out.println(target+" is present in the array!");
	  }
	  else
	  {
		  System.out.println(target+" is not present in the array!");
	  }
	}

}
