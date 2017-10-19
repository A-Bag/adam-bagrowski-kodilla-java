package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final int birthYear;
    private final int birthMonth;
    private final int birthDay;
    private final LocalDate birthDate;
    private final int postCount;

    public ForumUser(final int userId, final String userName, final char userSex,
                     final int birthYear, final int birthMonth, final int birthDay, final int postCount) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.postCount = postCount;
        this.birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }
}
