package Chess.Models.Pieces;

import Chess.Models.Interfaces.PieceInterface;

public class Bishop extends Piece implements PieceInterface {
    protected Type type = Type.QUEEN;

    public boolean canMove(int x, int y){
        Position pos = this.getPosition();
        return (Math.abs(x-pos.x) == Math.abs(y-pos.y));
    }



}
