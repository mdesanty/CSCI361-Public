import java.util.*;

public class NoIfs
{
  public static void main(String args[])
  {
    NoIfs obj = new NoIfs();
    obj.go();
  }

  private NoIfs()
  {

  }

  private void go()
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a state abbreviation: ");
    String abbr = in.next();

    String stateName = abbrToName(abbr);
    System.out.println(stateName);
  }

  private String abbrToName(String abbr)
  {
    if (abbr.equalsIgnoreCase("VT"))
      return "Vermont";
    else if (abbr.equalsIgnoreCase("MA"))
      return "Massachusetts";
    else if (abbr.equalsIgnoreCase("ME"))
      return "Maine";
    else if (abbr.equalsIgnoreCase("NH"))
      return "Hew Hampshire";
    else if (abbr.equalsIgnoreCase("CT"))
      return "Connecticut";
    else if (abbr.equalsIgnoreCase("RI"))
      return "Rhode Island";       
    else
      return "Sorry, I only know New England states.";
  }
}
