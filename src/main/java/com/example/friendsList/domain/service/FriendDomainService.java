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

    public void deleteFriend(int friendId) {
        Friend friend = findBy(friendId);
        friendRepository.delete(friend);
    }

    public void saveNewFriend(String friendName, int birthday, String food, String animal, String comment) {
        Friend newFriend = new Friend(0);
        newFriend.setFriendName(friendName);
        newFriend.setBirthday(birthday);
        newFriend.setFood(food);
        newFriend.setAnimal(animal);
        newFriend.setComment(comment);
        friendRepository.save(newFriend);
    }

    public Friend editFriend(int friendId, String friendName, int birthday, String food, String animal, String comment) {
        Friend friend = findBy(friendId);
        friend.setFriendName(friendName);
        friend.setBirthday(birthday);
        friend.setFood(food);
        friend.setAnimal(animal);
        friend.setComment(comment);
        return friendRepository.save(friend);
    }

    //save, edit, deleteなどもこの後書く

}
