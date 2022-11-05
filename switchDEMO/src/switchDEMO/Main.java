package switchDEMO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char grade ='F';
        switch(grade)
        {
         case 'A':
         System.out.println("Congratulations you've passed the course with an"+" "+grade+" "+"the highest possible grade!");
         break;
         case 'B':
         System.out.println("You've passed the course, your achieved grade is  "+grade + ". Good work.");
         break;
         case 'C':
         System.out.println("You've passed the course, your achieved grade is  "+grade+". Satisfactory, there is room for improvement.");
         break;
         case 'D':
         System.out.println("You've passed the course, your achieved grade is  "+grade+". Poor performance, should be improved.");
         break;
         case 'F':
         System.out.println("You've failed this course by recieving an "+ grade);
         break;
         default:
         System.out.println("You've entered an invalid grade! Remember grades entered should be uppercase.");
         
             
        }
	}

}
