package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class findd {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("/home/cgi/Desktop/Java assignment/pe3/src/com/company/sam.txt"));        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            if (!wordCounts.containsKey(next)) {
                wordCounts.put(next, 1);
            } else {
                wordCounts.put(next, wordCounts.get(next) + 1);
            }
        }        for (String word : wordCounts.keySet())
        {
            int count = wordCounts.get(word);
            char[] chars = word.toCharArray();
            int flag = 0;
            for (int i=0;i<chars.length;i++) {
                if(Character.isLetter(chars[i])) {
                    flag++;
                }
                if(flag==chars.length)
                {
                    System.out.println(word+ "-" + count );
                }

            }
        }
    }
}