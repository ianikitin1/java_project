package main.lab_1.task_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {
    Triangle tria = new Triangle();
    @Test
    public void checkArea1(){
        Assert.assertEquals(3, tria.getArea(3,2));
    }

    @Test
    public void checkArea2(){
        Assert.assertEquals(14, tria.getArea(7,4));
    }

    @Test
    public void checkArea3(){
        Assert.assertEquals(50, tria.getArea(10,10));
    }

    @Test
    public void checkArea5() {
        Assert.assertNotEquals(10, tria.getArea(3,5));
    }

    @Test
    public void checkArea6() {
        Assert.assertEquals(7.5, tria.getArea(3,5));
    }

    @Test
    public void nextEdgeTest_1() {
        Assert.assertEquals(17, tria.nextEdge(8, 10));
    }

    @Test
    public void nextEdgeTest_2() {
        Assert.assertEquals(11, tria.nextEdge(5, 7));
    }

    @Test
    public void nextEdgeTest_3() {
        Assert.assertEquals(10, tria.nextEdge(9, 2));
    }

    @Test
    public void nextEdgeTest_4() {
        Assert.assertNotEquals(10, tria.nextEdge(1, 2));
    }



}