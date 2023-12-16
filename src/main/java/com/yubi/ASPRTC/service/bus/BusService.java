package com.yubi.ASPRTC.service.bus;

import com.yubi.ASPRTC.model.Bus;

import java.util.List;

public interface BusService {

    List<Bus> getAllBus();

    Bus addBus(Bus bus) throws Exception;

    Bus updateBus(Bus bus, String id) throws Exception;

    String getREgNoById(String Id);
}
