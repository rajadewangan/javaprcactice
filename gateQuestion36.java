import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class sample1{
    public sample1(){
        System.out.println("Hii this is default constructor ");
    }
    public sample1(int a,int b){
        System.out.println("Multiplication of "+a+" and "+b+" is "+a*b);
    }
    public sample1(String s)
    {
        System.out.println("String is "+s);
    }
}
public class gateQuestion36 {
    public static void main(String[] args) throws IOException {
        int ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the numbers from 1 to 3 ");
        ch=Integer.parseInt(br.readLine());
        if(ch==1)
            new sample1();
        else if(ch==2)
            new sample1(10,20);
        else if(ch==3)
            new sample1("JAVA");
        else
            System.out.println("Wrong Number");
    }
}
