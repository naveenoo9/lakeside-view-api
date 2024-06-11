package com.practice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.models.BookedRoom;

public interface BookedRoomRepo extends JpaRepository<BookedRoom, Long> {

}
