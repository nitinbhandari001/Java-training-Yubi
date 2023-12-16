package com.yubi.ASPRTC.service.route;

import com.yubi.ASPRTC.model.Route;
import com.yubi.ASPRTC.model.RouteResponse;

import java.util.List;

public interface RouteService {

    Route addRoute(Route route) throws Exception;

    List<RouteResponse> getAllRoute();
}
