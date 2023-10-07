package com.thymeleafexample.service;

import com.thymeleafexample.model.entity.Flight;

import java.util.List;

public interface FetchFlightDataInterface {
    List<Flight> fetch();
}
