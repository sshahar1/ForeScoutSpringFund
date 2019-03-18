package com.forescouttub.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class, SpringExtension.class})
@TestPropertySource("/test.properties")
public class OtherServiceTest {

    @Spy
    private WorkshopService workshopService;

    private OtherService otherService;

    @BeforeEach
    void setUp() {
        otherService = new OtherService(workshopService);
    }

    @Test
    public void myTest() {
//        when(workshopService.fetchMyVal(any())).thenReturn("we rock");
        assertEquals("null------100", otherService.myFunToTest(100));
    }
}