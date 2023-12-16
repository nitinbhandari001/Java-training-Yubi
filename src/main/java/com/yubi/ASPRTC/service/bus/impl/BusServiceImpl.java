package com.yubi.ASPRTC.service.bus.impl;

import com.yubi.ASPRTC.dao.bus.BusDao;
import com.yubi.ASPRTC.model.Bus;
import com.yubi.ASPRTC.service.bus.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BusServiceImpl implements BusService {

    @Autowired
    BusDao busDao;

    @Override
    public List<Bus> getAllBus() {
        List<Bus> allBus = new ArrayList<>();
        allBus = busDao.findAllBus();
        return allBus;
    }

    @Override
    public Bus addBus(Bus bus) throws Exception {
        return busDao.addBus(bus);
    }

    @Override
    public Bus updateBus(Bus bus, String id) throws Exception{
        return busDao.updateBus(bus, id);
    }

    @Override
    public String getREgNoById(String Id) {
       return busDao.getRegNoById(Id);
    }
}
