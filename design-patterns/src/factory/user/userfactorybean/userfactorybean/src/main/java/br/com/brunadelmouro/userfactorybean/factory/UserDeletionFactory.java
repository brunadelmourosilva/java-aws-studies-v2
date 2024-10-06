package br.com.brunadelmouro.userfactorybean.factory;

import br.com.brunadelmouro.userfactorybean.service.processor.UserDeletion;

/**
 * Class used to get the specified user deletion instance.
 * */
public interface UserDeletionFactory {

  UserDeletion getInstance(final String userType);
}
