package com.nttdata.profile.entity;

import javax.validation.Valid;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nttdata.profile.entity.enums.ETypeCustomer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("type_customer")
@AllArgsConstructor
@NoArgsConstructor
public class TypeCustomer {
  
  @Id
  private String id;

  @Valid
  private ETypeCustomer value;

  private SubType subType;


}
