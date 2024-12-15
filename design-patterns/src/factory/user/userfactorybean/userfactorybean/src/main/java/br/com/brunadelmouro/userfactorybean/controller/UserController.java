package br.com.brunadelmouro.userfactorybean.controller;

import br.com.brunadelmouro.userfactorybean.factory.UserDeletionFactory;
import br.com.brunadelmouro.userfactorybean.model.DeletionMessage;
import br.com.brunadelmouro.userfactorybean.service.processor.UserDeletion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

  private final UserDeletionFactory userDeletionFactory;

  public UserController(UserDeletionFactory userDeletionFactory) {
    this.userDeletionFactory = userDeletionFactory;
  }

  @DeleteMapping("/")
  public ResponseEntity<Void> deleteUser(@RequestBody DeletionMessage deletionMessage) {

    UserDeletion userInstance = userDeletionFactory.getInstance(deletionMessage.getType().toUpperCase());

    userInstance.process(deletionMessage);

    return ResponseEntity.noContent().build();
  }
}
