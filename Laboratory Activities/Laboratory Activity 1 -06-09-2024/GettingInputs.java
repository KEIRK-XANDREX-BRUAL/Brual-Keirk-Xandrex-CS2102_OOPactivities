import java.util.Scanner;

 class GettingInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the genre: ");
        String genre = input.next();
        System.out.print("Enter the album: ");
        String album = input.next();
        System.out.print("Enter the song title: ");
        String song = input.next();
        System.out.print("Enter the artist: ");
        String artist = input.next();
        input.close();

        System.out.println("---------------");
        System.out.println("SONG DETAILS");
        System.out.println("---------------");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.print("Title: \"" + song );
        System.out.println("\"");
        System.out.println("Artist: " + artist);
    }
    
}
