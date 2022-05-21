package com.example.friendsList.domain.entity;

import java.time.LocalDateTime;


//共通のデータを定義するEntity これをExtendsして使う
public abstract class BaseEntity {

    private boolean deleted;

    //作成者
    private String inputUser;
    private LocalDateTime inputTimeStamp;
    private String updateUser;
    private LocalDateTime updateTimeStamp;
    private long version;
    //コンストラクタ
    protected BaseEntity() {

    }

}
