package com.nttdata.profile.entity;

import javax.validation.Valid;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nttdata.profile.entity.enums.ESubType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "subType")
@AllArgsConstructor
@NoArgsConstructor
public class SubType {

  @Id
  private String id;

  @Valid
  private ESubType value;


}
