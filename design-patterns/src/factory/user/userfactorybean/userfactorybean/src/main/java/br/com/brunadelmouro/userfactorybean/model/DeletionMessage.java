package br.com.brunadelmouro.userfactorybean.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

/** Defines which attribute will be chosen to match the right name from @Type. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true,
    defaultImpl = DeletionMessage.class)

/** Defines an alias name for the specified classes. */
@JsonSubTypes({
  @Type(value = AdminDeletionMessage.class, name = "ADMIN"),
  @Type(value = CustomerDeletionMessage.class, name = "CUSTOMER")
})
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeletionMessage {

  private String id;
  private String type;
}
