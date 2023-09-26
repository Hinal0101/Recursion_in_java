public class move_x_end {
    public static void movex(String str,int idx, String newstr,int count){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        if(str.charAt(idx)=='x'){
            count+=1;
            movex(str,idx+1,newstr,count);
        }
        else{
            newstr+=str.charAt(idx);
            movex(str,idx+1,newstr,count);
        }
       
    }

    public static void main(String args[]){
        movex("axbcxxd",0,"",0);
    }
}
