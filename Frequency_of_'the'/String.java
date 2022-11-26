import java.util.*;
public class Frequency_Of_the {
    public static void main(String[] args) {
        int f=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        String str2="";
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            if(ch!=' ')
                str2=str2+ch;
                else{
                    if(str2.compareTo("the")==0)
                        f=f+1;
                        str2="";
                }
        }
        System.out.println("Total frequency of the is"+ f);
    }
    
}
