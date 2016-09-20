public class Main
{
  public static void main(String[] args)
  {
      Object p1 = new Person("Mark", 47);
      Object p2 = new Person("Sally", 52);

      System.out.println(p1.toString());
      System.out.println(p2.toString());

      System.out.println(Person.getCount());
  }
}
