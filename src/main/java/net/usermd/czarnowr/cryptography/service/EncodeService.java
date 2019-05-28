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
public class EncodeService {

    public Message encode(String messageToEncode, BiMap<Character, Character> key) throws EmptyStringException, NoLettersException {
        if (messageToEncode.isEmpty()){
            throw new EmptyStringException();
        }
        if(!MessageValidator.messageContainsLetters(messageToEncode)){
            throw new NoLettersException();
        }

        Message message = new Message();
        message.setResponse(Coder.code(messageToEncode, key, CoderInstruction.ENCODE));

        return message;
    }
}
