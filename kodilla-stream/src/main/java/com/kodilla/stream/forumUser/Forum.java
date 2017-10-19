package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "user1", 'M', 1990,01,11,10));
        usersList.add(new ForumUser(2, "user2", 'F', 1991,02,21,100));
        usersList.add(new ForumUser(3, "user3", 'M', 1992,03,01,1));
        usersList.add(new ForumUser(4, "user4", 'F', 1993,04,10,0));
        usersList.add(new ForumUser(5, "user5", 'M', 1997,05,12,50));
        usersList.add(new ForumUser(6, "user6", 'F', 1998,06,13,2));
        usersList.add(new ForumUser(7, "user7", 'M', 1999,07,14,10));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}
