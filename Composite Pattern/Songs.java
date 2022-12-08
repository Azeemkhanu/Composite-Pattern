public class Songs extends SongComponent{
    String songName;
    String brandName;
    int realeaseYear;

    public Songs(String songName, String brandName, int realeaseYear) {
        this.songName = songName;
        this.brandName = brandName;
        this.realeaseYear = realeaseYear;
    }
    
    
    public void displaySongInfo(){
        System.out.println(this.songName+" was recorded by "+this.brandName+" int the year "+this.realeaseYear);
    }


   
    
}
