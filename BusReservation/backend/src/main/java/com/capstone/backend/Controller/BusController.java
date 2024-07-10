package com.capstone.backend.Controller;


import com.capstone.backend.Entity.Bus;
import com.capstone.backend.Service.Impl.BusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusServiceImpl busService;
    @GetMapping("/all")
    public List<Bus> getAllBuses(){
        return busService.getAllBuses();
    }
}
