package TicTacToe;

import javax.swing.JOptionPane;

public class Main {

	public static boolean playerTurn = true;
	public static boolean playerWon = false;
	public static boolean playerTwoWon = false;
	public static int licznik;
	public static TicTacToe board = new TicTacToe();

	public static void main(String[] args) {
		if (board.isVisible() == false) {
			board.setVisible(true);
		}
	}
	
	
	public static void checkForWin() {

		licznik++;
		
		if (board.button1.getText().equals("X")) {
			if (board.button4.getText().equals("X")) {
				if (board.button7.getText().equals("X")) {
					playerWon = true;
					playerTwoWon = false;
					JOptionPane.showMessageDialog(null, "Player X Won!");
				}
			}
		}
		if (board.button1.getText().equals("X")) {
			if (board.button2.getText().equals("X")) {
				if (board.button3.getText().equals("X")) {
					playerWon = true;
					playerTwoWon = false;
					JOptionPane.showMessageDialog(null, "Player X Won!");
				}
			}
		}
		if (board.button1.getText().equals("X")) {
			if (board.button5.getText().equals("X")) {
				if (board.button9.getText().equals("X")) {
					playerWon = true;
					playerTwoWon = false;
					JOptionPane.showMessageDialog(null, "Player X Won!");
				}
			}
		}
		if (board.button3.getText().equals("X")) {
			if (board.button5.getText().equals("X")) {
				if (board.button7.getText().equals("X")) {
					playerWon = true;
					playerTwoWon = false;
					JOptionPane.showMessageDialog(null, "Player X Won!");
				}
			}
		}
		if (board.button2.getText().equals("X")) {
			if (board.button5.getText().equals("X")) {
				if (board.button8.getText().equals("X")) {
					playerWon = true;
					playerTwoWon = false;
					JOptionPane.showMessageDialog(null, "Player X Won!");
				}
			}
		}
		if (board.button3.getText().equals("X")) {
			if (board.button6.getText().equals("X")) {
				if (board.button9.getText().equals("X")) {
					playerWon = true;
					playerTwoWon = false;
					JOptionPane.showMessageDialog(null, "Player X Won!");
				}
			}
		}
		if (board.button4.getText().equals("X")) {
			if (board.button5.getText().equals("X")) {
				if (board.button6.getText().equals("X")) {
					playerWon = true;
					playerTwoWon = false;
					JOptionPane.showMessageDialog(null, "Player X Won!");
				}
			}
		}
		if (board.button7.getText().equals("X")) {
			if (board.button8.getText().equals("X")) {
				if (board.button9.getText().equals("X")) {
					playerWon = true;
					playerTwoWon = false;
					JOptionPane.showMessageDialog(null, "Player X Won!");
				}
			}
		}
		if (board.button1.getText().equals("O")) {
			if (board.button4.getText().equals("O")) {
				if (board.button7.getText().equals("O")) {
					playerWon = false;
					playerTwoWon = true;
					JOptionPane.showMessageDialog(null, "Player O Won!");
				}
			}
		}
		if (board.button1.getText().equals("O")) {
			if (board.button2.getText().equals("O")) {
				if (board.button3.getText().equals("O")) {
					playerWon = false;
					playerTwoWon = true;
					JOptionPane.showMessageDialog(null, "Player  O Won!");
				}
			}
		}
		if (board.button1.getText().equals("O")) {
			if (board.button5.getText().equals("O")) {
				if (board.button9.getText().equals("O")) {
					playerWon = false;
					playerTwoWon = true;
					JOptionPane.showMessageDialog(null, "Player O Won!");
				}
			}
		}
		if (board.button3.getText().equals("O")) {
			if (board.button5.getText().equals("O")) {
				if (board.button7.getText().equals("O")) {
					playerWon = false;
					playerTwoWon = true;
					JOptionPane.showMessageDialog(null, "Player O Won!");
				}
			}
		}
		if (board.button2.getText().equals("O")) {
			if (board.button5.getText().equals("O")) {
				if (board.button8.getText().equals("O")) {
					playerWon = false;
					playerTwoWon = true;
					JOptionPane.showMessageDialog(null, "Player O Won!");
				}
			}
		}
		if (board.button3.getText().equals("O")) {
			if (board.button6.getText().equals("O")) {
				if (board.button9.getText().equals("O")) {
					playerWon = false;
					playerTwoWon = true;
					JOptionPane.showMessageDialog(null, "Player O Won!");
				}
			}
		}
		if (board.button4.getText().equals("O")) {
			if (board.button5.getText().equals("O")) {
				if (board.button6.getText().equals("O")) {
					playerWon = false;
					playerTwoWon = true;
					JOptionPane.showMessageDialog(null, "Player O Won!");
				}
			}
		}
		if (board.button7.getText().equals("O")) {
			if (board.button8.getText().equals("O")) {
				if (board.button9.getText().equals("O")) {
					playerWon = false;
					playerTwoWon = true;
					JOptionPane.showMessageDialog(null, "Player O Won!");
				}
			}
		}

		if (licznik == 9){
			
			JOptionPane.showMessageDialog(null, "Its a tie");
			board.setVisible(false);
		}

			if (playerWon == true || playerTwoWon == true) {
				board.setVisible(false);
			}
	}
}
