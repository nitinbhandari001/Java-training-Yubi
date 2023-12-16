package com.yubi.ASPRTC.service.geolocation;

import com.yubi.ASPRTC.model.Geolocation;

import java.util.List;

public interface GeoLocationService {

    List<Geolocation> getAllLocation();

    Geolocation findByName(String name);
}
