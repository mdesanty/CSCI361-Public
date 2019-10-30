public class Towers
{
    public static void main(String args[])
    {
        new Towers().go();
    }

    private int count = 0;

    public void go()
    {
        moveTower(13, "A", "B", "C");
        System.out.printf("%s disk moves", count);
    }

    public void moveTower(int height, String from, String to, String via)
    {
        if (height >= 1)
        {
            moveTower(height-1,from,via,to);
            moveDisk(from,to);
            moveTower(height-1,via,to,from);
        }
    }

    public void moveDisk(String from, String to)
    {
        count++;
        System.out.printf("Moving disk from %s to %s.%n", from, to);
    }
}