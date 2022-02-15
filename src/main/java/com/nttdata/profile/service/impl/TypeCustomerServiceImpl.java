package com.nttdata.profile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.profile.entity.SubType;
import com.nttdata.profile.entity.TypeCustomer;
import com.nttdata.profile.repository.ITypeCustomerRepository;
import com.nttdata.profile.service.ITypeCustomerService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TypeCustomerServiceImpl implements ITypeCustomerService{
  
  @Autowired
  ITypeCustomerRepository repo;

  @Autowired
  SubTypeServiceImpl subTypeServiceImpl;

  @Override
  public Flux<TypeCustomer> findAll() {
    return repo.findAll();
  }

  @Override
  public Mono<TypeCustomer> findById(String id) {
    return repo.findById(id);
  }

  @Override
  public Mono<TypeCustomer> create(TypeCustomer typeCustomer) {
    return repo.save(typeCustomer);
  }

  @Override
  public Mono<TypeCustomer> update(TypeCustomer typeCustomer) {
    return repo.save(typeCustomer);
  }

  @Override
  public Mono<Boolean> delete(String id) {
    return repo.findById(id)
        .flatMap(tc -> repo.delete(tc)
            .then(Mono.just(Boolean.TRUE)))
        .defaultIfEmpty(Boolean.FALSE);
  }

  @Override
  public Mono<SubType> checkSubType(String id) {
    return subTypeServiceImpl.findById(id);
  }

}
