package chess;

import boardgame.Position;

public class ChessPosition {
	private char column;
	private int row;

	// Auto generated getters and setters.
	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	// My personal functions.
	public Position toPosition() {
		return new Position();
	}

	public ChessPosition fromPosition(Position position) {
		return new ChessPosition();
	}
}
