package net.usermd.czarnowr.cryptography.service;

import com.google.common.collect.BiMap;
import net.usermd.czarnowr.cryptography.model.Message;
import net.usermd.czarnowr.cryptography.utility.Coder;
import net.usermd.czarnowr.cryptography.utility.CoderInstruction;
import org.springframework.stereotype.Service;

@Service
public class EncodeService {

    public Message substituteLetters(String messageToEncode, BiMap<Character, Character> key) {
        Message message = new Message();
        message.setEncodedMessage(Coder.code(messageToEncode, key, CoderInstruction.ENCODE));

        return message;
    }
}
