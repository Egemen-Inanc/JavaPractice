package recapDemo2;

public class Main {

	public static void main(String[] args) {
     double[] myList = {1.2,1.3,4.3,5.6};
     double max = myList[0];
     double total = 0;
     for (double number:myList)
     {
    	 if(max<number)
    		 max=number;
    	 total = total+number;
     }
     System.out.println("Sum of all numbers in the list is "+total);
     System.out.println("Number with the maximum value in the list is "+ max);
	}

}
