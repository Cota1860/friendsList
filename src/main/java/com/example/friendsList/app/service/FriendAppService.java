package com.example.friendsList.app.service;


import com.example.friendsList.domain.entity.Friend;
import com.example.friendsList.domain.service.FriendDomainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//エラーが発生したロールバックするようにするTransactional
@Transactional
@RequiredArgsConstructor
//ログを使用
@Slf4j

//ビジネスロジック
//Controllerから呼び出される
//データを処理するときは、DomainServiceを呼び出す

public class FriendAppService {


    private final FriendDomainService friendDomainService;

    public Iterable<Friend> getFriendList() {

        //String userId = SecurityContextUtils.requireUserId();
        //→サンプルアプリでは、ログインしているUserIdを取得し、そのIDに合うTodoを探したりする
        return friendDomainService.findAll();
    }

    public Friend getFriend(int friendId) {
        return friendDomainService.findBy(friendId);
    }
}
