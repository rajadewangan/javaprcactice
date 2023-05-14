import java.nio.charset.Charset;

public class JavaPractice07 {
    public static void main(String[] args) {
        System.out.println("List of available character set in java :");
        for(String str : Charset.availableCharsets().keySet())
        System.out.println(str);
    }
}
