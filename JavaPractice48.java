public class JavaPractice48 {
    public static void main(String[] args) {
        //get the value of the specific environment variable "PATH"
        System.out.println("Environment variable PATH :");
        System.out.println(System.getenv("PATH"));

        //get the value of the specified environment variable "TEMP"
        System.out.println("Environment variable TEMP :");
        System.out.println(System.getenv("TEMP"));

        //get the value of the specified environment variable "USERNAME"
        System.out.println("Environment variable USERNAME :");
        System.out.println(System.getenv("USERNAME"));
    }
}
