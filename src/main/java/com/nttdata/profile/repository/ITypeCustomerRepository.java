package com.nttdata.profile.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.profile.entity.TypeCustomer;

public interface ITypeCustomerRepository extends ReactiveMongoRepository<TypeCustomer, String>{

}
