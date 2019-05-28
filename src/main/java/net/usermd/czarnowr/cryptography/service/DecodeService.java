package net.usermd.czarnowr.cryptography.service;

import com.google.common.collect.BiMap;
import net.usermd.czarnowr.cryptography.exception.EmptyStringException;
import net.usermd.czarnowr.cryptography.exception.NoLettersException;
import net.usermd.czarnowr.cryptography.model.Message;
import net.usermd.czarnowr.cryptography.utility.Coder;
import net.usermd.czarnowr.cryptography.utility.CoderInstruction;
import net.usermd.czarnowr.cryptography.utility.MessageValidator;
import org.springframework.stereotype.Service;

@Service
public class DecodeService {

    public Message substituteLetters(String messageToDecode, BiMap<Character, Character> key) throws EmptyStringException, NoLettersException {
        if (messageToDecode.isEmpty()){
            throw new EmptyStringException();
        }
        if(!MessageValidator.messageContainsLetters(messageToDecode)){
            throw new NoLettersException();
        }

        Message message = new Message();
        message.setResponse(Coder.code(messageToDecode, key, CoderInstruction.DECODE));

        return message;
    }
}
