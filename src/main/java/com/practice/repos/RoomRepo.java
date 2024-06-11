package com.practice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.models.Room;

public interface RoomRepo extends JpaRepository<Room, Long> {

}
