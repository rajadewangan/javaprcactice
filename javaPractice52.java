import java.util.Scanner;

class dog{
    private  String name;
    private String breed;
    public dog(String name,String breed)
    {
        this.name = name;
        this.breed = breed;

    }
    public String getname()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setname(String newname)
    {
        name = newname;
    }
    public void setbreed( String newbreed)
    {
           breed = newbreed;
    }

}


public class javaPractice52 {
    public static void main(String[] args) {
        dog d1,d2;
        d1 = d2 = new dog("preeti","labra");
        System.out.println("want to change the name : y/n");
        Scanner sc = new Scanner(System .in);
       // char c = sc.next().charAt(0);
        System.out.println(d1.getname()+d1.getBreed());
        System.out.println(d1.getname()+d1.getBreed());
        System.out.println("Enter the new name and breed");
        String s =sc.nextLine();
        d1.setname(s);
        s=sc.nextLine();
        d2.setbreed(s);
        System.out.println(d1.getname()+d1.getBreed());
        System.out.println(d1.getname()+d1.getBreed());



             


    }
}
