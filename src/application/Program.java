package application;

import chess.ChessMacth;

public class Program {

	public static void main(String[] args) {
		
		ChessMacth chessMatch = new ChessMacth();
		UI.printBoard(chessMatch.getPiece());
		
	}

}
