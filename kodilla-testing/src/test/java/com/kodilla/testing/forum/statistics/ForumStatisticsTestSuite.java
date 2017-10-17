package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics(){
        //Arrange
        Statistics statistics = mock(Statistics.class);
        List<String> userNames = new ArrayList<>();
        for(int i=0; i<100; i++){
            userNames.add("name" + i);
        }
        when(statistics.getUsersNames()).thenReturn(userNames);
        when(statistics.getCommentsCount()).thenReturn(100);
        when(statistics.getPostsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();
        String expectedStatistics = "Users count: " + 100 + "\nPosts count: " + 1000 + "\nComments count: " + 100 +
                "\nAverage posts count per user: " + "10.00" +
                "\nAverage comments count per user: " + "1.00" +
                "\nAverage comments count per post: " + "0.10";

        //Act
        forumStatistics.calculateAdvStatistics(statistics);

        //Assert
        Assert.assertEquals(expectedStatistics,forumStatistics.showStatistics());
    }
}