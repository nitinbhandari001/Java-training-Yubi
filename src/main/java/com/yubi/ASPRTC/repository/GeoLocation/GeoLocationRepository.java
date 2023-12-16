package com.yubi.ASPRTC.repository.GeoLocation;

import com.yubi.ASPRTC.model.Geolocation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoLocationRepository extends MongoRepository<Geolocation, String> {
    Geolocation findByName(String name);

}
