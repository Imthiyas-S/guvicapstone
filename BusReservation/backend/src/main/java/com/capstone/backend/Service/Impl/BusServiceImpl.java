package com.capstone.backend.Service.Impl;

import com.capstone.backend.Entity.Bus;
import com.capstone.backend.Repository.BusRepository;
import com.capstone.backend.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private BusRepository busRepository;
    @Override
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }
}
