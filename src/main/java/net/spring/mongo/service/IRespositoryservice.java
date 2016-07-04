package net.spring.mongo.service;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import net.spring.mongo.pojo.LogTest;
@Service
public interface IRespositoryservice extends MongoRepository<LogTest, Serializable>{

}
