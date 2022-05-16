package com.example.friendsList.controller;

import com.example.friendsList.domain.entity.FriendEntity;
import com.example.friendsList.domain.service.service.FriendService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FriendController {
    private final FriendService friendService;

    @GetMapping("/friend")
    public Iterable<FriendEntity> get() {
        return friendService.findAll();
    }

    @GetMapping("/friend/{id}")
    public FriendEntity get(@PathVariable("id") int id) {
        return friendService.findBy(id);
    }
}
