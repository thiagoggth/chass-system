package chess;

public class ChessMatch {
	private int turn;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;

	// Auto genetarated getters and setters.
	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public boolean isCheckMate() {
		return checkMate;
	}

	public void setCheckMate(boolean checkMate) {
		this.checkMate = checkMate;
	}

	public ChessPiece getEnPassantVulnerable() {
		return enPassantVulnerable;
	}

	public void setEnPassantVulnerable(ChessPiece enPassantVulnerable) {
		this.enPassantVulnerable = enPassantVulnerable;
	}

	public ChessPiece getPromoted() {
		return promoted;
	}

	public void setPromoted(ChessPiece promoted) {
		this.promoted = promoted;
	}

	// My personal functions.

	// Most to be array.
	public ChessPiece getPieces() {
		return new ChessPiece();
	}

	// Most to be array.
	public boolean possibleMoves() {
		return false;
	}

	public ChessPosition performChessMoven(ChessPosition sourPosition, ChessPosition targetPosition) {
		return new ChessPosition();
	}
}
