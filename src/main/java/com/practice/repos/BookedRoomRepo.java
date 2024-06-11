package com.practice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.models.BookedRoom;

@Repository
public interface BookedRoomRepo extends JpaRepository<BookedRoom, Long> {

}
