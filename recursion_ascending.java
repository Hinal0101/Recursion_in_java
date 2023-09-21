public class recursion_ascending {
    public static void recursion(int n){

        if(n==6){
            return;
        }
        System.out.println(n);
        recursion(n+1);
    }

    public static void main(String args[]){
        recursion(1);
    }
}
