package com.capstone.backend.Entity;

import com.capstone.backend.Model.BookingRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "bookings")
public class Bookings {

    @Id
    private ObjectId _id;

    private String email;

    private List<BookingRequest> bookingRequests;
}
