package com.example.friendsList.domain.repository;

import com.example.friendsList.domain.entity.Friend;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends CrudRepository<Friend, Integer> {

    @Query("SELECT * FROM friends WHERE friend_id = :friendId")
    Friend findBy(@Param("friendId") int friendId);
}
