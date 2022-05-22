package com.example.friendsList.controller;

import com.example.friendsList.app.dto.msg.AddFriendReqMsg;
import com.example.friendsList.app.dto.msg.EditFriendReqMsg;
import com.example.friendsList.app.service.FriendAppService;
import com.example.friendsList.domain.entity.Friend;
import com.example.friendsList.domain.service.FriendDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FriendController {
    private final FriendAppService friendAppService;



    @GetMapping("/friend")
    @ResponseBody
    public Iterable<Friend> get() {
        return friendAppService.getFriendList();
    }

    @GetMapping("/friend/{friendId}")
    @ResponseBody
    public Friend get(@PathVariable("friendId") int friendId) {
        return friendAppService.getFriend(friendId);
    }

    @PostMapping("/friend/add")
    @ResponseBody
    public void addFriend(@RequestBody AddFriendReqMsg reqMsg) {
        friendAppService.addFriend(reqMsg);
    }

    @PostMapping("/friend/{friendId}/edit")
    @ResponseBody
    public void editFriend(@PathVariable int friendId, @RequestBody EditFriendReqMsg reqMsg) { friendAppService.editFriend(friendId,reqMsg); }

    @DeleteMapping("/friend/{friendId}")
    @ResponseBody
    public void deleteFriend(@PathVariable int friendId) {
        friendAppService.deleteFriend(friendId);
    }
}
