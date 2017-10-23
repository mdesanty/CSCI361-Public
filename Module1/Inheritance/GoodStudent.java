public class GoodStudent extends Student
{
    public GoodStudent()
    {}
    
    @Override
    public String toString()
    {
        return "I am a good student!";    
    }
    
    @Override 
    public String howIsItGoing()
    {
        return "Great! Give me more work!";
    }
    
}