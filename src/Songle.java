import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Songle {
    public static Scanner fileReader;
    public static Scanner sc = new Scanner(System.in);
    public static int cases;
    public static List<String> albumName;
    public static HashMap<String, String> songList = new HashMap<>();
    public static void main(String[] args) throws Exception {
        try{
            fileReader = new Scanner(new FileReader("song_list.dat"));
            cases = Integer.parseInt(fileReader.nextLine());
        }
        catch(FileNotFoundException e){
            System.out.println("cannot find file");
            return;
        }

        readFile();

        //splits all key values (album names) into an array list
        albumName = new ArrayList<>(songList.keySet());

        //while loop and introduction to the game
        //asks the user if they want to play the game or not
        //if they say no, the game ends
        //if they say yes, the game starts and calls method playGame()
        System.out.println("Welcome to Songle!");
        System.out.println("You will be given a random album name and you have to guess the artist name.");
        System.out.println("You can type 'exit' to quit the game at any time.");
        while(true){
            System.out.println("Do you want to play? (yes/no)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("no")){
                System.out.println("Thanks for playing!");
                break;
            }
            else if(input.equalsIgnoreCase("yes")){
                playGame();
            }
            else{
                System.out.println("Invalid input. Please type 'yes' or 'no'.");
            }
        }
        
        

       

    }

    //takes in the file and reads it line by lines
    //splits the line by " @ " and puts the key as the album name and the value as the artist name
    //into the hashmap

    public static void readFile(){
        for(int i = 0; i < cases; i++){
            String line = fileReader.nextLine();
            String[] parts = line.split(" @ ");
            songList.put(parts[0], parts[1]);
        }
    }

    // created a random number to be able to pick a random album name from the list 'abumName'
    //then finds the artist from hashmap 'songList' using the random album name
    //then prints " _ " for each letter in the artist name
    // asks the user to guess and they have 5 guesses
    public static void playGame(){
        //
        int randomIndex = (int) (Math.random() * albumName.size());

        String randomAlbum = albumName.get(randomIndex);

        String albumArtist = songList.get(randomAlbum);

        //this stores each character of the artist name in a array to help us with Wordle lettering
        String[] artistNameSplit = albumArtist.split(" ");

        System.out.println("\n\nGuess the artist name: " + randomAlbum);
        for(int i = 0; i < albumArtist.length(); i++){
            System.out.print(" _ ");
        }

        System.out.println("\n\nYou have 5 attempts to guess the artist name.");
        int attempts = 5;
        for(int i = 0; i < attempts; i++){
            System.out.print("Enter here: ");
            String guess = sc.nextLine();
        }

    }
    
}

//TODO:
//1. Use one of the data structures taught to us to store the data of each guess to be then express
//the color of yellow or green.
//2. Create the code for storing each guess and comapring it the actual artist name using aristNameSplit[]
