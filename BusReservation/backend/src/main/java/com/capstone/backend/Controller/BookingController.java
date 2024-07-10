package com.capstone.backend.Controller;

import com.capstone.backend.Entity.Bookings;
import com.capstone.backend.Model.BookingRequest;
import com.capstone.backend.Service.Impl.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/save")
public class BookingController {

    @Autowired
    private BookingServiceImpl bookingService;
    @PostMapping("/booking")
    public ResponseEntity<Bookings> saveBooking(@RequestBody List<BookingRequest> bookingRequest){

        Bookings savedBooking = bookingService.saveBooking(bookingRequest);
        return ResponseEntity.ok(savedBooking);

    }
}
