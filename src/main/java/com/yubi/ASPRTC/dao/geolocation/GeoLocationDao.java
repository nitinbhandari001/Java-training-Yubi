package com.yubi.ASPRTC.dao.geolocation;

import com.yubi.ASPRTC.model.Geolocation;

import java.util.List;

public interface GeoLocationDao {

    Geolocation findByName(String name);

    List<Geolocation> findAllLocation();

    String findLocationById(String id);

    String findNameById(String id);

}
