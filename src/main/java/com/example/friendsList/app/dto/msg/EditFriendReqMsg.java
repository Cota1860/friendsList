package com.example.friendsList.app.dto.msg;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//Msgは、ユーザーまで渡されたり、ユーザー送られるデータ
//編集されるFriendのデータ（Todoだとタイトルと完了したかどうか）
public class EditFriendReqMsg {

    private int friendId;
    private String friendName;
    private int birthday;
    private String food;
    private String animal;
    private String comment;
}
