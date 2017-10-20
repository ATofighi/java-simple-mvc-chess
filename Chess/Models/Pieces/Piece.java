package Chess.Models.Pieces;

import java.nio.file.attribute.PosixFileAttributes;

public class Piece {
    public class Position {
        public int x;
        public int y;
    }

    public enum Type{KING, QUEEN, ROOKS, KNIGHTS, BISHOPS, PAWNS}

    private Type type;

    public enum Color{BLACK, WHITE}

    private Color color;

    public enum State {NONE, SELECTED, AVALIBLE, DANGER, DANGERED}

    private State state;

    private Position position;


    public void setPosition(int x, int y) {
        this.position.x = x;
        this.position.y = y;
    }

    public void setState(State s) {
        state = s;
    }

    public Position getPosition() {
        return position;
    }

    public State getState() {
        return this.state;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color c) {
        this.color = c;
    }

    public Type getType() {
        return this.type;
    }
}
