package net.usermd.czarnowr.cryptography.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String messageToDecode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String messageToEncode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String encodedMessage;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String decodedMessage;
}
