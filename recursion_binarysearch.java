public class recursion_binarysearch {
    public static int bs(int arr[],int target,int left,int right){
        if(left>right){
            return -1;
        }
        else{
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else{
                if(target<arr[mid]){
                    return bs(arr,target,left,mid-1);
                }
                else{
                    return bs(arr,target,mid+1,right);
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[]={1,3,5,7,8,10};
        int left=0;
        int right=arr.length-1;
        System.out.println(bs(arr,10,left,right));
    }
}
