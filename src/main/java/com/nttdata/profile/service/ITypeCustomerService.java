package com.nttdata.profile.service;

import com.nttdata.profile.entity.SubType;
import com.nttdata.profile.entity.TypeCustomer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITypeCustomerService {
  
  public Flux<TypeCustomer> findAll();

  public Mono<TypeCustomer> findById(String id);
  
  public Mono<TypeCustomer> create(TypeCustomer typeCustomer);

  public Mono<TypeCustomer> update(TypeCustomer typeCustomer);

  public Mono<Boolean> delete(String id);

  public Mono<SubType> checkSubType(String id);

}
