package boardgame;

public class Board {
	private int rows;
	private int columns;

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	// Methods of this class.
	public Piece piece(int row, int columns) {
		return new Piece();
	}

	public Piece piece(Position position) {
		return new Piece();
	}

	public void placePiece(Piece piece, Position position) {

	}

	public Piece removePiece(Position position) {
		return new Piece();
	}

	public boolean positionExistis(Position position) {
		return false;
	}

	public boolean thereIsPiece(Position position) {
		return false;
	}

}
