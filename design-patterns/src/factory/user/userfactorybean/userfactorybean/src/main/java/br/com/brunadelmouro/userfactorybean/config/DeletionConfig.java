package br.com.brunadelmouro.userfactorybean.config;

import br.com.brunadelmouro.userfactorybean.factory.UserDeletionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// todo https://www.baeldung.com/spring-factorybean
@Configuration
public class DeletionConfig {

  @Bean("deletionFactory")
  public FactoryBean<Object> serviceLocatorFactoryBean() {
    ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
    factoryBean.setServiceLocatorInterface(UserDeletionFactory.class);

    return factoryBean;
  }
}
