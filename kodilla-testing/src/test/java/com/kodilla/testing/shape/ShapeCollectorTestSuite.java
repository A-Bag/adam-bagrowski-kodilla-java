package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    ShapeCollector shapeCollector;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        shapeCollector = new ShapeCollector();
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Arrange
        Shape square1 = new Square(5,10);

        //Act
        shapeCollector.addFigure(square1);
        int numberOfFigures = shapeCollector.getFiguresQuantity();

        //Assert
        Assert.assertEquals(1, numberOfFigures);
    }

    @Test
    public void testGetFigure() {
        //Arrange
        Shape square1 = new Square(5,10);
        shapeCollector.addFigure(square1);

        //Act
        Shape retrievedFigure = shapeCollector.getFigure(0);

        //Assert
        Assert.assertEquals(square1, retrievedFigure);
    }

    @Test
    public void testRemoveFigure() {
        //Arrange
        Shape square1 = new Square(5,10);
        shapeCollector.addFigure(square1);

        //Act
        boolean result = shapeCollector.removeFigure(square1);
        int numberOfFigures = shapeCollector.getFiguresQuantity();

        //Assert
        Assert.assertTrue(result);
        Assert.assertEquals(0, numberOfFigures);
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Arrange
        Shape square1 = new Square(5,10);

        //Act
        boolean result = shapeCollector.removeFigure(square1);

        //Assert
        Assert.assertFalse(result);
    }

    @Test
    public void testShowFigures(){
        //Arrange
        Shape square1 = new Square(5,10);
        shapeCollector.addFigure(square1);

        //Act
        String showedFigures = shapeCollector.showFigures();

        //Assert
        Assert.assertEquals(square1 + "/n", showedFigures);
    }

    @Test
    public void testGetFigureOutOfRange() {
        //Arrange

        //Act
        Shape nullFigure = shapeCollector.getFigure(-1);

        //Assert
        Assert.assertEquals(null, nullFigure);
    }
}
