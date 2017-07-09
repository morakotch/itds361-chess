package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.chess.Color;
import com.directi.training.codesmells.smelly.chess.Position;

public abstract class Bishop extends Piece {

    public Bishop(Color color) {
        super(color, 'b');
    }

    @Override
    public String toString() {
        return "b";
    }
}
