		
public class Rectangle {
   int length ;
   int breadth ;
 
   Rectangle ()
   {
	   System.out.println("Constructor with zero parameter called " );
	   length = breadth = 0;
	   
   }
   Rectangle (int side)
   {
	   System.out.println("Constructor with one parameter called " );
	   length = breadth = side;
	   
   }
   Rectangle (int l,int b)
   {
	   System.out.println("Constructor with zero parameter called " );
	   length = l ;
	   breadth = b;
	   
   }
   int area1()
   {
	   System.out.println(length*breadth );
	   return(length*breadth);
   }
   
}


