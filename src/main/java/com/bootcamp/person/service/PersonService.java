package com.bootcamp.person.service;

import com.bootcamp.person.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {
    Flux<Person> getPersons();
    Mono<Person> getPerson(String id);
    Mono<Person> registerPerson(Mono<Person> person);
    Mono<Person> updatePerson(String id, Mono<Person> person);
    Mono<Void> removePerson(String id);
}