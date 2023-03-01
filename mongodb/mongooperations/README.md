

## Descomplicando a buscas de dados com o MongoDB

Neste tutorial, vamos aprender a utilizar alguns recursos de busca fornecidos pelo projeto 
[Spring Data MongoDB](https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#mongo.query).

Para isso, como referências de exemplo, vamos utilizar o projeto de cadastro de bandas, que encontra-se disponibilizado neste
repositório.

Primeiramente, vamos observar a classe **BandaDao**. Nela, há alguns métodos que realizam diferentes funções, como inserir dados e reallizar
a busca dos mesmos através de recursos, como por exemplo, a busca por regex.

Ademais, através da interface **MongoOperations**, somos capazes de inserir e buscar dados, realizar operações com collections e entre outros.

Vamos analisar o seguinte método ```findBandsByRegexBandName```:

```
public List<Banda> findBandsByRegexBandName(String nome) {
        var query = new Query();

        if(!nome.isBlank()) query.addCriteria(Criteria.where("nome").regex(nome));

        return mongoOperations.find(query, Banda.class, Banda.class.getSimpleName());
}
```

A instância da classe **Query** tem como objetivo, fornecer métodos adicionais para consultas mais detalhadas.
Dessa forma, de acordo com nosso exemplo, queremos procurar os nomes de bandas, através de pequenas partes da 
string fornecida, ou seja, por meio de uma regex. 

Com o método ````addCriteria````, estamos dizendo que, queremos adicionar critérios adicionais à nossa consulta.

Logo após, a classe **Criteria** fornecerá diversos tipos de critérios para realizarmos as buscas. No caso do exemplo,
no trecho de código ````Criteria.where("nome").regex(nome)````, estou dizendo ao MongoDB que, nos documentos presentes,
quero buscar pelo campo **nome**, utilizando o critério de ````regex````.

Por fim, forneceremos ao método ````find```` do MongoOperations, a **query**, contendo todos os critérios adicionados,
a **classe java** referente à entidade e por fim, o **nome da collection** onde as buscas serão feitas.

Vale ressaltar que, além do critério de busca ````regex````, a classe **Criteria** agrega outras funções bem interesantes, 
como por exemplo:
- **lte**: filtragem de valores menores ou iguais ao campo fornecido(_less than or equal_)
- **gte**: filtragem de valores maiores ou iguais ao campo fornecido(_greater than or equal_)

Agora, vamos analisar o seguinte método ```findBySortFields```:

```
public List<Banda> findBySortFields(CampoEnum campoEnum, SortEnum sort) {
        var query = new Query();
        Sort.Direction direction = sort.equals(SortEnum.ASC) ? Sort.Direction.ASC : Sort.Direction.DESC;

        query.with(Sort.by(direction, campoEnum.getCampo()));

        return mongoOperations.find(query, Banda.class, Banda.class.getSimpleName());
}
```

Diferente do método analisado anteriormente, estamos utilizando da classe **Query**, o método ````with````.
Dessa forma, o mesmo fornece critérios de busca referentes à _ordenação_. Sendo assim, estou dizendo no trecho de 
código ````Sort.by(direction, campoEnum.getCampo())```` que de acordo com a direção de escolha(ASC ou DESC), 
quero aplicar isso ao campo escolhido e que, está presente no documento.

Vimos que, o MongoDB oferece inúmeras formas para realizarmos queries detalhadas, através de inúmeros recursos
disponibilizados pela biblioteca!

Para saber mais sobre outros recursos, não deixe de conferir a documentação oficial:
https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#mongo.query

