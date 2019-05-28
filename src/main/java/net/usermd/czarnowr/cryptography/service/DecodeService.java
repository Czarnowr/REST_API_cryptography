package net.usermd.czarnowr.cryptography.service;

import com.google.common.collect.BiMap;
import net.usermd.czarnowr.cryptography.utility.Coder;
import net.usermd.czarnowr.cryptography.utility.CoderInstruction;
import org.springframework.stereotype.Service;

@Service
public class DecodeService {

    public String substituteLetters(String messageToDecode, BiMap<Character, Character> key) {
        return Coder.code(messageToDecode, key, CoderInstruction.DECODE);
    }
}
