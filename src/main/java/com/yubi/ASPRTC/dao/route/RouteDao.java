package com.yubi.ASPRTC.dao.route;

import com.yubi.ASPRTC.model.Route;

import java.util.List;

public interface RouteDao {

    Route addRoute(Route route);

    Route updateRoute(Route route);

    Route deleteRoute(Route route);

    List<Route> findAllRoute();

}
