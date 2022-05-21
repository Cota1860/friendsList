package com.example.friendsList.domain.service;

import com.example.friendsList.domain.entity.Friend;
import com.example.friendsList.domain.repository.FriendRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

//ログを使用できるようにするらしい、
@Slf4j
public class FriendDomainService {
    private final FriendRepository friendRepository;

    public Iterable<Friend> findAll() {
        return friendRepository.findAll();
    }

    public Friend findBy(int friendId) {
        return friendRepository.findBy(friendId);
    }

    //save, edit, deleteなどもこの後書く

}
