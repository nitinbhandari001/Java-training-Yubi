package com.yubi.ASPRTC.service.geolocation.impl;

import com.yubi.ASPRTC.dao.geolocation.GeoLocationDao;
import com.yubi.ASPRTC.model.Geolocation;
import com.yubi.ASPRTC.service.geolocation.GeoLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GeoLocationServiceImpl implements GeoLocationService {

    @Autowired
    private GeoLocationDao geoLocationDao;
    @Override
    public List<Geolocation> getAllLocation() {
        return geoLocationDao.findAllLocation();
    }

    @Override
    public Geolocation findByName (String name){
        return geoLocationDao.findByName(name);
    }

}
