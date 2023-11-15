Public class LinearSearch1
{  
  Public static void main(String args[])  
  {  
Inti, limit, key;  

    Scanner sc = new Scanner(System.in);  
System.out.println(“Enter the limit of numbers:”);  
    Limit = sc.nextInt();   
Int array[] = new int[limit];

System.out.println(“Enter “ +limit + “ numbers:”);  

    For (i = 0; i< limit; i++)  
      Array[i] = sc.nextInt();  

System.out.println(“Enter the search element:”);  
    Key = sc.nextInt();  

    For (i = 0; i< limit; i++)  
    {  
      If (array[i] == key)      
      {  
System.out.println(“The search element “+ key +” is found at location “+ (i+1));
          Break;  
      }  
   }  
   If (i == limit)  
System.out.println(“The search element “+ key +” is not found”);
  }  
}  
