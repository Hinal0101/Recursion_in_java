// Will print 5,4,3,2,1

public class recursion_descending{
    public static void recursion(int n){
        
        if(n==0){
            return;
        }
        System.out.println(n);
        recursion(n-1);
    }


    public static void main(String args[]){
        recursion(5);
    }
}