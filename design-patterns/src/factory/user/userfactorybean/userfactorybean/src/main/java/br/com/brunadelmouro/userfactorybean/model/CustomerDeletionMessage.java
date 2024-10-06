package br.com.brunadelmouro.userfactorybean.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true) // This will include fields from the parent class in the output
@JsonTypeName("CUSTOMER")
public class CustomerDeletionMessage extends DeletionMessage {
    private String customerId;
}
