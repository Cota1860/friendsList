package com.example.friendsList.domain.service;

import com.example.friendsList.domain.entity.FriendEntity;
import com.example.friendsList.domain.repository.FriendRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FriendService {
    private final FriendRepository friendRepository;

    public Iterable<FriendEntity> findAll() {
        return friendRepository.findAll();
    }

    public FriendEntity findBy(int id) {
        return friendRepository.findBy(id);
    }

}
