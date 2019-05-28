package net.usermd.czarnowr.cryptography.service;

import com.google.common.collect.BiMap;
import net.usermd.czarnowr.cryptography.model.Message;
import net.usermd.czarnowr.cryptography.utility.Coder;
import net.usermd.czarnowr.cryptography.utility.CoderInstruction;
import org.springframework.stereotype.Service;

@Service
public class DecodeService {

    public Message substituteLetters(String messageToDecode, BiMap<Character, Character> key) {
        Message message = new Message();
        message.setDecodedMessage(Coder.code(messageToDecode, key, CoderInstruction.DECODE));

        return message;
    }
}
