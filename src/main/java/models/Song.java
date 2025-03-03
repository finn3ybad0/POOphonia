package models;

import ui.Message;

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

  public Song(String[] parts) {
    super(  Integer.parseInt(parts[1]), parts[2], Integer.parseInt(parts[3]));
    this.artist = parts[4];
    this.genre =  parts[5];
    this.duration = Integer.parseInt(parts[6]);
  }

  public String getArtist(){
    return this.artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getGenre(){
    return this.genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getDuration(){
    return this.duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public String getCreator(){
    return getArtist();
  }
//    String message = String.format("Playing Song of %d %s by %s",getReleaseYear(),getTitle(),getArtist());
//    Message.send(message);



//    String message = String.format("Pausing Song of %d %s by %s",getReleaseYear(),getTitle(),getArtist());
//    Message.send(message);

//    String message = String.format("Stopping Song of %d %s by %s",getReleaseYear(),getTitle(),getArtist());
//    Message.send(message);


  @Override
  public String toString(){
    return String.format("Podcast{id=%d, title='%s', releaseYear='%s', artist='%s', genre='%s', duration=%d}",getId(),getTitle(),getReleaseYear(),getArtist(),getGenre(),getDuration(),getIsPlaying(),getIsPaused());
  }

  @Override
  public String getInfo() {
    return String.format("Info : [ Artist=%s, Genre=%s, Duration=%ds]",getArtist(),getGenre(),getDuration());
  }

  @Override
  public String toCSV() {
    return String.format("song,%d,%s,%d,%s,%s,%d",getId(),getTitle(),getReleaseYear(),getArtist(),getGenre(),getDuration());
  }

  
}
