public class SongListGenerator {
    public static void main(String[] args) {
        
        SongComponent industrialMusic=new SongGroup("Industrial", "elements of hardcore punk rock, heavy metal, electronic music, and propulsive club beats.");
        SongComponent heavyMealMusic=new SongGroup("Heavy Metal", "genre of rock music that developed in the late 1960s and early 1970s, largely in the United Kingdom and United States.");
        SongComponent dupStepMusic=new SongGroup("Dupstep", "genre of electronic dance music that originated in South London in the early 2000s. ");


        SongComponent everySong=new SongGroup("Song List", "Every Song Available");  

        everySong.add(industrialMusic);

        industrialMusic.add(new Songs("Head like a Hole", "NIN", 1990));
        industrialMusic.add(new Songs("Head Hunter", "Front 242", 1988));

        industrialMusic.add(dupStepMusic);

        everySong.add(heavyMealMusic);

        heavyMealMusic.add(new Songs("hawa hawa", "Hassan Jhangir", 1987));
        heavyMealMusic.add(new Songs("Girl You're My Chammak Challo", "Akon", 2011));


        DiscJocky crazyLarry=new DiscJocky(everySong);

        crazyLarry.getSongList();


    }
}
