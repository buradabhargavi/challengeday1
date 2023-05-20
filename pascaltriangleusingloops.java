import java.util.*;
class pascaltriangleusingloops{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt(); //reads an integer input from the user using the Scanner class.
        
     for(int i = 0; i < rows; i++) {    
            for(int k = 1; k < rows - i; ++k) {  
                System.out.print(" ");  //to get space at the start
            }  
            int number =1; 
            for(int j=0;j<=i ;j++){   
               
            System.out.print(" "+number);  
            number = number*(i-j)/(j+1);   //formula to the number which we have to print
            
            }
            System.out.println(); //to get next line
        }     
    }  
   }  