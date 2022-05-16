package com.example.friendsList.domain.repository;

import com.example.friendsList.domain.entity.FriendEntity;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends CrudRepository<FriendEntity, Integer> {

    @Query("SELECT * FROM friends WHERE id = :id")
    FriendEntity findBy(@Param("id") int id);
}
