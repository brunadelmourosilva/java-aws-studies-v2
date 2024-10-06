package br.com.brunadelmouro.userfactorybean.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true) // This will include fields from the parent class in the output
@JsonTypeName(value = "ADMIN")
public class AdminDeletionMessage extends DeletionMessage {
    private String adminId;
}
