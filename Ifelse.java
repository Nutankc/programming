public class Ifelse {
    public static void main(String[] args) {
     int num1=20;
     int num2= 5;
     // 1
     
     if(num1==num2)
     {
        System.out.println(" num2 and num2 are equal ");
     }

    if (num1>num2)
    {
        System.out.println(" num1 is greater than num2");
    }
    
    if (num1>=num2) 
    {
    System.out.println("The num1 is greater or equal to num2");    
    }
    if(num1!=num2)
     {
        System.out.println(" num1 is not equal to num2 ");
     }


   // 2a
   
   int x=20, y=20, z= 10;
   //2a
   if (x==y && y==z) {
   System.out.println("All numbers are equal");
   }
   else
   {
      System.out.println("All the numnbers are not equal");
   }

   //2num2
   if(x==y  )
   {
      System.out.println("X and y are equal");
   }
   else if (y==z) 
   {
   System.out.println(" Y and Z are equal");   
   }


   // 2c
   if(x>y && x>z)
   {
      System.out.println("The x is greater than y and z");
   }

   //2d

   if (x>y) {

    System.out.println("The x is greater than y");
   }
   
   else if (y>z) {
      System.out.println("The y is greater than z");
   }

   // 2e

   if (x==y) {
      System.out.println("The X and Y are equal");   
   }
   else if (x==z) {
      System.out.println("The X and Z are equal");
      
   }     
  

   String name1= "Raj";
   String name2= "Ram";
   String name3= "Raj";
   // 3a
   if( name1==name2)
   {
      System.out.println("The name1 and name2 are equal ");
   }
   // 3num2
   if (name1!=name2) 
   {
      System.out.println("The name1 and name2 are not equal ");  
   }

   // 3c
   if (name1 == name2) {
      System.out.println("Name1 and Name2 are equal");
   }

   else if (name1==name3) {
      System.out.println("Name1 and Name3 are equal");
   }







} 
}
