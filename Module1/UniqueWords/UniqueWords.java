import java.io.*;
import java.util.*;

public class UniqueWords
{
    private static final int MIN_SIZE = 4;
    private static final char STARTS_WITH = 'S';
  
    public static void main(String args[])
    {
        UniqueWords obj = new UniqueWords();
        obj.go();
    }
    
    private Set<String> m_set = new HashSet<String>();
    
    private void go()
    {
        readWords();
        printWords();
    }
    
    private void readWords()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("chili.txt")))
        {
          String line =reader.readLine();
          while (line != null)
          {
            String words[]  = line.split(" ");
            for (String word : words)
            {
                word = cleanWord(word);
                if (word.isEmpty() || 
                    word.length() < MIN_SIZE ||
                    word.charAt(0) != STARTS_WITH)
                        continue;
                m_set.add(word);
            }
            line = reader.readLine();
          }
        }
        catch (IOException x)
        {
          System.err.printf("IOException: " + x + "%s%n", x);
        }
    }
    
    private void printWords()
    {
        for (String word : m_set)
        {
            System.out.printf("Word : %s%n", word);
        }
        
    }
    
    private String cleanWord(String word)
    {
        String ret = "";
        word = word.toUpperCase();
        for (Character c : word.toCharArray())
        {
            if (Character.isLetter(c))
                ret = ret + c;
        }
        return ret.trim();
    }
}

