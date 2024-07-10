package com.capstone.backend.Service;


import com.capstone.backend.Entity.Bookings;
import com.capstone.backend.Model.BookingRequest;

import java.util.List;

public interface BookingService {
    public Bookings saveBooking(List<BookingRequest> bookingRequest);
}
