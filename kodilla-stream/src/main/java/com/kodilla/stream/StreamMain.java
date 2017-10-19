package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> filteredUsersMap = forum.getUsersList().stream()
                .filter(ForumUser -> ForumUser.getUserSex() == 'M')
                .filter(ForumUser -> ChronoUnit.YEARS.between(ForumUser.getBirthDate(),LocalDate.now(ZoneId.of("Europe/Paris"))) >= 20)
                .filter(ForumUser -> ForumUser.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

        System.out.println("# elements: " + filteredUsersMap.size());
        filteredUsersMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
