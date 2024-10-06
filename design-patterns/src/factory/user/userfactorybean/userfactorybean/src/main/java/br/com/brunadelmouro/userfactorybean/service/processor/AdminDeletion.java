package br.com.brunadelmouro.userfactorybean.service.processor;

import br.com.brunadelmouro.userfactorybean.model.AdminDeletionMessage;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component("ADMIN")
@Log4j2
public class AdminDeletion extends UserDeletion {

  @Override
  void delete() {
    AdminDeletionMessage adminDeletionMessage = getDeletionMessageType();

    log.info("Admin deletion started. Message: {}", adminDeletionMessage.toString());
  }

  /**
   * Util method if the received payload is a raw json because if it comes from controller, then
   * Jackson will already deserialize and identify what is the specified instance class.
   */
  private AdminDeletionMessage getDeletionMessageType() {
    if (deletionMessage instanceof AdminDeletionMessage) {
      return (AdminDeletionMessage) deletionMessage;
    }

    throw new IllegalArgumentException("Deletion message is not of type AdminDeletionMessage");
  }
}
