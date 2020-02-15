package Lab3GOL;

public class TorusGameOfLife extends GameOfLife {
    public int[][] getBoard(){
        return board;
    };

    //constructors
    public TorusGameOfLife() {
    }

    public TorusGameOfLife(int size) {
        this.size = size;
    }

    public TorusGameOfLife(int[][] a) {
        size = a.length;
        board = a;
        previous = a;
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                board[i][j] = a[i][j];
                previous[i][j] = a[i][j];
            }
        }
    }

    //inherit neighbors, oneStep and evolution
    public void oneStep(){
        // the rules

        for(int i = 0;  i< board.length; i++){
            for(int j = 0; j <board[0].length; j++){
                if((neighbors(i,j) ==3)){

                    board[i][j] = 1;
                }
                else if( (neighbors(i,j) == 2 && previous[i][j] == 1)){
                    board[i][j] = 1;
                }
                else {
                    board[i][j] = 0;
                }
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        for(int i = 0; i <board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                previous[i][j] = board[i][j];
            }
        }
    }


   @Override
    public  int neighbors(int rowI, int colI) {
        int counter = 0;
       int rowUp = (rowI - 1 + size ) % size;
       int rowDown = (rowI + 1 + size)  % size;
        int colLeft = (colI - 1 + size) % size;
        int colRight = (colI + 1 + size) % size;
        if(previous[rowUp][colLeft] == 1){
            counter++;
        }
        if(previous[rowI][colRight] == 1){
            counter++;
        }
        if(previous[rowUp][colI] == 1){
            counter++;
        }
        if(previous[rowUp][colRight] == 1) {
            counter++;
        }
        if(previous[rowDown][colRight] == 1) {
            counter++;
        }
        if(previous[rowDown][colLeft] == 1){
            counter++;
        }
        if(previous[rowI][colLeft] == 1){
           counter++;
        }
        if(previous[rowDown][colI] == 1){
           counter++;
        }

    return counter;
    }
    public void evolution(int steps){
        for(int i = 0; i < steps; ++i){
            oneStep();
        }
    }
}

