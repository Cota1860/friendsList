package com.example.friendsList.app.dto;


import com.example.friendsList.domain.entity.Friend;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FriendDto {

    //Entityの中で、ビジネスロジックに必要なデータのみを定義（friendリストの場合は全部だからEntityと変わらない、TodoだとID、タイトル、完了したかどうか、いつ作られたか）
    //ユーザーとやりとりするデータは、さらにMsgで扱う


    private final int friendId;
    private String friendName;
    private int birthday;
    private String food;
    private String animal;
    private String comment;

    public static FriendDto of(Friend friend) {
        return new FriendDto(
                friend.getFriendId(),
                friend.getFriendName(),
                friend.getBirthday(),
                friend.getFood(),
                friend.getAnimal(),
                friend.getComment()
        );
    }
}
