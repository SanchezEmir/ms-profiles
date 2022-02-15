package com.nttdata.profile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.profile.entity.SubType;
import com.nttdata.profile.repository.ISubTypeRepository;
import com.nttdata.profile.service.ISubTypeService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class SubTypeServiceImpl implements ISubTypeService {

  @Autowired
  ISubTypeRepository repo;

  @Override
  public Flux<SubType> findAll() {
    return repo.findAll();
  }

  @Override
  public Mono<SubType> findById(String id) {
    log.info("Buscando subtype por id");
    return repo.findById(id);
  }

  @Override
  public Mono<SubType> create(SubType subType) {
    log.info("Creado");
    return repo.save(subType);
  }

  @Override
  public Mono<SubType> update(SubType subType) {
    log.info("Actualizando");
    return repo.save(subType);
  }

  @Override
  public Mono<Boolean> delete(String id) {
    log.info("eliminando subtype");
    return repo.findById(id)
        .flatMap(st -> repo.delete(st).then(Mono.just(Boolean.TRUE)))
        .defaultIfEmpty(Boolean.FALSE);
  }

}
