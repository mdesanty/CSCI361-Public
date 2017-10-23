public class BadStudent extends Student
{
    public BadStudent()
    {}
    
    @Override
    public String toString()
    {
        return "I am bad student!";    
    }
    
    @Override
    public String howIsItGoing()
    {
        return "Ummm, I did not start the work yet.";
    }
    
}