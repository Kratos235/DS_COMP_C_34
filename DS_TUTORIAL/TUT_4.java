package DS_TUTORIAL;
import java.util.Scanner;
public class TUT_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        StringBuffer str2 = new StringBuffer(str1);
        System.out.println("Number of characters in String object = "+str1.length());  // using String
        System.out.println("Number of characters in StringBuffer object = "+str2.length());  // using StringBuffer
 
        // finding number of vowels
        int vcount = 0;
        for(int i=0;i<str1.length();i++) {
            char c = str1.toLowerCase().charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vcount++;
            }
        }
        System.out.println("Number of vowels = "+vcount);

        String rev = "";                             // using String object
        for(int i=str1.length()-1;i>=0;i--) {
            rev += str1.charAt(i);
        }

        System.out.println("Reversed string using String concatenation = "+rev);    
        str2.reverse();
        System.out.println("Reversed string using StringBuffer reverse() method = "+str2);  // using StringBuffer
    }
}
