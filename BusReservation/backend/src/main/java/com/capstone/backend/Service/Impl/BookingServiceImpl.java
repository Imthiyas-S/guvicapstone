package com.capstone.backend.Service.Impl;


import com.capstone.backend.Entity.Bookings;
import com.capstone.backend.Model.BookingRequest;
import com.capstone.backend.Repository.BookingRepository;
import com.capstone.backend.config.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl {

    @Autowired
    private BookingRepository bookingRepository;

    public Bookings saveBooking(List<BookingRequest> bookingRequest) {
        String userEmail = JwtAuthenticationFilter.CURRENT_USER;

        Bookings newBookings = new Bookings();
        newBookings.setEmail(userEmail);
        newBookings.setBookingRequests(bookingRequest);
        return bookingRepository.save(newBookings);
    }
}
