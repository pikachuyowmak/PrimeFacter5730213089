import java.util.Scanner;

class Prime {

   public static void main(String[] args) {
  	  
  	  Prime obj = new Prime();
  	  obj.Primenumber();

   }  
   


   public void  Primenumber(){  
   	
  	   Scanner scan = new Scanner(System.in); 
  	        int number;  
      do{ 
      		System.out.print("Input Number : ");  
      		number = scan.nextInt();
      		int count=0;
     	for (int i = 2; i <= number; i++) { 
      		while(number %i == 0){
          		number/=i;   
          		count++;
         		if (count==1) { 
            		System.out.print("  " + i);  
         }
           		else{  
            		System.out.print(" x " + i); 
          }
         } 
          
          
          
      }System.out.println("  " );  
    }while(number!=0);
}
}