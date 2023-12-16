package com.yubi.ASPRTC.repository.route;

import com.yubi.ASPRTC.model.Route;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RouteRepository extends MongoRepository<Route, String> {
}
