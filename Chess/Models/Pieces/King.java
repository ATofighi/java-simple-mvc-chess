package Chess.Models.Pieces;

import Chess.Models.Interfaces.PieceInterface;

public class King extends Piece implements PieceInterface {
    protected Type type = Type.KING;

    public boolean canMove(int x, int y){
        Position pos = this.getPosition();
        return (Math.abs(x-pos.x) <= 1 && Math.abs(y-pos.y) <= 1);
    }



}
