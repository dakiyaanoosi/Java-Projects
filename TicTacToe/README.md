# TicTacToe
A simple yet interactive console-based Tic-Tac-Toe game with Two-Player mode and Single-Player mode with Easy and Hard difficulty levels.
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
 javac -d . TwoPlayers.java
 javac -d . Start.java
```
4. Execute the main file :
```
 java TicTacToe.Start
```

### Features
- Autofills the last remaining position
- Easy mode's algorithm : Attempt a winning or blocking move; otherwise, fill a random position.
- Hard mode's algorithm :
  - Ocuupy centre position if available.
  - else attempt a Winning Move.
  - else attempt a Blocking move.
  - else occupy Corner position.
  - else fill any random edge position.
  <br>  
  Altough this algorithm is not as efficient as Minimax - it successfully serves it's purpose - i.e. either the Computer Wins or the game ends in a Tie.
