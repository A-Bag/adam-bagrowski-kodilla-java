package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;
    Statistics statistics;
    ForumStatistics forumStatistics;

    @Before
    public void beforeEveryTest() {
        statistics = mock(Statistics.class);
        forumStatistics = new ForumStatistics();
        List<String> userNames = generateUserNameList (100);
        when(statistics.getUsersNames()).thenReturn(userNames);
        when(statistics.getCommentsCount()).thenReturn(100);
        when(statistics.getPostsCount()).thenReturn(100);
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsDefault(){
        //Arrange
        String expectedStatistics = "Users count: " + 100 + "\nPosts count: " + 100 + "\nComments count: " + 100 +
                "\nAverage posts count per user: " + "1.00" +
                "\nAverage comments count per user: " + "1.00" +
                "\nAverage comments count per post: " + "1.00";

        //Act
        forumStatistics.calculateAdvStatistics(statistics);

        //Assert
        Assert.assertEquals(expectedStatistics,forumStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvStatisticsPostsCount0(){
        //Arrange
        when(statistics.getPostsCount()).thenReturn(0);
        String expectedStatistics = "Users count: " + 100 + "\nPosts count: " + 0 + "\nComments count: " + 100 +
                "\nAverage posts count per user: " + "0.00" +
                "\nAverage comments count per user: " + "1.00" +
                "\nAverage comments count per post: " + "-1.00";

        //Act
        forumStatistics.calculateAdvStatistics(statistics);

        //Assert
        Assert.assertEquals(expectedStatistics,forumStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvPostCount1000(){
        //Arrange
        when(statistics.getPostsCount()).thenReturn(1000);
        String expectedStatistics = "Users count: " + 100 + "\nPosts count: " + 1000 + "\nComments count: " + 100 +
                "\nAverage posts count per user: " + "10.00" +
                "\nAverage comments count per user: " + "1.00" +
                "\nAverage comments count per post: " + "0.10";

        //Act
        forumStatistics.calculateAdvStatistics(statistics);

        //Assert
        Assert.assertEquals(expectedStatistics,forumStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvStatisticsCommentsCount0(){
        //Arrange
        when(statistics.getCommentsCount()).thenReturn(0);
        String expectedStatistics = "Users count: " + 100 + "\nPosts count: " + 100 + "\nComments count: " + 0 +
                "\nAverage posts count per user: " + "1.00" +
                "\nAverage comments count per user: " + "0.00" +
                "\nAverage comments count per post: " + "0.00";

        //Act
        forumStatistics.calculateAdvStatistics(statistics);

        //Assert
        Assert.assertEquals(expectedStatistics,forumStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvStatisticsCommentsCount10(){
        //Arrange
        when(statistics.getCommentsCount()).thenReturn(10);
        String expectedStatistics = "Users count: " + 100 + "\nPosts count: " + 100 + "\nComments count: " + 10 +
                "\nAverage posts count per user: " + "1.00" +
                "\nAverage comments count per user: " + "0.10" +
                "\nAverage comments count per post: " + "0.10";

        //Act
        forumStatistics.calculateAdvStatistics(statistics);

        //Assert
        Assert.assertEquals(expectedStatistics,forumStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvStatisticsCommentsCount1000(){
        //Arrange
        when(statistics.getCommentsCount()).thenReturn(1000);
        String expectedStatistics = "Users count: " + 100 + "\nPosts count: " + 100 + "\nComments count: " + 1000 +
                "\nAverage posts count per user: " + "1.00" +
                "\nAverage comments count per user: " + "10.00" +
                "\nAverage comments count per post: " + "10.00";

        //Act
        forumStatistics.calculateAdvStatistics(statistics);

        //Assert
        Assert.assertEquals(expectedStatistics,forumStatistics.showStatistics());
    }

    @Test
    public void testCalculateAdvStatisticsUsersCount0(){
        //Arrange
        List<String> userNames = generateUserNameList (0);
        when(statistics.getUsersNames()).thenReturn(userNames);
        String expectedStatistics = "Users count: " + 0 + "\nPosts count: " + 100 + "\nComments count: " + 100 +
                "\nAverage posts count per user: " + "-1.00" +
                "\nAverage comments count per user: " + "-1.00" +
                "\nAverage comments count per post: " + "1.00";

        //Act
        forumStatistics.calculateAdvStatistics(statistics);

        //Assert
        Assert.assertEquals(expectedStatistics,forumStatistics.showStatistics());
    }

    public List<String> generateUserNameList (int numberOfUsers) {
        List<String> userNames = new ArrayList<>();
        for(int i=0; i<numberOfUsers; i++){
            userNames.add("name" + i);
        }
        return userNames;
    }
}