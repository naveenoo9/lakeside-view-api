package com.practice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.models.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long> {

}
