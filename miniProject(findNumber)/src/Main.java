
public class Main {
    static boolean findNumber(int[] numberList, int target)
    {
    	boolean found=false;
    	for(int i=0;i<numberList.length;i++)
    		if(numberList[i]==target)
    		{
    			System.out.println("target number:"+target+", found in the list!");
    			found=true;
    		}
    	return found;
    }
	public static void main(String[] args) {
		int[] testList = {1,2,5,7,9};
		for (int i=0;i<10;i++)
		      findNumber(testList,i);

	}

}
