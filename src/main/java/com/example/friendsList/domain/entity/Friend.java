package com.example.friendsList.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("FRIENDS")
public class Friend {

    @Id
    private final int friendId;
    private String name;
    private int birthday;
    private String food;
    private String animal;
    private String comment;
}
