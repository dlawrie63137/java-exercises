package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class CharCount {
    public static void main(String[] args) {
        // write code in here that you want to execute
        // declare variables

        Integer letterCount;
        HashMap<Character, Integer> characters = new HashMap<>();
        String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan " +
            "sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. " +
            "Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, " +
            "dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = testString.toCharArray();

        for ( Character c : charactersInString)
            if (characters.containsKey(c)) {
                letterCount = characters.get(c);
                letterCount += 1;
                characters.replace(c, letterCount);
            } else {
                letterCount = 1;
                characters.put(c, letterCount);
            }

        /* Display content using Iterator*/
        Set set = characters.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print(mentry.getKey() + " : ");
            System.out.println(mentry.getValue());
        }


    }
}
