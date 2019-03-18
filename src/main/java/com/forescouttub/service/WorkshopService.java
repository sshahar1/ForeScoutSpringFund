package com.forescouttub.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("sigal")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkshopService {

    @Value("${company}")
    String myVal;

    public String fetchMyVal(int x) {
        return myVal + "------" + x;
    }
}
