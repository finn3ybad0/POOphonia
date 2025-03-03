package models

public class Song extends MusicItem {
    
  private String artist;

  private String genre;

  private int duration;

  public Song(int id,String title,int releaseYear,String artist, String genre, int duration){
    
    super(id,title,releaseYear);
    this.artist = artist;
    this.genre = genre;
    this.duration = duration;
  }

  public String getArtist(){
    return this.artist;
  }

  public String getGenre(){
    return this.genre;
  }

  public int getDuration(){
    return this.duration;
  }

  public void play(){
    
    this.isPlaying = true;

    String message = String.format("Playing Song of %s %s by %s",""+ this.releaseYear,this.title,this.artist);

    Message.send(message);
  }

  public void stop(){

    this.isPlaying = false;

    if (this.isPaused == true){

      this.isPaused = false; // maybe a validation will be needed
    }

    String message = String.format("Stopping Song of %s %s by %s",""+ this.releaseYear,this.title,this.artist);

    Message.send(message);
  }

  public void pause(){
    
    this.isPaused = true;

    String message = String.format("Pausing Song of %s %s by %s",""+ this.r     eleaseYear,this.title,this.artist);

      Message.send(message);
  }


  
}
