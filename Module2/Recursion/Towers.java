public class Towers
{
    public static void main(String args[])
    {
        new Towers().go();
    }

    public void go()
    {
        moveTower(3, "A", "B", "C");
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
        System.out.printf("Moving disk from %s to %s.%n", from, to);
    }
}