package com.nttdata.profile.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.profile.entity.SubType;
import com.nttdata.profile.service.ISubTypeService;

import io.swagger.annotations.Api;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Api(tags = "Profile API")
@RefreshScope
@RestController
@RequestMapping("/api/v1/profile/subtype")
public class SubTypeController {

  @Autowired
  ISubTypeService service;

  @GetMapping("/list")
  public Flux<SubType> list() {
    return service.findAll();
  }

  @GetMapping("/find/{id}")
  public Mono<SubType> findById(@PathVariable String id) {
    return service.findById(id);
  }

  @PostMapping("/create")
  public Mono<ResponseEntity<SubType>> create(@RequestBody SubType subType) {
    return service.create(subType)
        .map(savedCustomer -> new ResponseEntity<>(savedCustomer,
            HttpStatus.CREATED))
        .onErrorResume(
            t -> Mono.just(new ResponseEntity<>(HttpStatus.NOT_FOUND)));
  }

  @PutMapping("/update")
  public Mono<ResponseEntity<SubType>> update(
      @Valid @RequestBody SubType subType) {
    return service.update(subType)
        .map(savedCustomer -> new ResponseEntity<>(savedCustomer,
            HttpStatus.CREATED))
        .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @DeleteMapping("/delete/{id}")
  public Mono<ResponseEntity<String>> delete(@PathVariable String id) {
    return service.delete(id).filter(st -> st)
        .map(deleteCustomer -> new ResponseEntity<>("Subtype Deleted",
            HttpStatus.ACCEPTED))
        .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

}
