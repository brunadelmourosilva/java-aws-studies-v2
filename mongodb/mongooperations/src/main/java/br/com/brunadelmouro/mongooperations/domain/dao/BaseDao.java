package br.com.brunadelmouro.mongooperations.domain.dao;

import br.com.brunadelmouro.mongooperations.domain.models.Integrante;

import java.util.Set;

public interface BaseDao {

    void insertDataOnCollection(Set<Integrante> integrantes);
}
