package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMacth;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMacth chessMatch = new ChessMacth();

		while (true) {
			try {
				UI.clearScree();
				UI.printBoard(chessMatch.getPiece());
				System.out.println();
				System.out.println("source: ");
				ChessPosition source = UI.readChessPosition(sc);
	
				System.out.println();
				System.out.println("target: ");
				ChessPosition target = UI.readChessPosition(sc);
	
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch(ChessException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}