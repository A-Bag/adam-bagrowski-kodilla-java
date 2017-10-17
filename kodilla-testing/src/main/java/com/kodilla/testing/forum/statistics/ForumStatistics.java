package com.kodilla.testing.forum.statistics;

import java.util.Locale;

public class ForumStatistics {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double avgPostsCountPerUser;
    private double avgCommentsCountPerUser;
    private double avgCommentsCountPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.getUsersNames().size();
        postsCount = statistics.getPostsCount();
        commentsCount = statistics.getCommentsCount();
        avgPostsCountPerUser = usersCount != 0 ? (double)postsCount/usersCount : -1.0;
        avgCommentsCountPerUser = usersCount != 0 ? (double)commentsCount/usersCount : -1.0;
        avgCommentsCountPerPost = usersCount != 0 ? (double)commentsCount/postsCount : -1.0;
    }

    public String showStatistics () {
        String statistics = "Users count: " + usersCount + "\nPosts count: " + postsCount + "\nComments count: " + commentsCount +
                "\nAverage posts count per user: " + String.format(Locale.ROOT,"%.2f", avgPostsCountPerUser) +
                "\nAverage comments count per user: " + String.format(Locale.ROOT,"%.2f", avgCommentsCountPerUser) +
                "\nAverage comments count per post: " + String.format(Locale.ROOT,"%.2f", avgCommentsCountPerPost);
        //System.out.println(statistics);
        return statistics;
    }
}
