package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "TaskList description";

    @Test
    public void testFindListByName() {
        //Arrange
        TaskList taskList = new TaskList("TaskList1", DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //Act
        List<TaskList> readList = taskListDao.findByListName(listName);

        //Assert
        Assert.assertEquals(1, readList.size());
        Assert.assertEquals(listName, readList.get(0).getListName());

        //CleanUp
        taskListDao.delete(readList.get(0).getId());
    }
}
