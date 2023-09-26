public class first_last {
    public static int first=-1;
    public static int last=-1;
    public static void occurrence(String str,char c,int idx){
        
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(idx)==c){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        occurrence(str,c,idx+1);
    }
    public static void main(String args[]){
        String str="abaacdaefaah";
        char c='a';
        int idx=0;
        occurrence(str,c,idx);
    }
}
