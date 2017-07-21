import java.util.*;
import java.io.*;

public class MapWords
{
  private Map<String, Integer> m_map = new HashMap<String, Integer>();
  private Map<Integer, List<String>> m_map2 = new HashMap<Integer, List<String>>();

  private final int MIN_COUNT = 20;
  private final int MIN_SIZE = 4;

  public static void main(String args[])
  {
    MapWords main = new MapWords();
    main.mapWords();
    main.printCommonWords();

    main.mapCounts();
    main.printWordsByCount();
  }

  private void mapWords()
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
          if (word.length() < MIN_SIZE)
            continue;
          if (!m_map.containsKey(word))
            m_map.put(word, 0);
          int count = m_map.get(word);
          m_map.put(word, count+1);
        }
        line = reader.readLine();
      }
    }
    catch (IOException x)
    {
      System.err.format("IOException: %s%n", x);
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

  private void printCommonWords()
  {
    for (String key : m_map.keySet())
    {
      int count = m_map.get(key);
      if (count >= MIN_COUNT)
        System.out.printf("%s -> %s%n", key, count);
    }
  }


// ***********************************************
// Lecturcize:
// Complete these two methods.
// ***********************************************

  // ***********************************************
  // This method should map words to the number of
  // times they appear in the file.  For example:
  // 20 -> [BEER, TENDER, BOIL]
  // You should NOT read the file a second time.
  // Instead populate the map (map2) from the map that
  // was already created.
  // ***********************************************
  private void mapCounts()
  {
  }

  // ***********************************************
  // Use a for each loop here!
  // Here is the expected output:
  // 20 -> [BEER, TENDER, BOIL]
  // 21 -> [OVER, MAKE, AHEAD, CLOVES, KEYWORDS, TOMATO]
  // 22 -> [MIXTURE]
  // 23 -> [SERVES]
  // 24 -> [MEDIUM, MINCED]
  // 25 -> [CHILIES, HOURS]
  // 26 -> [GREEN, SPICY]
  // 27 -> [SAUCE]
  // 28 -> [COVER, TASTE]
  // 29 -> [TOMATOES]
  // 30 -> [INTO]
  // 33 -> [OREGANO]
  // 162 -> [CHILI]
  // 35 -> [PORK, CUMIN]
  // 37 -> [ABOUT]
  // 39 -> [STIR, POWDER]
  // 42 -> [WATER, LARGE, MEAT]
  // 43 -> [ONIONS]
  // 46 -> [SIMMER]
  // 47 -> [COOK]
  // 48 -> [SALT]
  // 50 -> [BEEF, CHOPPED]
  // 51 -> [WITH, PEPPER, UNTIL]
  // 53 -> [GROUND, HEAT]
  // 54 -> [GARLIC, BEANS]
  // 60 -> [MINUTES]
  // ***********************************************
  private void printWordsByCount()
  {
  }
}
