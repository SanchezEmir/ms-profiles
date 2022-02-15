package com.nttdata.profile.service;

import com.nttdata.profile.entity.SubType;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ISubTypeService {

  public Flux<SubType> findAll();
  
  public Mono<SubType> findById(String id);
  
  public Mono<SubType> create(SubType subType);
  
  public Mono<SubType> update(SubType subType);
  
  public Mono<Boolean> delete(String id);


}
