public class sorted_or_not {
    public static boolean sort(int arr[],int idx){
        boolean ans=false;
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return sort(arr,idx+1);
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        int arr[]={1,3,3};
        System.out.println(sort(arr,0));
    }
}
