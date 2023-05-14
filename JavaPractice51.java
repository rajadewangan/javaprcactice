class person {
    private String name;
    private int age;
    public person(String s,int a)
    {
        this.name = s;
        this.age = a;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }

}
public class JavaPractice51 {
    public static void main(String[] args) {
      person a,b;
         a = new person("raja",19);
         b = new person("tara",19);
        System.out.println("hello "+a.getname()+"your age is :"+a.getage());
        System.out.println("hello "+b.getname()+"your age is :"+b.getage());

    }
}
