package july19th2025;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String g4="aacckoopeecar";

        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<g4.length();i++)
        {
            map.put(g4.charAt(i),map.getOrDefault(g4.charAt(i),0)+1);
        }

        System.out.println(map);

        //Fetch the list of entries whose value is 1

        List<Map.Entry<Character,Integer>> uniqueEntries=map.entrySet().stream().filter(s-> s.getValue()==1)
                .collect(Collectors.toList());

        System.out.println(uniqueEntries);

        String uniqueData=uniqueEntries.stream().map(s-> s.getKey()).map(s->String.valueOf(s))
                .collect(Collectors.joining(""));

//        System.out.println(g4.replaceAll(uniqueData,""));


        for(int i=0;i<g4.length();i++)
        {
            for(int j=0;j<uniqueData.length();j++)
            {
                if (uniqueData.charAt(j)==g4.charAt(i))
                {
                    System.out.println("First Non Repeating Character: "+uniqueData.charAt(j));
                    System.exit(0);
                }
            }
        }

    }
}
