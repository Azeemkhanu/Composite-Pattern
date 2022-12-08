import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {

    ArrayList songComponents= new ArrayList<>();

    String groupName;
    String groupDescription;

    

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {return groupName;}
    public String getGroupDescription() {return groupDescription;}


    @Override
    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
        
    }

    @Override
    public void Remove(SongComponent newSongComponent) {
        songComponents.remove(newSongComponent);
    }

    @Override
    public SongComponent getcomponent(int componentIndex) {
        
        return (SongComponent)songComponents.get(componentIndex);
    }

   

    @Override
    public void displaySongInfo() {
        System.out.println("Group Name :"+getGroupName());
        System.out.println("Group Description :"+getGroupDescription());

        Iterator songIterator= songComponents.iterator();

        SongComponent songInfo=(SongComponent) songIterator.next();
        songInfo.displaySongInfo();
        
       

    }

    @Override
    public void getBrandName() {
        // TODO Auto-generated method stub
        super.getBrandName();
    }

    @Override
    public void getRealeaseYear() {
        // TODO Auto-generated method stub
        super.getRealeaseYear();
    }

    @Override
    public void getSongName() {
        // TODO Auto-generated method stub
        super.getSongName();
    }

  




    
}
