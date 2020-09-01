package boardgame;

public class Piece {
	private Position position;

	// Auto generate getters and setters.
	public void setPosition(Position position) {
		this.position = position;
	}

	// My personal functions
	public boolean possibleMoves() {
		return false;
	}

	// The return mast be a array
	public boolean possivleMoves(Position position) {
		return false;
	}

	public boolean isThereAnyPossibleMoven() {
		return false;
	}

	public Position getPosition() {
		return position;
	}

}
