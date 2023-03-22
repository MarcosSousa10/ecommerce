package com.unyleya.ecommerce.repository;

import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.unyleya.ecommerce.domain.Produto;

@Repository
public interface UseRepository extends MongoRepository<Produto, String>{


    
}
