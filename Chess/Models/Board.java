package Chess.Models;

import Chess.Models.Interfaces.PieceInterface;


public class Board {

    public PieceInterface[][] pieces;

    public enum Turn {WHITE, BLACK}

    private Turn turn;

    public static int n = 8;

    public Board() {
        this.pieces = new PieceInterface[n][n];
        this.turn = Turn.WHITE;
    }

    void move(int x0, int y0, int x1, int y1) {
        // TODO: cell can not be empty
        // TODO: move is ok?
        // TODO: king+castle
        // TODO: En passant
        // TODO: are x0, y0, x1, y1 ok?

        this.pieces[x0][y0].setPosition(x1, y1);
        this.pieces[x1][y1] = this.pieces[x0][y0];
        this.pieces[x0][y0] = null;

        if(this.turn == Turn.BLACK) {
            this.turn = Turn.WHITE;
        }
        else {
            this.turn = Turn.BLACK;
        }
    }

    public Turn getTurn()
    {
        return this.turn;
    }

}
