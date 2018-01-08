public class Main
{
    public static void main(String args[])
    {
        Student a1 = new Student();
        Student a2 = new GoodStudent();
        Student a3 = new BadStudent();
        Student a4 = new AmazingStudent();

        print(a1);
        printStudentAns(a1);
        print(a2);
        printStudentAns(a2);
        print(a3);
        printStudentAns(a3);

        print(a4);
        printStudentAns(a4);

    }
    
    public static void printStudentAns(Student a)
    {
        String ans = a.howIsItGoing();
        System.out.println("How is it going? " + ans);
    }
    
    public static void print(Object a)
    {
        String s = a.toString();
        System.out.println(s);
    }
}