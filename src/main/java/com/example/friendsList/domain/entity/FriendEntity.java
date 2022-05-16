package com.example.friendsList.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("FRIENDS")
public class FriendEntity {

    @Id
    private final int id;
    private String name;
    private int birthday;
    private String food;
    private String animal;
    private String comment;
}
