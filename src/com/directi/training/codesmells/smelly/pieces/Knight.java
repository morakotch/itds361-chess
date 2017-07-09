package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.chess.Color;
import com.directi.training.codesmells.smelly.chess.Position;

public abstract class Knight extends Piece {
    public Knight(Color color) {
        super(color, 'k');
    }

    @Override
    public String toString() {
        return "k";
    }
}
