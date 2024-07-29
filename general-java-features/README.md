
---

## **Java - features and studies**

---

#### **TO STUDY**

---

- [ ] CompletableFuture.runAsync() and CompletableFuture.allOf()


---

#### **LEARNED**

---

##### Solution to operate over a null list using streams

```java
public static void main(String[] args) {

        ModelMapper modelMapper = new ModelMapper();

        var listaVemDoBanco = new ArrayList<DeviceFromBD>();
        listaVemDoBanco.add(new DeviceFromBD("5"));
        listaVemDoBanco.add(new DeviceFromBD("8"));
        listaVemDoBanco.add(new DeviceFromBD("2"));

        var listaDaRequest = new DeviceToNotDelete();
        listaDaRequest.setDevicesToNotDelete(Arrays.asList("1", "2", "3", "4"));

        //test cases
        listaDaRequest.setDevicesToNotDelete(new ArrayList<>());
        listaDaRequest.setDevicesToNotDelete(null);

        var paraDeletar =
                listaVemDoBanco
                .stream()
                .filter(banco -> emptyIfNull(listaDaRequest.getDevicesToNotDelete()).stream().noneMatch(request -> banco.getDeviceId().equals(request)))
                .map(banco -> modelMapper.map(banco, DeviceFromBDMapped.class))
                .collect(Collectors.toList());

        paraDeletar.forEach(
                deletei -> System.out.println("DELETEI: " + deletei)
        );
    }
```
https://www.baeldung.com/java-null-safe-streams-from-collections

---

##### Become the spring endpoint async

https://medium.com/@basecs101/spring-boot-async-annotation-make-api-calls-asynchronous-2024-latest-dcce878d0fe2

https://howtodoinjava.com/spring-boot/spring-async-completablefuture/

exceptions: https://www.baeldung.com/spring-async

---

##### Use distinctByKey to filter for specific fields, with no repetitions

https://howtodoinjava.com/java8/java-stream-distinct-examples/

---

##### How to test logs in Junit 5

https://stackoverflow.com/questions/42766017/how-to-test-logging-in-junit5

---

##### Using AWS SDK 2.x for java

https://github.com/awsdocs/aws-doc-sdk-examples/tree/main/javav2/example_code

---

##### @CreatedDate / @EnableJdbcAuditing

Utilizado para injetar a data corrente da criação de uma entidade

---

##### Using @ConfigurationProperties instead of @Value

https://medium.com/@mikael_55667/why-you-should-stop-using-value-annotations-in-spring-and-use-this-instead-2c8a47e5096a


---

##### Extract key/value from raw string

TBD

---

##### Why not use @Autowired?

Uma forma recomendada de implementar dependências em um projeto é utilizar o construtor sempre que possível. Existem várias razões para isso:

1. Imutabilidade: Utilizando o construtor, é possível marcar os atributos como finais, garantindo que eles não serão alterados após a inicialização.
2. Performance: No Spring, a injeção de dependência via construtor permite uma instanciação direta, sem a necessidade de usar Java Reflection para alterar o acesso dos campos e realizar a injeção. Isso resulta em uma melhor performance.
3. Clareza nas Dependências: Receber dependências pelo construtor torna mais evidente as relações de dependência dentro do código, independentemente do uso de Inversão de Controle (IoC).
4. Facilidade nos Testes: Com o construtor, é mais fácil implementar testes de unidade e integração, pois é possível passar mocks ou stubs diretamente, substituindo as dependências reais.

Para ilustrar esses conceitos, há dois vídeos que mostram cenários práticos:

- https://www.youtube.com/watch?v=fUsKNjGO4Is
- https://www.youtube.com/watch?v=aX-bgylmprA 

---

##### Access each metric in Spring Actuator

- Properties: `management.endpoints.web.exposure.include=health,info,metrics,prometheus`
- Access by metrics: http://localhost:8081/actuator/metrics/metric
- Access by prometheus: http://localhost:8081/actuator/prometheus
 
https://medium.com/javarevisited/unlocking-precision-metrics-in-spring-boot-with-micrometer-a-comprehensive-guide-6d72d6eaaf00 

---