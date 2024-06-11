package com.practice.models;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked = false;
    private Blob roomPhoto;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "room")
    private List<BookedRoom> bookings;

    public Room() {
        this.bookings = new ArrayList<BookedRoom>();
    }

    public void addBookings(BookedRoom booking) {
        if (bookings == null)
            bookings = new ArrayList<BookedRoom>();
        bookings.add(booking);
        booking.setRoom(this);
        isBooked = true;
        // String bookingCode = UUID.randomUUID().toString();
        booking.setBookingConfirmationCode(UUID.randomUUID().toString());
    }
}
