package br.com.brunadelmouro.userfactorybean.service.processor;

import br.com.brunadelmouro.userfactorybean.model.DeletionMessage;

public abstract class UserDeletion {

  DeletionMessage deletionMessage;

  abstract void delete();

  public void process(DeletionMessage message) {
    deletionMessage = message;

    delete();
  }
}
