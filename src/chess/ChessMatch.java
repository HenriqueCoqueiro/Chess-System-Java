package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        this.board = new Board(8, 8);
        initialSetup();

    }

    public ChessPiece[][] getPiece(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i=0; i < board.getRows(); i++){
            for (int j=0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    public void initialSetup (){
        board.placePiece(new Position(2, 1), new Rook(board, Color.WHITE));
        board.placePiece(new Position(0, 4), new King(board, Color.BLACK));
        board.placePiece(new Position(7, 4), new King(board, Color.WHITE));
    }


}
