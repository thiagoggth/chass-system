package chess;

import boardgame.Piece;

public class ChessPiece extends Piece{
	private Color color;
	private int moveCount;

	// Auto generated getters and setters methods.
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}

	// My personal functions.
	public ChessPosition getChessPosition() {
		return new ChessPosition();
	}

	public boolean isThereOpponentPiece() {
		return false;
	}

	public void incrementMoveCount() {

	}

	public void decrementMoveCount() {

	}

}
