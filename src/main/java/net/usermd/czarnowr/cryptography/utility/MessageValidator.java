package net.usermd.czarnowr.cryptography.utility;

public class MessageValidator {
    public static boolean messageContainsLetters(String message) {
        String messageLowerCase = message.toLowerCase();
        boolean containsLetters = false;

        for (int i = 0; i < messageLowerCase.length(); i++) {
            char letter = messageLowerCase.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                containsLetters = true;
                break;
            }
        }

        return containsLetters;
    }
}
