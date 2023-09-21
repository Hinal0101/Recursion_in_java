//  code 1
//  public class recursion3 {
//     public static int recursion(int s,int e,int sum){
//         if(s==6){
//             return sum;
//         }
//         sum+=s;
//         return recursion(s+1,e,sum);
//     }

//     public static void main(String args[]){
//         int ans=recursion(1,5,0);
//         System.out.println(ans);        
//     }
// }


// code 2
public class recursion_sum{
    public static void printsum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsum(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String args[]){
        printsum(1,5,0);
    }
}