import java.io.*;
import java.util.*;

public class SetInMap
{
    public static void main(String args[])
    {
        SetInMap obj = new SetInMap();
        obj.go();
    }
    
    private Map<Character, Set<String>> m_map = new HashMap<Character, Set<String>>();
    
    private void go()
    {
        readWords();
        printWords();
    }
    
    private void readWords()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("words.txt")))
        {
          String line =reader.readLine();
          while (line != null)
          {
            String word = line;
            word = cleanWord(word);
            char let = word.charAt(0);
            if (!m_map.containsKey(let))
                m_map.put(let, new HashSet<String>());
            m_map.get(let).add(word);
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
        for (char key : m_map.keySet())
            System.out.printf("%s -> %s%n", key, m_map.get(key));
    }
    
    private String cleanWord(String word)
    {
        return word.toUpperCase().trim();
    }
}

