public class ArtistDemo {
    public static void main(String[] args){
    
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();
        
        Singer singer = new Singer("Billie Eilish", "American", 22, "Music", Genre.POP);
        singer.displayInfo();
        System.out.println();
        
        Painter painter = new Painter("Jono Dry", "South African", 35, "Painting", Medium.PENCIL);
        painter.displayInfo();
        System.out.println();

        Writer writer = new Writer("Miguel Sycujo", "Filipino", 48, "Writing", WritingStyle.FICTION);
        writer.displayInfo();
        System.out.println();

        Dancer dancer = new Dancer("AC Bonifacio", "Filipino-Canadian", 21, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();
        System.out.println();

    }
    
}
