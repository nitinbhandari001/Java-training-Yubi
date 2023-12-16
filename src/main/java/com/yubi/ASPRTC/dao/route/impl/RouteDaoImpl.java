package com.yubi.ASPRTC.dao.route.impl;

import com.yubi.ASPRTC.dao.route.RouteDao;
import com.yubi.ASPRTC.model.Route;
import com.yubi.ASPRTC.repository.route.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RouteDaoImpl implements RouteDao {

    @Autowired
    RouteRepository routeRepository;
    @Override
    public Route addRoute(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public Route updateRoute(Route route) {
        return null;
    }

    @Override
    public Route deleteRoute(Route route) {
        return null;
    }

    @Override
    public List<Route> findAllRoute() {
        List<Route> allRoutes = new ArrayList<>();
        allRoutes= routeRepository.findAll();
        return allRoutes;
    }
}
