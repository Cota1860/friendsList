package com.example.friendsList.app.dto.msg;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

//Msgは、ユーザーまで渡されたり、ユーザー送られるデータ
//追加されるFriendのデータ（Todoだとタイトルのみ）
public class AddFriendReqMsg {

    private String friendName;
    private int birthday;
    private String food;
    private String animal;
    private String comment;

}
