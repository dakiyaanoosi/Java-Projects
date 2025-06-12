# TicTacToe
A simple yet interactive console-based Tic-Tac-Toe game with Two-Players mode and Single-Player mode with Easy, Hard, and Unbeatable difficulty levels.
### How to Run ?
1. Clone the repository :
```
 git clone https://github.com/dakiyaanoosi/Java-Projects.git
```
2. Navigate to the repository :
```
 cd Java-Projects
 cd TicTacToe
```
3. Compile all the files :
```
 javac -d . Common.java
 javac -d . SinglePlayer/Easy.java
 javac -d . SinglePlayer/Hard.java
 javac -d . SinglePlayer/Unbeatable.java
 javac -d . TwoPlayers.java
 javac -d . Start.java
```
4. Execute the main file :
```
 java TicTacToe.Start
```

### Features
- Automatically fills the last remaining position
- Easy mode's algorithm : Attempt a winning or blocking move; otherwise, fill a random position.
- Hard mode's algorithm :
  - Ocuupy centre position if available.
  - else attempt a Winning Move.
  - else attempt a Blocking move.
  - else occupy Corner position.
  - else fill any random edge position.
  - Only way to win : try to occupy any three corners in your first three turns : )
- Unbeatable mode : Uses the Minimax algorithm to calculate the best possible move for the computer.