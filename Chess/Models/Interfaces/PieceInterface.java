package Chess.Models.Interfaces;

import Chess.Models.Pieces.Piece.*;

public interface PieceInterface {


    void setPosition(int x, int y);

    void setState(State s);

    Position getPosition();

    State getState();

    Color getColor();

    void setColor(Color c);

    Type getType();

    boolean canMove(int x, int y);


}
