public class DiscJocky {
    
    SongComponent SongList;
    
    public DiscJocky(SongComponent newSongList) {
        SongList = newSongList;
    }

    public void getSongList(){
        SongList.displaySongInfo();
    }



}
