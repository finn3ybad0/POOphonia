package models;

public class Album extends MusicItem {

  private String artist;

  private int numberOfTracks;

  private String label;

  public Album(int id, String title , int releaseYear,String artist,int numberOfTracks,String label) {
    super(id,title,releaseYear);
    this.artist = artist;
    this.numberOfTracks = numberOfTracks;
    this.label = label;
  }

  public String getArtist(){
    return this.artist;
  }

  public int getNumberOfTracks(){
    return this.numberOfTracks;
  }

  public String getLabel(){
    return this.label;
  }

  public void play(){

    this.isPlaying = true;                                                    String message = String.format("Playing Song of %s %s by %s",""+ this.releaseYear,this.title,this.artist);
    Message.send(message);
  }

  public void stop(){
    this.isPlaying = false;
    if (this.isPaused == true){
      this.isPaused = false;
    }

    String message = String.format("Stopping Album of %s %s by %s",""+ this.releaseYear,this.title,this.artist);

    Message.send(message);
    
  }

  public void pause(){
    this.isPaused = true;
    String message = String.format("Pausing Album of %s %s by %s",""+ this.releaseYear,this.title,this.artist);

    Message.send(message);
  }
  

}
