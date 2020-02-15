package Lab3GOL;

public class GameOfLife {
    //protected visibility can be accessed any file in the classes
    int size;
    int[][] board;
    int[][] previous;

    public GameOfLife() {
    }

    public GameOfLife(int size) {
        this.size = size;
    }
    public GameOfLife(int[][] a){
        size = a.length;
        board = a;
        previous = a;
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                board[i][j] = a[i][j];
            }
        }

    }


    public int[][] getBoard() {
        return board;
    }
    public void oneStep(){
        // the rules

        for(int i = 0;  i< previous.length; i++){
            for(int j = 0; j <previous[0].length; j++){
                if((neighbors(i,j) ==3) || (neighbors(i,j) == 2 && previous[i][j] == 1)){

                    board[i][j] = 1;
                }
                else{
                    board[i][j] = 0;
                }
                System.out.print(previous[i][j]);
            }
            System.out.println("");
        }

    }
    public int neighbors(int rowI, int colI){
        int counter = 0;
        if(rowI == 0 && colI == 0) {
            if (previous[rowI][colI + 1] == 1) {
                counter++;
            }
            if(previous[rowI + 1][ colI] == 1){
                counter++;
            }
            if(previous[rowI + 1][colI + 1]  == 1)
                counter++;
        }
        else if(rowI == 0 && colI == (size - 1) ) {
            if (previous[rowI][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI + 1][colI] == 1){
                counter++;
            }
            if(previous[rowI + 1][colI - 1] == 1){
                counter++;
            }
        }
        else if(rowI == (size - 1) && colI == 0){
            if(previous[rowI - 1][colI] == 1){
                counter++;
            }
            if(previous[rowI - 1][colI + 1] == 1){
                counter++;
            }
            if(previous[rowI][colI + 1] == 1) {
                counter++;
            }
        }
        else if(rowI == (size - 1) && colI == (size - 1)){
            if(previous[rowI - 1][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI - 1][colI] == 1){
                counter++;
            }
            if(previous[rowI][colI - 1] == 1){
                counter++;
            }
        }
        else if (rowI == 0) {
            if(previous[rowI][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI][colI + 1] == 1){
                counter++;
            }
            if(previous[rowI + 1][colI] == 1){
                counter++;
            }
            if(previous[rowI + 1][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI + 1][colI + 1] == 1) {
                counter++;
            }
        }
        else if(rowI == (size - 1)){
            if(previous[rowI][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI][colI + 1] == 1){
                counter++;
            }
            if(previous[rowI - 1][colI] == 1){
                counter++;
            }
            if(previous[rowI - 1][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI - 1][colI + 1] == 1) {
                counter++;
            }
        }
        else if(colI == 0){
            if(previous[rowI- 1][colI] == 1){
                counter++;
            }
            if(previous[rowI + 1][colI ] == 1){
                counter++;
            }
            if(previous[rowI - 1][colI + 1] == 1){
                counter++;
            }
            if(previous[rowI][colI + 1] == 1){
                counter++;
            }
            if(previous[rowI + 1][colI + 1] == 1) {
                counter++;
            }

        }
        else if(colI == (size - 1)){
            if(previous[rowI - 1][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI - 1][colI] == 1){
                counter++;
            }
            if(previous[rowI][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI + 1][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI + 1][colI] == 1) {
                counter++;
            }
        }
        else{
            if(previous[rowI - 1][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI - 1][colI] == 1){
                counter++;
            }
            if(previous[rowI -1][colI + 1] == 1){
                counter++;
            }
            if(previous[rowI][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI][colI + 1] == 1) {
                counter++;
            }
            if(previous[rowI + 1][colI - 1] == 1){
                counter++;
            }
            if(previous[rowI + 1 ][ colI] == 1){
                counter++;
            }
            if(previous[rowI + 1][colI + 1] == 1){
                counter++;
            }
        }


        return counter;
    }

    public void evolution(int steps){
        for(int i = 0; i < steps; ++i){
            oneStep();
        }
    }
}
