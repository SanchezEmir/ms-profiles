package com.nttdata.profile.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.profile.entity.SubType;

public interface ISubTypeRepository extends ReactiveMongoRepository<SubType, String>{

}
