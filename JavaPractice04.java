// To print strings letters , numbers and spaces
import java.util.Scanner;

public class JavaPractice04 {
    public static void main(String[] args) {
        int let,num,spac,other;
        let = num = spac = other = 0;
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("Enter your sentense !");
        s=sc.nextLine();
    for (int i=0;i<s.length();i++) {
        if (Character.isLetter(s.charAt(i))) {
            let++;
        }
       else if (Character.isSpaceChar(s.charAt(i))) {
            spac++;
        }
        else if (Character.isDigit(s.charAt(i))) {
            num++;
        }
        else {
            other++;
        }
    }
    System.out.println("Letters :"+let+"\nNumbers :"+num+"\nSpaces :"+spac+"\nOthers :"+other);
    }
}
