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

  @Override
  public void play(){

    this.setIsPlaying(true);
    String message = String.format("Playing Song of %d %s by %s",getReleaseYear(),getTitle(),getArtist());
    Message.send(message);
  }

  @Override
  public void pause(){
    this.setIsPaused(true);
    String message = String.format("Pausing Song of %d %s by %s",getReleaseYear(),getTitle(),getArtist());

    Message.send(message);
  }
  @Override
  public void stop(){
    this.setIsPlaying(false);
    if (this.getIsPaused()){
      this.setIsPaused(false);
    }

    String message = String.format("Stopping Song of %d %s by %s",getReleaseYear(),getTitle(),getArtist());

    Message.send(message);

  }

  public void toString(){
    System.out.printf("Song [ID=%d, Title=%s, Release Year=%d, Artist=%s, Genre=%s, Duration=%d]",getId(),getTitle(),getReleaseYear(),getArtist(),getGenre(),getDuration());
  }

  @Override
  public String getInfo() {
    return null;
  }

  @Override
  public String toCSV() {
    return String.format("%d,%s,%d,%s,%s,%d",getId(),getTitle(),getReleaseYear(),getArtist(),getGenre(),getDuration());
  }

  
}
