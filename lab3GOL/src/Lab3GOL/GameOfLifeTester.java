package Lab3GOL;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
public class GameOfLifeTester {



    @Test
    public void GameOfLife2() {//Works
        int[][] a = {{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}};
        int[][] b = {{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}};
        GameOfLife x = new GameOfLife(a);
        x.oneStep();
        assertArrayEquals(b,x.getBoard());
    }
    @Test
    public void neighbors1GOL(){//works
        int[][] a = {{1,1,1},{0,0,0},{1,1,1}};
        int row = 2;
        int col = 2;
        GameOfLife sol = new GameOfLife(a);
        assertEquals(1,sol.neighbors(row, col));
    }
    @Test
    public void neighbors2GOL(){//works
        int[][] a = {{1,1,1},{1,1,1},{1,1,1}};
        int row = 1;
        int col = 1;
        GameOfLife sol = new GameOfLife(a);
        assertEquals(8,sol.neighbors(row, col));
    }
    @Test
    public void neighbors3GOL(){
        int[][] a = {{0,0,0},{0,0,0},{0,0,0}};
        int row = 0;
        int col = 0;
        GameOfLife sol = new GameOfLife(a);
        assertEquals(0,sol.neighbors(row, col));
    }
    @Test
    public void neighbors4GOL(){
        int[][] a = {{1,1,1},{0,1,0},{0,1,1}};
        int row = 1;
        int col = 0;
        GameOfLife sol = new GameOfLife(a);
        assertEquals(4,sol.neighbors(row, col));
    }

    @Test
    public void TorusGameOfLife1() {
        int[][] a = {{0,0,0}, {1, 1, 1}, {0, 0, 0}};
        int[][] b = {{1,1,1},{1,1,1},{1,1,1}};
        TorusGameOfLife x = new TorusGameOfLife(a);
        x.oneStep();
        assertArrayEquals(b, x.getBoard());
    }

    @Test
    public void TorusGameOfLife2() {
        int[][] a = {{0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        int[][] b = {{0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(a);
        x.oneStep();
        assertArrayEquals(b, x.getBoard());
    }
    @Test
    public void TorusGameOfLife3() {
        int[][] a = {{0, 0, 0, 0, 0, 0},
                    {0, 1, 1, 0, 0, 0},
                    {0, 1, 1, 0, 0, 0},
                    {0, 0, 0, 1, 1, 0},
                    {0, 0, 0, 1, 1, 0},
                    {0, 0, 0, 0, 0, 0}};
        int[][] b = {{0, 0, 0, 0, 0, 0},
                    {0, 1, 1, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 0},
                    {0, 0, 0, 1, 1, 0},
                    {0, 0, 0, 0, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(a);
        x.oneStep();
        assertArrayEquals(b, x.getBoard());
    }
    @Test
    public void TorusGameOfLife4() {
        int[][] a = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                    {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                    {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        int[][] b = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(a);
        x.oneStep();
        assertArrayEquals(b, x.getBoard());
    }
    @Test
    public void TorusGameOfLife5() {
        int[][] a = {{1, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 1}};
        int[][] b = {{1, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 1}};
        TorusGameOfLife x = new TorusGameOfLife(a);
        x.oneStep();
        assertArrayEquals(b, x.getBoard());
    }
    @Test
    public void torusNeighbors1(){
        int[][] a = {{0,0,0},{1,1,1},{0,0,0}};
        int row = 0;
        int col = 2;
        TorusGameOfLife sol = new TorusGameOfLife(a);
        assertEquals(3,sol.neighbors(row, col));
    }
    @Test
    public void torusNeighbors2(){
        int[][] b = {{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}};
        int row = 1;
        int col = 2;
        TorusGameOfLife sol = new TorusGameOfLife(b);
        assertEquals(3,sol.neighbors(row, col));
    }
    @Test
    public void torusNeighbors3(){
        int[][] a = {{1,1,1},{1,0,1},{1,1,1}};
        int row = 1;
        int col = 1;
        TorusGameOfLife sol = new TorusGameOfLife(a);
        assertEquals(8,sol.neighbors(row, col));
    }
    @Test
    public void torusNeighbors4(){
        int[][] a = {{0,0,0},{0,0,0},{0,0,0}};
        int row = 0;
        int col = 2;
        TorusGameOfLife sol = new TorusGameOfLife(a);
        assertEquals(0,sol.neighbors(row, col));
    }
    @Test
    public void torusNeighbors5(){
        int[][] a = {{0,0,0},{0,1,0},{0,0,0}};
        int row = 1;
        int col = 1;
        TorusGameOfLife sol = new TorusGameOfLife(a);
        assertEquals(0,sol.neighbors(row, col));
    }
    @Test
    public void evolution(){
        int [][] A = {{0,0,0},
                      {0,1,0},
                      {0,0,0}};
        int [][] B = {{0,0,0},
                    {0,0,0},
                    {0,0,0}};
        TorusGameOfLife x = new TorusGameOfLife(A);
        x.evolution(1);
        assertArrayEquals(B, x.getBoard());
    }
    @Test
    public void evolution1(){
        int [][] A = {{0,0,0,0},
                    {0,1,1,0},
                    {0,1,0,0},
                    {0,0,0,0}};
        int [][] B = {{0,0,0,0},
                    {0,1,1,0},
                    {0,1,1,0},
                    {0,0,0,0}};
        TorusGameOfLife x = new TorusGameOfLife(A);
        x.evolution(11);
        assertArrayEquals(B, x.getBoard());
    }
    @Test
    public void evolution2(){
        int [][] A = {{1,1,1},
                {1,1,1},
                {1,1,1}};
        int [][] B = {{0,0,0},
                {0,0,0},
                {0,0,0}};
        TorusGameOfLife x = new TorusGameOfLife(A);
        x.evolution(1);
        assertArrayEquals(B, x.getBoard());
    }
    @Test
    public void evolution3(){
        int [][] A = {{0,0,0,0},
                    {1,0,0,1},
                    {0,0,0,1},
                    {0,0,0,0}};
        int [][] B = {{0,0,0,0},
                    {1,0,0,1},
                    {1,0,0,1},
                    {0,0,0,0}};
        TorusGameOfLife x = new TorusGameOfLife(A);
        x.evolution(3);
        assertArrayEquals(B, x.getBoard());
    }
    @Test
    public void evolution4(){
        int [][] A = {{1,0,0,0},
                    {0,1,0,0},
                    {0,0,1,0},
                    {0,0,0,0}};
        int [][] B = {{0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}};
        TorusGameOfLife x = new TorusGameOfLife(A);
        x.evolution(2);
        assertArrayEquals(B, x.getBoard());
    }
}
