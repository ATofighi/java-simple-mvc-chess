package Chess.Models.Pieces;

import Chess.Models.Interfaces.PieceInterface;

public class Rook extends Piece implements PieceInterface {
    protected Type type = Type.QUEEN;

    public boolean canMove(int x, int y){
        Position pos = this.getPosition();
        return (x == pos.x || y == pos.y);
    }



}
