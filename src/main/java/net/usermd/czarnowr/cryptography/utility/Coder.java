package net.usermd.czarnowr.cryptography.utility;

import com.google.common.collect.BiMap;

public class Coder {
    public static String code(String messageToCode, BiMap<Character, Character> key, CoderInstruction instruction) {
        // string converted to lower case
        String messageLowerCase = messageToCode.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        // for each character
        for (int i = 0; i < messageToCode.length(); i++) {
            char character = messageLowerCase.charAt(i);

            // if letters - use key to encode
            if (character >= 'a' && character <= 'z') {
                if (instruction.equals(CoderInstruction.ENCODE)) {
                    stringBuilder.append(key.get(messageLowerCase.charAt(i)));
                } else if (instruction.equals(CoderInstruction.DECODE)) {
                    stringBuilder.append(key.inverse().get(messageLowerCase.charAt(i)));
                    // if not letters - copy
                }
            } else {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }
}
