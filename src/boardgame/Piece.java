package boardgame;

public class Piece {

    protected Board board;
    private Position position;

    public Piece(Board board){
        this.board = board;
        this.position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
