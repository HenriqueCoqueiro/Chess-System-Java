package boardgame;

public abstract class  Piece {

    private Board board;
    protected Position position;

    public Piece(Board board){
        this.board = board;
        this.position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMovies();

    public boolean posibleMovie(Position position){
        return possibleMovies()[position.getRow()][position.getColum()];

    }

    public boolean isThereAnyPosibleMovie(Position position){
        boolean[][] mat = possibleMovies();
        for (int i=0; i<possibleMovies().length; i++){
            for (int j=0; j<possibleMovies().length; i++){
                if (mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }


}
