## Songle
Songle is a song guessing game based off the BillBoard Top 100 List
# This code was created by Atharva Srivastava & Veda Rabishanker
Atharva and Veda have contributed both to the coding back end so far and are continuing to work to create the front end development
## resources
used data from BillBoard top 100 albums
https://tldp.org/HOWTO/Bash-Prompt-HOWTO/x329.html for coloring in the terminal


## How To Play
1. When you start the game, you will be asked if you want to play.
2. If you choose "yes," the game will display a random album name.
3. Your task is to guess the artist name associated with the album.
4. You can type "exit" at any time to quit the game.

## Project Structure
- **src/Songle.java**: The main Java file containing the game logic.
- **song_list.dat**: A data file containing album and artist information in the format `Album Name @ Artist Name`.

## Prerequisites 
- Java Development Kit (JDK) installed.
- A Java IDE or text editor (e.g., Visual Studio Code).

## How to Run
1. Clone Git Repo
    ```````
    git clone https://github.com/veda-rabishanker/Songle.git
2. Ensure that you're in the correct file path
        Songle/
        ├── src/
        │   └── Songle.java
        │   └── song_list.dat
        └── README.md
2.Compile the Java file:
    ```````
    javac Songle.java
3. Run the Java file:
    ```````
    java Songle
