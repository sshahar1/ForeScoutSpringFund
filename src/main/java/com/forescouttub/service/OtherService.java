package com.forescouttub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OtherService {

    private final WorkshopService workshopServiceFoo;


    @Autowired
    public OtherService(WorkshopService workshopServiceFoo) {
        this.workshopServiceFoo = workshopServiceFoo;
    }

    public String myFunToTest(int x) {
        return workshopServiceFoo.fetchMyVal(x);
    }
}
