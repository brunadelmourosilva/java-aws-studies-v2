package br.com.brunadelmouro.mongooperations.domain.dao;

import br.com.brunadelmouro.mongooperations.domain.models.Integrante;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class IntegranteDao {

    MongoOperations mongoOperations;

    public IntegranteDao(final MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public void insertMembersOnCollection(Set<Integrante> integrantes) {
        mongoOperations.insertAll(integrantes);
    }
}
