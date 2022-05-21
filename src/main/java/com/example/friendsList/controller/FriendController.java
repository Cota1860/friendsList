package com.example.friendsList.controller;

import com.example.friendsList.app.service.FriendAppService;
import com.example.friendsList.domain.entity.Friend;
import com.example.friendsList.domain.service.FriendDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FriendController {
    private final FriendAppService friendAppService;



    @GetMapping("/friend")
    public Iterable<Friend> get() {
        return friendAppService.getFriendList();
    }

    @GetMapping("/friend/{friendId}")
    public Friend get(@PathVariable("friendId") int friendId) {
        return friendAppService.getFriend(friendId);
    }
}
