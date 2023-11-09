public class recursion_x_power_n {
    public static int power_n(int x,int n){
        if(x==0){       //base case 1
            return 0;
        }
        if(n==0){       //base case 2
            return x;
        } 
        return x*power_n(x,n-1);  //kaam
    }

    public static void main(String args[]){
        System.out.println(power_n(2,5));
    }
}
