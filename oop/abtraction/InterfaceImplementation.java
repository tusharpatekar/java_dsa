package oop.abtraction;

public class InterfaceImplementation {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        King k = new King();
        k.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen moves in multiple direction");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("King moves in multiple direction by 1");
    }
}