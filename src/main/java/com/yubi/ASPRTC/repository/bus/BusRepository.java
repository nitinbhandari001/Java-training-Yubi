package com.yubi.ASPRTC.repository.bus;

import com.yubi.ASPRTC.model.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusRepository extends MongoRepository<Bus, String> {
    Bus findByRegNumber(String regNumber);
}
