package br.com.brunadelmouro.mongooperations;

import br.com.brunadelmouro.mongooperations.domain.dao.BandaDao;
import br.com.brunadelmouro.mongooperations.domain.dao.IntegranteDao;
import br.com.brunadelmouro.mongooperations.domain.enums.CampoEnum;
import br.com.brunadelmouro.mongooperations.domain.enums.SortEnum;
import br.com.brunadelmouro.mongooperations.domain.models.Banda;
import br.com.brunadelmouro.mongooperations.domain.models.Integrante;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
@Slf4j
public class MongoopearationsApplication implements CommandLineRunner {

    /**
     * run docker: sudo docker run -d --rm --name mymongodb -p 27017:27017 mongo
     * create database 'bandas' in MongoDB
     * todo create a readme
     * */

    @Autowired
    BandaDao bandaDao;

    @Autowired
    IntegranteDao integranteDao;

    public static void main(String[] args) {
        SpringApplication.run(MongoopearationsApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        Set<Integrante> insertAllIntegrates = new HashSet<>();

        //integrantes
        var integrante1 = new Integrante("Mick Mars", 57);
        var integrante2 = new Integrante("Thomas Lee", 45);
        var integrante3 = new Integrante("Nick Sixx", 50);
        var integrante4 = new Integrante("Vince Neil", 51);

        var integrante5 = new Integrante("Alx Rose", 55);
        var integrante6 = new Integrante("Slash", 53);
        var integrante7 = new Integrante("Duff McKagan", 57);
        var integrante8 = new Integrante("Steve Adler", 60);

        insertAllIntegrates.add(integrante1);
        insertAllIntegrates.add(integrante2);
        insertAllIntegrates.add(integrante3);
        insertAllIntegrates.add(integrante4);
        insertAllIntegrates.add(integrante5);
        insertAllIntegrates.add(integrante6);
        insertAllIntegrates.add(integrante7);
        insertAllIntegrates.add(integrante8);

        integranteDao.insertMembersOnCollection(insertAllIntegrates);

        //--------------------------------------------------------

        var banda1 = new Banda(
                "Motley Crue",
                "Rock",
                1988,
                Set.of(integrante1, integrante2, integrante3, integrante4));

        var banda2 = new Banda(
                "Guns n Roses",
                "Rock",
                1980,
                Set.of(integrante5, integrante6, integrante7, integrante8));

        var banda3 = new Banda(
                "Sem Integrantes",
                "Jazz",
                1970);

        var banda4 = new Banda(
                "Sem Integrantes 2",
                "Pop",
                1976);

        bandaDao.insertBandOnCollection(banda1);
        bandaDao.insertBandOnCollection(banda2);
        bandaDao.insertBandOnCollection(banda3);
        bandaDao.insertBandOnCollection(banda4);

        // ----------------------------------------------------------
        var gson = new GsonBuilder().setPrettyPrinting().create();

        var result1 = bandaDao.findBandsByRegexBandName("Sem");
        log.info(gson.toJson(result1));

        log.info("\n------------------------------------\n");

        var result2 = bandaDao.findBandsByRegexBandNameAndMembers("Guns", Set.of(integrante1, integrante8));
        log.info(gson.toJson(result2));

        log.info("\n------------------------------------\n");

        var result3 = bandaDao.findBySortFields(CampoEnum.NOME, SortEnum.DESC);
        log.info(gson.toJson(result3));
    }
}
