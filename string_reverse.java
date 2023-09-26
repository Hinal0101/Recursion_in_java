public class string_reverse {

    public static void p_rev(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        p_rev(str, idx-1);
    }
    public static void main(String args[]){
        String str="string reverse";
        p_rev(str,str.length()-1);
    }
}
