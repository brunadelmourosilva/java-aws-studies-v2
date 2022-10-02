package br.com.brunadelmouro.mongooperations.domain.dao;

import br.com.brunadelmouro.mongooperations.domain.models.Banda;
import br.com.brunadelmouro.mongooperations.domain.models.Integrante;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public class BandaDao {

    MongoOperations mongoOperations;

    public BandaDao(final MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public void insertBandOnCollection(Banda banda) {
        mongoOperations.insert(banda);
    }

    public List<Banda> findBandsByRegexBandName(String nome) {
        var query = new Query();

        if(!nome.isBlank()) query.addCriteria(Criteria.where("nome").regex(nome));

        return mongoOperations.find(query, Banda.class, Banda.class.getSimpleName());
    }

    public List<Banda> findBandsByRegexBandNameAndMembers(String nome, Set<Integrante> integrantes) {
        var query = new Query();

        if(!nome.isBlank()) query.addCriteria(Criteria.where("nome").regex(nome));

        if(!integrantes.isEmpty()) query.addCriteria(Criteria.where("integrantes").in(integrantes)); //um dado na lista satisfaz a condição

        return mongoOperations.find(query, Banda.class, Banda.class.getSimpleName());
    }
}
