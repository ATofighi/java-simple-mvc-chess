package Chess.Models.Pieces;

import Chess.Models.Interfaces.PieceInterface;

public class Knight extends Piece implements PieceInterface {
    protected Type type = Type.QUEEN;

    public boolean canMove(int x, int y){
        Position pos = this.getPosition();
        int offsetX = Math.abs(x-pos.x);
        int offsetY = Math.abs(y-pos.y);
        return (
                Math.min(offsetX, offsetY) == 1 &&
                Math.max(offsetX, offsetY) == 2
        );
    }



}
