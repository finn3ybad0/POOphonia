package models;

import ui.Message;

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

  @Override
  public void play(){

    this.setIsPlaying(true);
    String message = String.format("Playing Album of %d %s by %s",getReleaseYear(),getTitle(),getArtist());
    Message.send(message);
  }

  @Override
  public void pause(){
    this.setIsPaused(true);
    String message = String.format("Pausing Album of %d %s by %s",getReleaseYear(),getTitle(),getArtist());

    Message.send(message);
  }
  @Override
  public void stop(){
  this.setIsPlaying(false);
  if (this.getIsPaused()){
    this.setIsPaused(false);
  }

  String message = String.format("Stopping Album of %d %s by %s",getReleaseYear(),getTitle(),getArtist());

  Message.send(message);
    
  }

  public void toString(){
    System.out.printf("Album [ID=%d, Title=%s, Release Year=%d, Artist=%s, Number of Tracks=%d, Label=%s]",getId(),getTitle(),getReleaseYear(),getArtist(),getNumberOfTracks(),getLabel());
  }

  @Override
  public String getInfo() {
    return null;
  }

  @Override
  public String toCSV() {
    return String.format("%d,%s,%d,%s,%d,%s",getId(),getTitle(),getReleaseYear(),getArtist(),getNumberOfTracks(),getLabel());
  }



}
