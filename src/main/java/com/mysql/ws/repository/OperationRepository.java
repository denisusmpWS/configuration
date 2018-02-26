package com.mysql.ws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mysql.ws.model.api.OperationResponse;

@Repository
public interface OperationRepository extends CrudRepository<OperationResponse, Integer> {

}
