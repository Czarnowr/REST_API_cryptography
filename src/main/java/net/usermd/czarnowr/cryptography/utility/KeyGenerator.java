package net.usermd.czarnowr.cryptography.utility;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class KeyGenerator {
    private static char[] latinAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static BiMap<Character, Character> keyWordSystem(String keyWord) {
        Set<Character> keySet = new LinkedHashSet<>();
        for (int i = 0; i < keyWord.length(); i++) {
            keySet.add(keyWord.charAt(i));
        }
        for (char letter : latinAlphabet) {
            keySet.add(letter);
        }

        BiMap<Character, Character> keyMap = HashBiMap.create();

        Iterator<Character> iterator = keySet.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            Character letter = iterator.next();
            keyMap.put(latinAlphabet[index], letter);
            index++;
        }

        return keyMap;
    }

    public static BiMap<Character, Character> rotationSystem(int moveBy) {
        BiMap<Character, Character> keyMap = HashBiMap.create();

        for (int i = 0; i < 26; i++) {
            keyMap.put(latinAlphabet[i], (latinAlphabet[(i + moveBy) % 26]));
        }
        return keyMap;
    }
}
