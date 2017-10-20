package Chess.Models.Pieces;

import Chess.Models.Interfaces.PieceInterface;

public class Pawn extends Piece implements PieceInterface {
    protected Type type = Type.QUEEN;

    public boolean canMove(int x, int y){
        Position pos = this.getPosition();
        int offset = 1;
        if(this.getColor() == Color.BLACK) {
            offset = -1;
        }
        return ((pos.x == x+offset) && (y == pos.y || Math.abs(y-pos.y) == 1));
    }



}
