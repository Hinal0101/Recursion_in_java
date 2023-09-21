public class recursion_xpn_logn{
    public static int calcpow(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0)
            return calcpow(x, n/2)*calcpow(x, n/2);
        else
            return calcpow(x,n/2)*calcpow(x, n/2)*x;
    }
    public static void main(String args[]){
        System.out.println(calcpow(2,5));
    }
}
