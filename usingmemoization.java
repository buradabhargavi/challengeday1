import java.util.*;
class usingmemoization{
   static HashMap<String,Integer>map = new HashMap<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row = sc.nextInt();
        int column=row; //reads an integer input from the user using the Scanner class.
        for (int i = 0; i < row; i++) {
            for(int k=0;k<row-i;k++){
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.print( number(i, j)+" ");
            }
            System.out.println();
        }
    } 
    
    public static int number(int row, int column) {
        String key = row + "" + column;
        if (column == 0 || column == row) {
            return 1;
        } else if(map.containsKey(key)){
            
            return map.get(key);
            
        }
        else {
            int obtainedval=number(row - 1, column - 1) + number(row - 1, column);
            map.put(key,obtainedval);
            return obtainedval;
        }
    }

   }  