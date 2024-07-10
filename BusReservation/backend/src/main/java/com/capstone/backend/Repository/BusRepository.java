package com.capstone.backend.Repository;

import com.capstone.backend.Entity.Bus;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends MongoRepository<Bus, ObjectId> {


}
