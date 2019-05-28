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
    String request;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String response;
}
