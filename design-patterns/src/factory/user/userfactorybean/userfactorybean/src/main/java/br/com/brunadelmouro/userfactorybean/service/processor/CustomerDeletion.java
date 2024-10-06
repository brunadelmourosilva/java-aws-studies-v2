package br.com.brunadelmouro.userfactorybean.service.processor;

import br.com.brunadelmouro.userfactorybean.model.CustomerDeletionMessage;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component("CUSTOMER")
@Log4j2
public class CustomerDeletion extends UserDeletion {

  @Override
  void delete() {
    CustomerDeletionMessage customerDeletionMessage = getDeletionMessageType();

    log.info("Customer deletion started. Message: {}", customerDeletionMessage.toString());
  }

  private CustomerDeletionMessage getDeletionMessageType() {
    if (deletionMessage instanceof CustomerDeletionMessage) {
      return (CustomerDeletionMessage) deletionMessage;
    }

    throw new IllegalArgumentException("Deletion message is not of type CustomerDeletionMessage");
  }
}
